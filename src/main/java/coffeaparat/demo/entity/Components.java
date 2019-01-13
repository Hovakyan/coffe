package coffeaparat.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Component
public class Components {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private Integer id;

    @Column
    private Integer coffeecount;
    @Column
    private Integer sugarcount;
    @Column
    private Integer watercount;
}
