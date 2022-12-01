package com.salesianostriana.dam.trianafy.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class Playlist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @Builder.Default
    private List<Song> songs = new ArrayList<>();


    public void addSong(Song song) {
        songs.add(song);
    }

    public void deleteSong(Song song) {
        songs.remove(song);
    }


}
