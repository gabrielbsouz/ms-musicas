package br.com.rest.api.msmusicapp.mappers;

import br.com.rest.api.msmusicapp.models.Music;
import io.swagger.model.DetalheMusica;
import io.swagger.model.MusicaArray;
import io.swagger.model.MusicaPostRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MusicaMapper {

    MusicaArray listMusicTo(List<Music> musicList);

    Music musicFormPostToMusic(MusicaPostRequest musicaPostRequest);

    DetalheMusica musicToDetalheMusica(Music music);
}
