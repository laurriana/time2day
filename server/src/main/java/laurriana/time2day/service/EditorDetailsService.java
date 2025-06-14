package laurriana.time2day.service;

import laurriana.time2day.model.Editor;
import laurriana.time2day.repository.EditorRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class EditorDetailsService implements UserDetailsService {
    private final EditorRepository editorRepository;

    public EditorDetailsService(EditorRepository editorRepository) {
        this.editorRepository = editorRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Editor editor = editorRepository.findEditorByEditorUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new org.springframework.security.core.userdetails.User(
                editor.getEditorUsername(),
                editor.getPassword(),
                Collections.emptyList()  // Add authorities if needed
        );
    }
}