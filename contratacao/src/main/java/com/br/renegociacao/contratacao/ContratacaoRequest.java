package com.br.renegociacao.contratacao;

import java.util.List;

public class ContratacaoRequest {

    private String produto;
    private List<ContratosRequest> contratos;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public List<ContratosRequest> getContratos() {
        return contratos;
    }

    public void setContratos(List<ContratosRequest> contratos) {
        this.contratos = contratos;
    }
}
