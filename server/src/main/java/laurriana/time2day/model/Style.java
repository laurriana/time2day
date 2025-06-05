package laurriana.time2day.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int styleId;

    private String styleName;

    @OneToMany
    private ArrayList<Edit> styleEdits;

    @ManyToMany
    private ArrayList<Editor> styleEditors;

    @ManyToMany
    private ArrayList<Audio> styleAudios;
}
