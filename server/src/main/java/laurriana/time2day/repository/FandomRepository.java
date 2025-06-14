package laurriana.time2day.repository;

import laurriana.time2day.model.Fandom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FandomRepository extends JpaRepository<Fandom, Integer> {
    Fandom findFandomByFandomName(String n);
}
