package com.leticiafarias.atvpontuada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.leticiafarias.atvpontuada.dto.VendedorDTO;
import com.leticiafarias.atvpontuada.entity.Vendedor;
import com.leticiafarias.atvpontuada.repository.VendedorRepository;

public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor create(VendedorDTO dto) {
		return vendedorRepository.save(new Vendedor(dto));
	}
	
	public void delete(VendedorDTO dto) {
		vendedorRepository.delete(new Vendedor(dto));
	}
	
	public Vendedor update(VendedorDTO dto) {
		return create(dto);
	}
	
	public List<Vendedor> todos() {
		return vendedorRepository.findAll();
	}
}
