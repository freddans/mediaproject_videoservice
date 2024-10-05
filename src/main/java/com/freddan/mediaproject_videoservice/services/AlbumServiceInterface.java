package com.freddan.mediaproject_videoservice.services;

import com.freddan.mediaproject_videoservice.entities.Album;

import java.util.List;

public interface AlbumServiceInterface {

    List<Album> getAllAlbums();
    Album getAlbumByName(String name);
    boolean albumExists(String name);
    Album createAlbum(Album album);
}
