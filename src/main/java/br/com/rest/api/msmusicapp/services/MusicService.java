package br.com.rest.api.msmusicapp.services;

import br.com.rest.api.msmusicapp.models.Music;

import java.util.List;

public interface MusicService {

    Music cadastrarMusica(Music music);

    List<Music> listarMusicas();
}
