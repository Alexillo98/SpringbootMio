package animals;

import animals.entity.Animal;
import animals.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private AnimalRepository animalRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args){
        initDatabase();
    }
    private void initDatabase(){
        //CREAR OBJETOS
        animalRepository.save(new Animal("Caballo","Marrón"));
        animalRepository.save(new Animal("Vaca","Negro y blanco"));
        animalRepository.save(new Animal("Toro","Marrón"));
        animalRepository.save(new Animal("Monstruo de Gila","Negro y marrón durazno"));

        //MOSTRAR OBJETOS. MÉTODO "findAll" DEL REPOSITORIO "AnimalRepository"
        String.format("Animales encontrados mendiante 'findAll()'");
    }
}
