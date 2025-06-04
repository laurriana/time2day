import express, { Request, Response } from "express";
import cors from "cors";
import { AppDataSource } from "./AppDataSource";
import { Audio } from "./Model/Audio";
import { Bookmark } from "./Model/Bookmark";
import { Edit } from "./Model/Edit";
import { Editor } from "./Model/Editor";
import { Fandom } from "./Model/Fandom";
import { Style } from "./Model/Style";
import { Comment } from "./Model/Comment";

const app = express();

app.use(express.json());
app.use(cors());

AppDataSource.initialize()
    .then(() => {
        app.listen(3000, () => {
            console.log("listening on port 3000");

            // create repositories
            const audioRepository = AppDataSource.getRepository(Audio);
            const bookmarkRepository = AppDataSource.getRepository(Bookmark);
            const commentRepository = AppDataSource.getRepository(Comment);
            const editRepository = AppDataSource.getRepository(Edit);
            const editorRepository = AppDataSource.getRepository(Editor);
            const fandomRepository = AppDataSource.getRepository(Fandom);
            const styleRepository = AppDataSource.getRepository(Style);
        
            
        
        });
    })
    .catch((error) => {
        console.error("Error during Data Source initialization:", error);
    });
