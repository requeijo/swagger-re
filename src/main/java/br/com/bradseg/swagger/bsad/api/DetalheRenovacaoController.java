package br.com.bradseg.swagger.bsad.api;

import br.com.bradseg.swagger.bsad.model.DetalheRenovacao;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/detalhe")
@Tag(name = "detalhe")
public class DetalheRenovacaoController {

    @Operation(
            description = "Consulta as renovações",
            summary = "Lista as renovações para um correntista",
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Correntista não encontrado para o CPF ou proposta invalida",
                            responseCode = "204"
                    )
            }

    )
    @GetMapping("/{cpf}/{proposta}")
    public DetalheRenovacao detalhar(@PathVariable("cpf") final String cpf, @PathVariable("proposta") final String proposta) {

        DetalheRenovacao apol = new DetalheRenovacao();

        return apol;
    }

}
