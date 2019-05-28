package pl.sokol.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepo extends JpaRepository<Dog,Long> {

}
