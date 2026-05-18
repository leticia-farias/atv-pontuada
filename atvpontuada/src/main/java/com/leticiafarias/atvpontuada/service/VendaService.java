package com.leticiafarias.atvpontuada.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.leticiafarias.atvpontuada.dto.VendaDTO;
import com.leticiafarias.atvpontuada.entity.Venda;
import com.leticiafarias.atvpontuada.repository.VendaRepository;

public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public Venda create(VendaDTO dto) {
		return vendaRepository.save(new Venda(dto));
	}

    public Venda getVendaById (Integer id) { 
        Optional<Venda> optionalVenda = vendaRepository.findById(id); 
        if (optionalVenda.isPresent()){ 
            return optionalVenda.get(); 
        } 
        return  null; 
    } 

	public void delete(VendaDTO dto) {
		vendaRepository.delete(new Venda(dto));
	}
	
	public Venda update(VendaDTO dto) {
		return create(dto);
	}
	
	public List<Venda> todos() {
		return vendaRepository.findAll();
	}
}
