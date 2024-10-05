package com.freddan.mediaproject_videoservice.services;

import com.freddan.mediaproject_videoservice.dto.VideoDTO;
import com.freddan.mediaproject_videoservice.entities.Album;
import com.freddan.mediaproject_videoservice.entities.Artist;
import com.freddan.mediaproject_videoservice.entities.Genre;
import com.freddan.mediaproject_videoservice.entities.Video;

import java.util.List;

public interface VideoServiceInterface {

    List<Video> findAllVideos();
    List<Video> findVideosByArtist(String artistName);
    List<Video> findVideosByAlbum(String albumName);
    List<Video> findVideosByGenre(String genreName);
    Video findVideoByUrl(String url);
    Video findVideoById(long id);
    Video createVideo(VideoDTO videoDTO);
    List<Genre> getAllGenres(VideoDTO videoDTO);
    List<Album> getAllAlbums(VideoDTO videoDTO);
    List<Artist> getAllArtists(VideoDTO videoDTO);
    Video updateVideo(long id, VideoDTO newVideoInfo);
    String deleteVideo(long id);
    String playVideo(String url);
    String likeVideo(String url);
    String dislikeVideo(String url);
    Boolean checkIfVideoExistByUrl(String url);
}
