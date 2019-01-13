package coffeaparat.demo.service;

import coffeaparat.demo.entity.Components;
import coffeaparat.demo.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComponentsServiceImpl implements ComponentService {

    @Autowired
    ComponentRepository componentRepository;


}
