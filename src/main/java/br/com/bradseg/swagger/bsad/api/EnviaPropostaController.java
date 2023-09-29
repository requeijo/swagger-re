package br.com.bradseg.swagger.bsad.api;

import br.com.bradseg.swagger.bsad.model.DetalheRenovacao;
import br.com.bradseg.swagger.bsad.model.Proposta;
import br.com.bradseg.swagger.bsad.model.RetornoProposta;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/proposta")
@Tag(name = "proposta")
public class EnviaPropostaController {

    @Operation(
            description = "Envia a proposta para renovação",
            summary = "Envia a proposta para a renovação",
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Existe critica na proposta",
                            responseCode = "202"
                    )
            }

    )

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public RetornoProposta enviar(@RequestBody Proposta proposta) {

        RetornoProposta obj = new RetornoProposta();
        return obj;

    }

}
