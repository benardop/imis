package com.benard.imis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {

    // List<VideoEntity> findByName(String name);
    List<VideoEntity> FindByNameContainsIgnoreCase(String partialName);

    List<VideoEntity> FindByDescriptionContainsIgnoreCase(String partialDescription);

    List<VideoEntity> findByNameContainsOrDescriptionContainsAllIgnoreCase(String partialName,
                                                                           String partialDescription);
}
