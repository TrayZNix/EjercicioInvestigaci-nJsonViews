package com.salesianostriana.dam.trianafy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class Song {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String album;
    @Column(name = "year_of_song")
    private String year;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private Artista artist;


}
