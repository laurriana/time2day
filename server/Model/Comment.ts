import { Entity, PrimaryGeneratedColumn, Column, ManyToOne } from "typeorm";
import { Editor } from "./Editor";
import { Edit } from "./Edit";

@Entity()
export class Comment {
    @PrimaryGeneratedColumn()
    comment_id: number

    @ManyToOne(() => Editor, editor => editor.editor_comments)
    comment_author: Editor

    @Column()
    comment_date: Date

    @Column()
    comment_content: string

    @ManyToOne(() => Edit, edit => edit.edit_comments)
    comment_edit: Edit
}