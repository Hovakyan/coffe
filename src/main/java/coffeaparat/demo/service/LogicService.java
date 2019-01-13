package coffeaparat.demo.service;

import coffeaparat.demo.entity.Post;

import java.util.List;
import java.util.Map;

public interface LogicService {

    public void add(Post post, Map<String, Object> map);

    public void edite(Post post, Map<String, Object> map);

    public void coffe(Post post, List<String> answer);
}
