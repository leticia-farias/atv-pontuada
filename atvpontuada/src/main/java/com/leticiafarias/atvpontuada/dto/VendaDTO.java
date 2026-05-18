package com.leticiafarias.atvpontuada.dto;

import java.time.LocalDate;

public record VendaDTO(
    Integer id,
    LocalDate dataVenda,
    Double valorTotal
) { }
