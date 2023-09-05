package com.benard.imis;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class VideoService {

    private final VideoRepository repository;

    public VideoService(VideoRepository repository) {
        this.repository = repository;
    }

//    private List<Video> videos = List.of(
//            new Video("Fast and Furious"),
//            new Video("Transporter Series"),
//            new Video("Game of thrones")
//    );

    public List<VideoEntity> search(VideoSearch videoSearch) {
        if (StringUtils.hasText(videoSearch.name())
            && StringUtils.hasText(videoSearch.description())) {
            return repository
                    .findByNameContainsOrDescriptionContainsAllIgnoreCase(
                            videoSearch.name(), videoSearch.description());
        }

        if (StringUtils.hasText(videoSearch.name())) {
            return repository.FindByNameContainsIgnoreCase(videoSearch.name());
        }

        if (StringUtils.hasText(videoSearch.description())) {
            return repository.FindByDescriptionContainsIgnoreCase(videoSearch.description());
        }

        return Collections.emptyList();
    }

    public List<VideoEntity> getVideos() {
        return repository.findAll();
    }

    public VideoEntity create(NewVideo newVideo) {
        return repository.saveAndFlush(new VideoEntity(newVideo.name(), newVideo.description()));
    }
}
