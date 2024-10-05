package com.freddan.mediaproject_videoservice.dto;

import jakarta.persistence.Column;

import java.util.ArrayList;
import java.util.List;

public class VideoDTO {

    // Attributes
    private String type;
    @Column(nullable = false, length = 250)
    private String title;
    @Column(nullable = false, length = 250)
    private String url;
    @Column(nullable = false, length = 10)
    private String releaseDate;
    private List<String> genreInputs = new ArrayList<>();
    private List<String> albumInputs = new ArrayList<>();
    private List<String> artistInputs = new ArrayList<>();

    // Constructors
    public VideoDTO() {
    }

    public VideoDTO(String title, String url, String releaseDate) {
        this.type = "video";
        this.title = title;
        this.url = url;
        this.releaseDate = releaseDate;
        this.genreInputs = new ArrayList<>();
        this.albumInputs = new ArrayList<>();
        this.artistInputs = new ArrayList<>();
    }

    public VideoDTO(String title, String url, String releaseDate, List<String> genreInputs, List<String> albumInputs, List<String> artistInputs) {
        this.type = "video";
        this.title = title;
        this.url = url;
        this.releaseDate = releaseDate;
        this.genreInputs = genreInputs;
        this.albumInputs = albumInputs;
        this.artistInputs = artistInputs;
    }

    // Getters & Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getGenreInputs() {
        return genreInputs;
    }

    public void setGenreInputs(List<String> genreInputs) {
        this.genreInputs = genreInputs;
    }

    public List<String> getAlbumInputs() {
        return albumInputs;
    }

    public void setAlbumInputs(List<String> albumInputs) {
        this.albumInputs = albumInputs;
    }

    public List<String> getArtistInputs() {
        return artistInputs;
    }

    public void setArtistInputs(List<String> artistInputs) {
        this.artistInputs = artistInputs;
    }
}
