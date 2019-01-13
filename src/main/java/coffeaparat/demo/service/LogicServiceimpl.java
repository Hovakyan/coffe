package coffeaparat.demo.service;

import coffeaparat.demo.entity.Components;
import coffeaparat.demo.entity.Post;
import coffeaparat.demo.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class LogicServiceimpl implements LogicService{

    @Autowired
    ComponentRepository componentRepository;



    @Override
    public void add(Post post, Map<String, Object> map) {

        Components components = new Components();
        components.setCoffeecount(post.getCoffeecount());
        components.setSugarcount(post.getSugarcount());
        components.setWatercount(post.getWatercount());
        componentRepository.save(components);
        map.put("All Components",components);
    }

    @Override
    public void coffe(Post post, List<String> answer) {

    if (post.getIncoins()>=100 && componentRepository.queryById(1).getCoffeecount() >0
    && componentRepository.queryById(1).getSugarcount() > 0 && componentRepository.queryById(1).getWatercount() > 0){
    if (post.isCoffe()){
    post.setIncoins(post.getIncoins()-100);

    componentRepository.queryById(1).setCoffeecount(componentRepository.queryById(1).getCoffeecount()-1);
    componentRepository.queryById(1).setWatercount(componentRepository.queryById(1).getWatercount()-1);
    componentRepository.flush();
            }
            if (post.getIncoins()>=100 && post.isSugar()){
                post.setIncoins(post.getIncoins()-100);
                post.setReturncoins(post.getIncoins());
    componentRepository.queryById(1).setSugarcount(componentRepository.queryById(1).getSugarcount()-1);
    componentRepository.flush();
                answer.add("coffee with sugar Returncoins " + post.getReturncoins());
            }else {
                post.setReturncoins(post.getIncoins());
                answer.add("coffee without sugar Returncoins " + post.getReturncoins());
            }

        }else {
            post.setReturncoins(post.getIncoins());
            answer.add("return coins no components for cofee Returncoins " + post.getReturncoins());

        }

    }




    @Override
    public void edite(Post post, Map<String, Object> map) {

        if (componentRepository.findAll().get(0).getCoffeecount()!=(null)){
            componentRepository.queryById(post.getId()).setCoffeecount(post.getCoffeecount());
            componentRepository.queryById(post.getId()).setSugarcount(post.getSugarcount());
            componentRepository.queryById(post.getId()).setWatercount(post.getWatercount());
            componentRepository.flush();
            map.put("All Components",componentRepository.queryById(post.getId()));
        }



    }
}
