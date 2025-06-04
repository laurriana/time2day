import { Entity, PrimaryGeneratedColumn, Column, ManyToMany, OneToMany } from "typeorm";
import { Style } from "./Style";
import { Edit } from "./Edit";

@Entity()
export class Audio {
    @PrimaryGeneratedColumn()
    audio_id: number

    @Column()
    audio_credit: string

    @Column()
    audio_link: string

    @ManyToMany(() => Style, style => style.style_audios)
    audio_styles: Style[]

    @OneToMany(() => Edit, edit => edit.edit_audio)
    audio_edits: Edit[]

    @Column()
    audio_duration: number
}