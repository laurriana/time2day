package laurriana.time2day.repository;

import laurriana.time2day.model.Fandom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FandomRepository extends JpaRepository<Fandom, Integer> {
    Fandom findFandomByFandomName(String n);
}
