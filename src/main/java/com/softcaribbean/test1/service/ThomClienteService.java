package com.softcaribbean.test1.service;

import java.util.List;
import java.util.Optional;

import com.softcaribbean.test1.domain.ThomCliente;

public interface ThomClienteService {

	public Optional<ThomCliente> buscarPorId(Long id);

	public List<ThomCliente> listar();

	public ThomCliente agregar(ThomCliente thomCliente);

	public ThomCliente modificar(ThomCliente thomCliente);

}
