package com.softcaribbean.test1.web.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softcaribbean.test1.domain.Mensaje;
import com.softcaribbean.test1.domain.ThomCliente;
import com.softcaribbean.test1.service.ThomClienteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/thomCliente")
public class ThomClienteController {

	@Autowired
	ThomClienteService thomClienteService;

	@GetMapping(value = "id/{codigo}")
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("codigo") long codigo) {
		Optional<ThomCliente> object = thomClienteService.buscarPorId(codigo);
		return object.isPresent() ? new ResponseEntity<Object>(object, HttpStatus.OK)
				: new ResponseEntity<Object>(new Mensaje(false, "Ningún registro encontrado."), HttpStatus.BAD_REQUEST);
	}

	@GetMapping
	@ResponseBody
	public List<ThomCliente> listar() {
		return thomClienteService.listar();
	}

	@PostMapping
	@ResponseBody
	public ResponseEntity<Object> agregar(@Valid @RequestBody ThomCliente thomCliente) {
		return thomClienteService.agregar(thomCliente).getCodigo() != 0
				? new ResponseEntity<Object>(new Mensaje(true, "Agregado con exito."), HttpStatus.CREATED)
				: new ResponseEntity<Object>(new Mensaje(false, "Error al agregar."), HttpStatus.BAD_REQUEST);
	}

	@PutMapping
	@ResponseBody
	public ResponseEntity<Object> modificar(@Valid @RequestBody ThomCliente thomCliente) {
		return thomClienteService.modificar(thomCliente).equals(thomCliente)
				? new ResponseEntity<Object>(new Mensaje(true, "Modificado con exito."), HttpStatus.OK)
				: new ResponseEntity<Object>(new Mensaje(false, "Error al modificar."), HttpStatus.BAD_REQUEST);
	}

}
