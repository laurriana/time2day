package laurriana.time2day.repository;

import laurriana.time2day.model.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EditorRepository extends JpaRepository<Editor, Integer> {
    Editor findByEditorUsername(String editorUsername);
    Optional<Editor> findEditorByEditorUsername(String editorUsername);
}
