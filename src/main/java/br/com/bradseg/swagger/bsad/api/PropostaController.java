package br.com.bradseg.swagger.bsad.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/proposta")
@Tag(name = "proposta")
public class PropostaController {
}
