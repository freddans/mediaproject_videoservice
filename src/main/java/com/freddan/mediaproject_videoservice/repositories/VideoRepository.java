package com.freddan.mediaproject_videoservice.repositories;

import com.freddan.mediaproject_videoservice.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    Video findVideoByUrl(String url);
}
