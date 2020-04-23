package br.com.rest.api.msmusicapp.mappers;

import br.com.rest.api.msmusicapp.models.Music;
import io.swagger.model.MusicaArray;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MusicaMapper {

    MusicaArray listMusicTo(List<Music> musicList);
}
