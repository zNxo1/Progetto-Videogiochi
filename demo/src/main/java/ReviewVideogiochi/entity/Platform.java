package ReviewVideogiochi.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;  

    @ManyToMany(mappedBy = "platforms")
    private Set<Game> games;


}