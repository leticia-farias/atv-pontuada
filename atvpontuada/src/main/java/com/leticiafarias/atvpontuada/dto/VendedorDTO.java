package com.leticiafarias.atvpontuada.dto;

import java.util.List;

import com.leticiafarias.atvpontuada.entity.Venda;

public record VendedorDTO(
    Integer id,
    String nome,
    String telefone,
    List<Venda> vendas
) { }
