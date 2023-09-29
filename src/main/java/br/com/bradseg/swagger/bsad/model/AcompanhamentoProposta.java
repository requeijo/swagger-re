package br.com.bradseg.swagger.bsad.model;

import br.com.bradseg.swagger.bsad.model.domino.Endereco;
import br.com.bradseg.swagger.bsad.model.enums.SegmentoEnum;
import br.com.bradseg.swagger.bsad.model.enums.StatusPropostaEnum;

public class AcompanhamentoProposta {

    public SegmentoEnum segmento;
    public Endereco endereco;
    public StatusPropostaEnum statusProposta;
}
