import { Entity, PrimaryGeneratedColumn, Column, ManyToOne, OneToMany } from "typeorm";
import { Fandom } from "./Fandom";
import { Editor } from "./Editor";
import { Style } from "./Style";
import { Comment } from "./Comment";
import { Audio } from "./Audio";
import { Bookmark } from "./Bookmark";

@Entity()
export class Edit {
    @PrimaryGeneratedColumn()
    edit_id: number

    @Column()
    edit_pub: Date

    @ManyToOne(() => Fandom, fandom => fandom.fandom_edits)
    edit_fandom: Fandom

    @ManyToOne(() => Editor, editor => editor.editor_edits)
    edit_editor: Editor

    @ManyToOne(() => Style, style => style.style_edits)
    edit_style: Style

    @Column("json")
    edit_links: string[]

    @Column()
    edit_app: string

    @OneToMany(() => Comment, comment => comment.comment_edit)
    edit_comments: Comment[]

    @ManyToOne(() => Audio, audio => audio.audio_edits)
    edit_audio: Audio


}