package biblioteca.salas.duoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.salas.duoc.model.Sala;
import biblioteca.salas.duoc.service.SalaService;

@RestController
@RequestMapping("api/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAllSala(){
        return salaService.findAll();
    }

    @GetMapping("/{id}")
    public Sala getSalaById(@PathVariable Long id){
        return salaService.findById(id);
    }

    @PostMapping
    public Sala createSala(@RequestBody Sala sala){
        return salaService.save(sala);
    }

    @DeleteMapping("/{id}")
    public void deleteSala(@PathVariable Long id){
        salaService.deleteById(id);
    }
}
