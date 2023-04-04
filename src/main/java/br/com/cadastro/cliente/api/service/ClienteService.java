package br.com.cadastro.cliente.api.service;

import br.com.cadastro.cliente.api.dto.CriaClienteRequest;
import br.com.cadastro.cliente.api.model.Cliente;

public interface ClienteService {

    Cliente criaCliente(CriaClienteRequest clienteDTO);

}