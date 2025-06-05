package laurriana.time2day.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Fandom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fandomId;

    private String fandomName;

    private String fandomImg;

    @OneToMany
    private ArrayList<Edit> fandomEdits;

    @ManyToMany
    private ArrayList<Editor> fanodmEditors;

}
