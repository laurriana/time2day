import { Column, Entity, JoinTable, ManyToMany, OneToMany, PrimaryGeneratedColumn } from "typeorm";
import { Editor } from "./Editor";
import { Edit } from "./Edit";

@Entity()
export class Fandom {
    @PrimaryGeneratedColumn()
    fandom_id: number;

    @Column()
    fandom_name: string

    @OneToMany(() => Edit, edit => edit.edit_fandom)
    fandom_edits: Edit[]

    @ManyToMany(() => Editor, editor => editor.editor_fandom)
    @JoinTable()
    fandom_editors: Editor[];

    @Column()
    fandom_img: string
}
