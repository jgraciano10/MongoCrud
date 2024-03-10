package MongoDemo.demo.repository;

import MongoDemo.demo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends MongoRepository<Persona, String> {
}
