package br.com.bradseg.swagger.bsad.model;

import br.com.bradseg.swagger.bsad.model.domino.EnderecoResumido;
import br.com.bradseg.swagger.bsad.model.enums.SegmentoEnum;

import java.time.LocalDate;

public class Renovacao {

    public String cpf;
    public Long numeroProposta;
    public LocalDate dataInicioVigencia;
    public LocalDate dataTerminoVigencia;
    public SegmentoEnum nomeProduto;
    public LocalDate validadeProposta;
    public String ofertaRenovacao;

    public EnderecoResumido enderecoResumido;

}
