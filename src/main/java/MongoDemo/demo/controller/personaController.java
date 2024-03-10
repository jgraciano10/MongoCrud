package MongoDemo.demo.controller;

import MongoDemo.demo.model.Persona;
import MongoDemo.demo.services.personaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class personaController {

    @Autowired
    private personaService service;

    @GetMapping("/findAll")
    public List<Persona> getAll(){
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public Optional<Persona> find(@PathVariable String id){

        Optional<Persona> persona = service.findById(id);
        return persona;
    }
    @PostMapping
    public String create(@RequestBody Persona persona){
        service.create(persona);
        return "ok";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        service.delete(id);
        return "ok";
    }
}
