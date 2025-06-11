package laurriana.time2day.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
