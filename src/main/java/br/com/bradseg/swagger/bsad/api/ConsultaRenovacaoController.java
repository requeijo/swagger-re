package br.com.bradseg.swagger.bsad.api;

import br.com.bradseg.swagger.bsad.model.ConsultaRenovacao;
import br.com.bradseg.swagger.bsad.model.enums.SegmentoEnum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/consulta")
@Tag(name = "consulta")
public class ConsultaRenovacaoController {

    @Operation(
            description = "Consulta as renovações",
            summary = "Lista as renovações para um correntista a partir de um CPF",
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Correntista não encontrado para o CPF",
                            responseCode = "204"
                    )
            }

    )
    @GetMapping("/{cpf}")
    public List<ConsultaRenovacao> consultar(@PathVariable("cpf") final  String cpf) {

        List<ConsultaRenovacao> list = new ArrayList<>();
        ConsultaRenovacao c = new ConsultaRenovacao();
        c.dataInicioVigencia = LocalDate.now();
        c.dataTerminoVigencia = c.dataInicioVigencia.plusMonths(12);
        c.nomeProduto = SegmentoEnum.RESIDENCIA_EXCLUSIVE;
        c.validadeProposta = LocalDate.now().plusDays(7);
        list.add(c);
        return list;
    }

}
