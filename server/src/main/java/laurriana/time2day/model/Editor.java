package laurriana.time2day.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
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
