package br.com.bradseg.swagger.bsad.model;

import br.com.bradseg.swagger.bsad.model.domino.CriticaProposta;

import java.time.LocalDate;
import java.util.List;

public class RetornoProposta {

    public String numeroProposta;
    public LocalDate dataHoraGeracaoProposta;
    public DetalheRenovacao detalheRenovacao;

    public List<CriticaProposta> criticas;
}
