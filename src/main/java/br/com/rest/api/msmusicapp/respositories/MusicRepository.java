package br.com.rest.api.msmusicapp.respositories;

import br.com.rest.api.msmusicapp.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, String> {
}
