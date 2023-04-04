package br.com.cadastro.cliente.api.service;

import br.com.cadastro.cliente.api.dto.CriaClienteRequest;
import br.com.cadastro.cliente.api.mapper.ClienteMapper;
import br.com.cadastro.cliente.api.model.Cliente;
import br.com.cadastro.cliente.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplements implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImplements(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente criaCliente(CriaClienteRequest clienteDTO) {
        return this.clienteRepository.save(ClienteMapper.buildCliente(clienteDTO));
    }
}
