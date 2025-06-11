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
public class Audio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int audioId;

    private int audioDuration;

    private String audioName;

    private String audioCredit;

    private String audioUrl;

    @ManyToMany
    private ArrayList<Style> audioStyles;

    @OneToMany
    private ArrayList<Edit> audioEdits;
}
