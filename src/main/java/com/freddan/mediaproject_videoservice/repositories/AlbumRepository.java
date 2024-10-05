package com.freddan.mediaproject_videoservice.repositories;

import com.freddan.mediaproject_videoservice.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    Optional<Album> findByNameIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);
}
