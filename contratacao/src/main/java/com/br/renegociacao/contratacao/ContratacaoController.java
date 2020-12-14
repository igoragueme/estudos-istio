package com.br.renegociacao.contratacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContratacaoController {

    @Autowired
    private ContratosClient contratosClient;

    @GetMapping("/contratacao")
    public ResponseEntity<ContratacaoRequest> iniciaContratacao(){
        ContratacaoRequest contratacaoRequest = new ContratacaoRequest();
        contratacaoRequest.setProduto("Sob medida PF");
        contratacaoRequest.setContratos(contratosClient.getLista());

        return new ResponseEntity<ContratacaoRequest>(contratacaoRequest, HttpStatus.OK);
    }

}
