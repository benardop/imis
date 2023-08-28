import React from "react";
import ListOfVideos from "./ListOfVideos";
import NewVideo from "./NewVideo";

export function app() {
    return (
        <div>
            <ListOfVideos />
            <NewVideo />
        </div>
    )
}