package br.com.rest.api.msmusicapp.api.impl;

import br.com.rest.api.msmusicapp.mappers.MusicaMapper;
import br.com.rest.api.msmusicapp.models.Music;
import br.com.rest.api.msmusicapp.services.MusicService;
import io.swagger.api.V1Api;
import io.swagger.model.DetalheMusica;
import io.swagger.model.MusicaArray;
import io.swagger.model.MusicaPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MusicApiImpl implements V1Api {

    private MusicService service;

    public MusicApiImpl(MusicService service) {
        this.service = service;
    }

    @Autowired
    private MusicaMapper mapper;

    @Override
    public ResponseEntity<DetalheMusica> cadastrarMusica(@Valid @RequestBody MusicaPostRequest musicaPostRequest) {

        Music music = mapper.musicFormPostToMusic(musicaPostRequest);

        service.cadastrarMusica(music);

        DetalheMusica detalheMusica = mapper.musicToDetalheMusica(music);

        return ResponseEntity.ok(detalheMusica);
    }

    @Override
    public ResponseEntity<MusicaArray> listarMusicas() {

        List<Music> musicList =  service.listarMusicas();

        MusicaArray musicaArray = mapper.listMusicTo(musicList);

        return ResponseEntity.ok(musicaArray);
    }
}
