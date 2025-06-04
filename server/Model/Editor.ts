import { Entity, PrimaryGeneratedColumn, Column, OneToMany, ManyToMany } from "typeorm";
import { Fandom } from "./Fandom";
import { Edit } from "./Edit";
import { Style } from "./Style";
import { Comment } from "./Comment";
import { Bookmark } from "./Bookmark";

@Entity()
export class Editor {
    @PrimaryGeneratedColumn()
    editor_id: number

    @Column()
    editor_username: string

    @ManyToMany(() => Fandom, fandom => fandom.fandom_editors)
    editor_fandom: Fandom[];

    @Column()
    editor_name: string

    @Column()
    editor_expereience: number

    @OneToMany(() => Edit, edit => edit.edit_editor)
    editor_edits: Edit[]

    @Column()
    editor_img: string

    @Column("json")
    editor_platforms: string[]

    @ManyToMany(() => Style, style => style.style_editor)
    editor_styles: Style[]

    @Column()
    editor_app: string

    @OneToMany(() => Comment, comment => comment.comment_author)
    editor_comments: Comment[]

    @OneToMany(() => Bookmark, bookmark => bookmark.bookmark_owner)
    editor_bookmarks: Bookmark[]
}

