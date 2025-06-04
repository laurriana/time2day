import { DataSource } from "typeorm";
import dotenv from 'dotenv';
import { Edit } from "./Model/Edit";
import { Comment } from "./Model/Comment";
import { Style } from "./Model/Style";
import { Editor } from "./Model/Editor";
import { Fandom } from "./Model/Fandom";
import { Audio } from "./Model/Audio";
import { Bookmark } from "./Model/Bookmark";

dotenv.config()

export const AppDataSource = new DataSource({
    type: "mariadb",
    host: "localhost",
    port: 3306,
    username: process.env.DB_USERNAME,
    password: process.env.DB_PASSWORD,
    database: "time2day",
    entities: [Edit, Comment, Style, Editor, Fandom, Audio, Bookmark],
    synchronize: true
});