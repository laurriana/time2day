package laurriana.time2day.repository;

import laurriana.time2day.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StyleRepository extends JpaRepository<Style, Integer> {
    Style findStyleByStyleName(String n);
}
