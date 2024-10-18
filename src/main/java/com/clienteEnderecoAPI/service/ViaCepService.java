package com.clienteEnderecoAPI.service;

import com.clienteEnderecoAPI.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name = "viacep", url = "https://viacep.com.br/")
public interface ViaCepService {

    @GetMapping("/{cep}/json")
    Endereco consultarCep (@PathVariable ("cep")
            String cep);
}
