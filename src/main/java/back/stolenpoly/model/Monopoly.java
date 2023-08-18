package back.stolenpoly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Monopoly {
    @Id
    private Long id;
    private String title;
    @ManyToOne
    private Player player;
}
