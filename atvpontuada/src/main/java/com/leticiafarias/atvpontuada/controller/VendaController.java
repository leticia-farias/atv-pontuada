package com.leticiafarias.atvpontuada.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leticiafarias.atvpontuada.entity.Venda;
import com.leticiafarias.atvpontuada.service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaController {

    private VendaService vendaService;

    @GetMapping("/todos") 
    public ResponseEntity<List<Venda>> getAllVendas () { 
        return ResponseEntity.ok().body(vendaService.todos()); 
    } 

    @GetMapping("/{id}") 
    public ResponseEntity<Venda> getVendaById ( @PathVariable Integer id)
     { 
        return ResponseEntity.ok().body(vendaService.getVendaById(id)); 
    } 

   @PostMapping("/") 
    public ResponseEntity<Venda> saveVenda ( @RequestBody Venda Venda)
     { 
        return ResponseEntity.ok().body(vendaService.create(Venda)); 
    }

    @PutMapping("/") 
    public ResponseEntity<Venda> updateVenda ( @RequestBody Venda Venda)
     { 
        return ResponseEntity.ok().body(vendaService.update(Venda)); 
    } 

    @DeleteMapping("/{id}") 
    public ResponseEntity<String> deleteVendaById ( @PathVariable Integer id)
     { 
        vendaService.delete(Venda); 
        return ResponseEntity.ok().body( "Venda excluída com sucesso" ); 
    } 
}
