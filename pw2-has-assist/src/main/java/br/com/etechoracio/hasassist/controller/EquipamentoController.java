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

    @GetMapping("/{id}")
    public Equipamento listarId(@PathVariable Long id){
        var existe = repository.findById(id) ;
        if (existe.isEmpty()){
            return null;
        }
        return existe.get();
    };
    @PostMapping
    public void inserir(@RequestBody Equipamento body){
        repository.save(body);
    };

    @PutMapping("/{id}")
    public Equipamento atualizar (@PathVariable Long id, @RequestBody Equipamento body){
        var existe = repository.findById(id);
        if (existe.isEmpty()){
            return null;
        }
        var atualizado = repository.save(body);
        return atualizado;
    };

}
