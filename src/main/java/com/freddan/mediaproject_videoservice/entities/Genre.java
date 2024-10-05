package com.freddan.mediaproject_videoservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "genres")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Attributes
    private String genre;
    private String type;
    private int totalLikes;
    private int totalPlays;

    // Constructors
    public Genre() {
    }

    public Genre(String genre) {
        this.genre = genre;
        this.type = "video";
        this.totalLikes = 0;
        this.totalPlays = 0;
    }

    public Genre(String genre, String type, int totalLikes, int totalPlays) {
        this.genre = genre;
        this.type = "video";
        this.totalLikes = 0;
        this.totalPlays = 0;
    }

    public Genre(long id, String genre, String type, int totalLikes, int totalPlays) {
        this.id = id;
        this.genre = genre;
        this.type = "video";
        this.totalLikes = 0;
        this.totalPlays = 0;
    }

    // Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public void countPlay() {
        this.totalPlays += 1;
    }

    public void addLike() {
        this.totalLikes += 1;
    }
}
