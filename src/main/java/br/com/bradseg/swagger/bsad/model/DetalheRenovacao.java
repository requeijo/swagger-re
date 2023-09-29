package br.com.bradseg.swagger.bsad.model;

import br.com.bradseg.swagger.bsad.model.domino.Assistencia;
import br.com.bradseg.swagger.bsad.model.domino.Cobertura;
import br.com.bradseg.swagger.bsad.model.domino.Endereco;
import br.com.bradseg.swagger.bsad.model.domino.Produto;
import br.com.bradseg.swagger.bsad.model.enums.FormaPagamentoEnum;
import br.com.bradseg.swagger.bsad.model.enums.SegmentoEnum;
import br.com.bradseg.swagger.bsad.model.enums.TipoImovelEnum;

import java.time.LocalDate;
import java.util.List;

public class DetalheRenovacao {

    public String cpf;
    public Long numeroProposta;
    public LocalDate dataInicioVigencia;
    public LocalDate dataTerminoVigencia;
    public Produto produto;
    public SegmentoEnum segmento;
    public LocalDate validadeProposta;
    public String ofertaRenovacao;

    public List<Cobertura> coberturas;

    public Double valorPremio;
    public Double valorFranquia;
    public List<Assistencia> assistencias;
    public TipoImovelEnum tipoImovel;
    public Endereco enderecoImovel;

    public Integer quantidadeParcela;
    public Double valorParcela;
    public FormaPagamentoEnum formaPagamento;





}
