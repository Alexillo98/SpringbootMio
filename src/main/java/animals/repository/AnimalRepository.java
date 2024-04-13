package animals.repository;

import animals.entity.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AnimalRepository extends CrudRepository<Animal, Long> {
    List<Animal>  findByNombre(String nombre);

    Animal findById(long id);
}
