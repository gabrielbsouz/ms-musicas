package br.com.rest.api.msmusicapp.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Music {

    @Id
    @Column(name = "CD_MUSICA")
    private String codigo;
    @Column(name = "NM_MUSICA")
    private String nome;
    @Column(name = "NM_ARTISTA")
    private String artista;
    @Column(name = "NM_GENERO")
    private String genero;
    @Column(name = "DT_LANCAMENTO")
    private LocalDate lancamento;
}