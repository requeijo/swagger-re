package br.com.bradseg.swagger.bsad.api;

import br.com.bradseg.swagger.bsad.model.AcompanhamentoProposta;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/acompanhamento")
@Tag(name = "acompanhamento")
public class AcompanhamentoPropostaController {

    @Operation(
            description = "Acompanhamento da proposta de renovação",
            summary = "Acompanhar a proposta de renovação para um correntista a partir de um CPF e pelo numero da proposta",
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Proposta ou CPF não encontrado ",
                            responseCode = "204"
                    )
            }

    )
    @GetMapping("/{cpf}/{proposta}")
    public AcompanhamentoProposta acompanhar(@PathVariable("cpf") final  String cpf, @PathVariable("proposta") final  String proposta) {

        AcompanhamentoProposta obj = new AcompanhamentoProposta();

        return obj;
    }

}
