package coffeaparat.demo.repository;

import coffeaparat.demo.entity.Components;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComponentRepository extends JpaRepository<Components, Integer> {


    Components queryById(Integer name);


}
