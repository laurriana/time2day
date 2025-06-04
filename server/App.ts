import express, { Request, Response } from "express";
import cors from "cors";
import { AppDataSource } from "./AppDataSource";

const app = express();

app.use(express.json());
app.use(cors());

AppDataSource.initialize()
    .then(() => {
        app.listen(3000, () => {
            console.log("listening on port 3000");
        });
    })
    .catch((error) => {
        console.error("Error during Data Source initialization:", error);
    });
