package laurriana.time2day.repository;

import laurriana.time2day.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioRepository extends JpaRepository<Audio, Integer> {
    Audio findAudioByAudioCredit(String ac);
}
