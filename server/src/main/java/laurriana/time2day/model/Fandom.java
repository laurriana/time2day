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
