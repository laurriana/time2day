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
