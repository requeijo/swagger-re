package br.com.bradseg.swagger.bsad.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@RestController
@RequestMapping("/v1/condicoes")
@Tag(name = "condicoes")
public class DisponibilizaCondicoesGeraisController {


//    @Operation(
//            description = "Efetua o download do documento de condições gerais",
//            summary = "Download do documento de condições gerais",
//            responses = {
//                    @ApiResponse(
//                            description = "Sucesso",
//                            responseCode = "200",
//                            content = @Content(mediaType = "application/json",
//                                    schema = @Schema(type = "String", format = "byte"))
//                    ),
//                    @ApiResponse(
//                            description = "Documento não encontrado",
//                            responseCode = "404"
//                    )
//            }
//
//    )
//    @RequestMapping(path = "/download", method = RequestMethod.GET)
//    public ResponseEntity<Resource> download(String param) throws IOException {
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
//        headers.add("Pragma", "no-cache");
//        headers.add("Expires", "0");
//
//        File file = new File("");
//
//        Path path = Paths.get(file.getAbsolutePath());
//        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
//
//        return ResponseEntity.ok()
//                .headers(headers)
//                .contentLength(file.length())
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                .body(resource);
//    }



//        @Operation(
//            description = "Efetua o download do documento de condições gerais",
//            summary = "Download do documento de condições gerais",
//            responses = {
//                    @ApiResponse(
//                            description = "Sucesso",
//                            responseCode = "200",
//                            content = @Content(mediaType = "application/json",
//                                    schema = @Schema(type = "String", format = "byte"))
//                    ),
//                    @ApiResponse(
//                            description = "Documento não encontrado",
//                            responseCode = "404"
//                    )
//            }
//
//    )
//    @Operation(summary = "Download an image.")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200",
//                    description = "Successfully downloaded the image",
//                    content = @Content(mediaType = "application/pdf",
//                            schema = @Schema(type = "String", format = "binary")))
//    })
//    @GetMapping(value = "/download/{fileName}", produces = MediaType.APPLICATION_PDF_VALUE)
//    public byte[] download(@PathVariable String fileName) {
//        return new byte[1024];
//    }


//    @ApiResponse(
//            content = @Content(
//                    schema = @Schema(
//                            type = "string", format = "binary")),
//            responseCode = "200")
    @Operation(
            description = "Efetua o download do documento de condições gerais",
            summary = "Download do documento de condições gerais",
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = @Content(
                                    schema = @Schema(
                                            type = "string", format = "binary"))
                    ),
                    @ApiResponse(
                            description = "Documento não encontrado",
                            responseCode = "404"
                    )
            }

    )
    @GetMapping(value = "/", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> downloadFile() {
        return ResponseEntity.ok().body(new byte[1024]);
    }

}
