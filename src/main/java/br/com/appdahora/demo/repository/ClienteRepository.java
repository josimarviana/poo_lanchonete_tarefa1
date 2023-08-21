package br.com.appdahora.demo.repository;

import br.com.appdahora.demo.model.Cliente;

import java.util.List;

public interface ClienteRepository {
    List<Cliente> listar();
    Cliente buscar(Long id);
    Cliente salvar(Cliente cliente);
    void remover(Cliente cliente);
}