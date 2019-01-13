package coffeaparat.demo.controller;


import coffeaparat.demo.entity.Post;
import coffeaparat.demo.service.LogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {
@Autowired
    LogicService logicService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Map<String, Object> Addpass(@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        logicService.add(post,map);
        return map;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public Map<String, Object> Editepass(@RequestBody Post post) {
        Map<String, Object> map = new HashMap<>();
        logicService.edite(post,map);
        return map;
    }

    @RequestMapping(value = "/coffe", method = RequestMethod.POST)
    public List<String> Coffeget(@RequestBody Post post) {
        List<String> list = new ArrayList<>();
        logicService.coffe(post,list);
        return list;
    }






}
