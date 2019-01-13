package coffeaparat.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
public class Post {


    private Integer componentcoffee;
    private Integer componentsugar;
    private Integer componentwater;

    private Integer incoins;
    private Integer returncoins;


    boolean coffe;
    boolean sugar;

    private Integer coffeecount;
    private Integer sugarcount;
    private Integer watercount;
    private Integer id;


}
