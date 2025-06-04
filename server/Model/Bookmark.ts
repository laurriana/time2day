import { Entity, PrimaryGeneratedColumn, Column, ManyToOne } from "typeorm";
import { Editor } from "./Editor";
import { Audio } from "./Audio";
import { Edit } from "./Edit";

@Entity()
export class Bookmark {
    @PrimaryGeneratedColumn()
    bookmark_id: number;

    @ManyToOne(() => Editor, (editor) => editor.editor_bookmarks)
    bookmark_owner: Editor;

    @ManyToOne(() => Audio, { nullable: true })
    bookmark_audio: Audio;

    @ManyToOne(() => Edit, { nullable: true })
    bookmark_edit: Edit;

    @ManyToOne(() => Editor, { nullable: true })
    bookmark_editor: Editor;
}
