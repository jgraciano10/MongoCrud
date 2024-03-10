package MongoDemo.demo.services;

import MongoDemo.demo.model.Persona;
import MongoDemo.demo.repository.personaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class personaService {

    @Autowired
    private personaRepository repository;


    public Optional<Persona> findById(String id){
        return repository.findById(id);
    }

    public List<Persona> getAll(){
        return repository.findAll();
    }
    public void create(Persona personaModel){
        repository.save(personaModel);
    }

    public void delete(String id){
        repository.deleteById(id);
    }

    public void update(Persona personaModel){

    }
}