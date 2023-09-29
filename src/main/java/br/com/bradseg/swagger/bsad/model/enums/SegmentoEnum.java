package br.com.bradseg.swagger.bsad.model.enums;

public enum SegmentoEnum {

    RESIDENCIAL_CLASSIC("Residencial Classic"),
    RESIDENCIA_EXCLUSIVE("Residencia Exclusive");

    private String descricaoProduto;

    SegmentoEnum(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

}
