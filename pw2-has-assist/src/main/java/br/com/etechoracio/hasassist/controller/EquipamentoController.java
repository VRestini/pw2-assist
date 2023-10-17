package br.com.etechoracio.hasassist.controller;

import br.com.etechoracio.hasassist.entity.Equipamento;
import br.com.etechoracio.hasassist.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {

    @Autowired
    private EquipamentoRepository repository;

    @GetMapping
    public List<Equipamento> listarTodos(){
        return repository.findAll();
    };

    @GetMapping
    public List<Equipamento> listarId(){
        return repository.findById();
    };
    @PostMapping
    public void inserir(@RequestBody Equipamento body){
        repository.save(body);
    };

}
