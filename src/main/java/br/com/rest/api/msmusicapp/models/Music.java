package br.com.rest.api.msmusicapp.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
public class Music {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "CD_MUSICA")
    private String codigo;

    @Column(name = "NM_MUSICA")
    @NotBlank
    private String nome;

    @Column(name = "NM_ARTISTA")
    @NotBlank
    private String artista;
    @Column(name = "NM_GENERO")
    @NotBlank
    private String genero;
    @Column(name = "DT_LANCAMENTO")
    private LocalDate lancamento;
}