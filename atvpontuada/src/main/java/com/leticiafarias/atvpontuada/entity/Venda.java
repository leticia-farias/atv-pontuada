package com.leticiafarias.atvpontuada.entity;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import com.leticiafarias.atvpontuada.dto.VendaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dataVenda;

    private Double valorTotal; 

    @ManyToOne
    @JoinColumn(name = "vendedor_id") 
    private Vendedor vendedor;

    public Venda(VendaDTO dto) {
		this.id = dto.id();
		this.dataVenda = dto.dataVenda();
		this.valorTotal = dto.valorTotal();
	}

}

