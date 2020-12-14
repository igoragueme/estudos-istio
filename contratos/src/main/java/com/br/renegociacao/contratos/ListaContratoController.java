package com.br.renegociacao.contratos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListaContratoController {

    @GetMapping("/lista")
    public ResponseEntity<List<ContratosRequest>> listaContratos(){
        List<ContratosRequest> contratos = new ArrayList<ContratosRequest>();
        ContratosRequest contratosRequest = new ContratosRequest();
        contratosRequest.setCpf("42565867840");
        contratosRequest.setVersao("v2");

        ContratosRequest contratosRequest2 = new ContratosRequest();
        contratosRequest2.setCpf("08459736814");
        contratosRequest2.setVersao("v2");

        ContratosRequest contratosRequest3 = new ContratosRequest();
        contratosRequest3.setCpf("361564641");
        contratosRequest3.setVersao("v2");

        contratos.add(contratosRequest);
        contratos.add(contratosRequest2);
        contratos.add(contratosRequest3);

        return new ResponseEntity<>(contratos, HttpStatus.OK);
    }

}
