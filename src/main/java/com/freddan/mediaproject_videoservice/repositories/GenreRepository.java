package com.freddan.mediaproject_videoservice.repositories;

import com.freddan.mediaproject_videoservice.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    Genre findGenreByGenre(String genre);
}
