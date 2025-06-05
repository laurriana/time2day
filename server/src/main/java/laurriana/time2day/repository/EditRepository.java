package laurriana.time2day.repository;

import laurriana.time2day.model.Edit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditRepository extends JpaRepository<Edit, Integer> {
    Edit findEditByEditEditor_EditorUsername(String e);
}
