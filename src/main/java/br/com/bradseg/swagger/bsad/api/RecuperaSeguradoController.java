package br.com.bradseg.swagger.bsad.api;

import br.com.bradseg.swagger.bsad.model.DetalheRenovacao;
import br.com.bradseg.swagger.bsad.model.domino.Segurado;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/segurado")
@Tag(name = "segurado")
public class RecuperaSeguradoController {

    @Operation(
            description = "Obtem os dados do segurado para renovação do App Nova Jornada RE",
            summary = "Recupera os dados de um segurado",
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Este segurado não foi encontrado!",
                            responseCode = "204"
                    )
            }

    )
    @GetMapping("/{cpf}")
    public Segurado recuperar(@PathVariable("cpf") final String cpf) {

        Segurado obj = new Segurado();
        return obj;
    }

}
