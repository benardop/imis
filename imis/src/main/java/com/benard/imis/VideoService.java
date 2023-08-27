package com.benard.imis;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    private List<Video> videos = List.of(
            new Video("Fast and Furious"),
            new Video("Transporter Series"),
            new Video("Game of thrones")
    );

    public List<Video> getVideos() {
        return videos;
    }

    public Video createVideo(Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }
}
