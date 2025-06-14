package laurriana.time2day.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Editor extends User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int editorId;

    private String editorUsername;

    @ManyToMany
    private List<Fandom> editorFandom = new ArrayList<>();

    private String editorName;
    private int editorExperience;

    @OneToMany
    @Transient
    private List<Edit> editorEdits = new ArrayList<>();

    private String editorImg;

    @ElementCollection
    private List<String> editorPlatforms = new ArrayList<>();

    @ManyToMany
    private List<Style> editorStyles = new ArrayList<>();

    private String editorApp;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getUsername() {
        return editorUsername;
    }

}
