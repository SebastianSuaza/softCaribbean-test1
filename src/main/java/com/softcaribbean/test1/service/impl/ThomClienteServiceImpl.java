package com.softcaribbean.test1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softcaribbean.test1.dao.ThomClienteDao;
import com.softcaribbean.test1.domain.ThomCliente;
import com.softcaribbean.test1.service.ThomClienteService;

@Service
public class ThomClienteServiceImpl implements ThomClienteService {

	@Autowired
	ThomClienteDao thomClienteDao;

	@Override
	@Transactional(readOnly = true)
	public Optional<ThomCliente> buscarPorId(Long id) {
		return thomClienteDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ThomCliente> listar() {
		return thomClienteDao.findAll();
	}

	@Override
	@Transactional
	public ThomCliente agregar(ThomCliente t) {
		return thomClienteDao.save(t);
	}

	@Override
	@Transactional
	public ThomCliente modificar(ThomCliente t) {
		ThomCliente updateObject = thomClienteDao.getOne(t.getCodigo());
		updateObject = t;
		return thomClienteDao.save(updateObject);
	}

}
