import { Entity, PrimaryGeneratedColumn, Column, OneToMany, ManyToMany, JoinTable } from "typeorm";
import { Edit } from "./Edit";
import { Editor } from "./Editor";
import { Audio } from "./Audio";

@Entity()
export class Style {
    @PrimaryGeneratedColumn()
    style_id: number;

    @OneToMany(() => Edit, edit => edit.edit_style)
    style_edits: Edit[];

    @ManyToMany(() => Editor, editor => editor.editor_styles)
    @JoinTable()
    style_editor: Editor[];

    @ManyToMany(() => Audio, audio => audio.audio_styles)
    @JoinTable()
    style_audios: Audio[];

    @Column()
    style_name: string;
}