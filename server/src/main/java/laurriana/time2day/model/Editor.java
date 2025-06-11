package laurriana.time2day.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Editor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int editorId;

    private String editorUsername;

    @ManyToMany
    private ArrayList<Fandom> editorFandom;
    private String editorName;
    private int editorExperience;

    @OneToMany
    private ArrayList<Edit> editorEdits;

    private String editorImg;

    @ElementCollection
    private ArrayList<String> editorPlatforms;

    @ManyToMany
    private ArrayList<Style> editorStyles;

    private String editorApp;
}
