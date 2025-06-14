package laurriana.time2day.service;

import laurriana.time2day.dto.LoginDTO;
import laurriana.time2day.dto.RegistrationDTO;
import laurriana.time2day.model.Editor;
import laurriana.time2day.repository.EditorRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final EditorRepository editorRepository;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationService(EditorRepository editorRepository, AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder) {
        this.editorRepository = editorRepository;
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
    }

    public Editor signup(RegistrationDTO input) {
        Editor editor = new Editor();
        editor.setEditorUsername(input.getUsername());
        editor.setEmail(input.getEmail());
        editor.setPassword(passwordEncoder.encode(input.getPassword()));
       return editorRepository.save(editor);
    }

    public Editor authenticate(LoginDTO loginDTO) {
        try {
            System.out.println("Attempting to authenticate user: " + loginDTO.getUsername());
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginDTO.getUsername(),
                            loginDTO.getPassword()
                    )
            );
            System.out.println("Authentication successful");

            return editorRepository.findEditorByEditorUsername(loginDTO.getUsername())
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        } catch (BadCredentialsException e) {
            System.err.println("Authentication failed: Bad credentials");
            throw new BadCredentialsException("Invalid credentials");
        } catch (Exception e) {
            System.err.println("Authentication failed: " + e.getClass().getName() + " - " + e.getMessage());
            throw e;
        }
    }
    }

