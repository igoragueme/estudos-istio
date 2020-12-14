package com.br.renegociacao.contratacao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "contratosService", url = "http://contratos")
public interface ContratosClient {

    @RequestMapping("/lista")
    List<ContratosRequest> getLista();

}
