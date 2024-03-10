package MongoDemo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value= "Personas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona {

    private String id;

    private String name;

    private int age;
}
