package br.com.rest.api.msmusicapp.services.impl;

import br.com.rest.api.msmusicapp.models.Music;
import br.com.rest.api.msmusicapp.respositories.MusicRepository;
import br.com.rest.api.msmusicapp.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicRepository repository;

    @Override
    public List<Music> listarMusicas() {

        return repository.findAll();
    }
}
