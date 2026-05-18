package com.leticiafarias.atvpontuada.entity;

import java.util.List;

import com.leticiafarias.atvpontuada.dto.VendedorDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String telefone; 

    @OneToMany(mappedBy = "vendedor")
    private List<Venda> vendas;

    public Vendedor(VendedorDTO dto) {
		this.id = dto.id();
		this.nome = dto.nome();
		this.nome = dto.nome();
		this.telefone = dto.telefone();
		this.vendas = dto.vendas();
	}

}

