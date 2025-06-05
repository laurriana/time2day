package laurriana.time2day.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Edit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int editId;
    private Date editPublication;
    private String editApp;

    @ManyToOne
    private Fandom editFandom;

    @ManyToOne
    private Editor editEditor;

    @ManyToOne
    private Style editStyle;

    @ManyToOne
    private Audio editAudio;

}
