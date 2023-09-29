package br.com.bradseg.swagger.bsad.model.domino;

import br.com.bradseg.swagger.bsad.model.enums.EstadoCivilEnum;
import br.com.bradseg.swagger.bsad.model.enums.SexoEnum;

import java.time.LocalDate;

public class Segurado {

    public String cpf;
    public String nome;
    public LocalDate dataNascimento;
    public SexoEnum sexo;
    public EstadoCivilEnum estadoCivil;
    public String email;
    public Telefone telefone;

}
