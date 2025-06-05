package laurriana.time2day.repository;

import laurriana.time2day.model.Editor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorRepository extends JpaRepository<Editor, Integer> {
    Editor findEditorByEditorUsername(String u);
}
