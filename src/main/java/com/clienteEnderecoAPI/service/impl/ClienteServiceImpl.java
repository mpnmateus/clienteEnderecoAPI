package com.clienteEnderecoAPI.service.impl;

import com.clienteEnderecoAPI.model.Cliente;
import com.clienteEnderecoAPI.repository.ClienteRepository;
import com.clienteEnderecoAPI.repository.EnderecoRepository;
import com.clienteEnderecoAPI.service.ClienteService;
import com.clienteEnderecoAPI.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
