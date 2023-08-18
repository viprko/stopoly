package back.stolenpoly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ChanceCard {
    @Id
    private Long id;
    private String title;
    private String description;
    private int outcome;
    private int income;
}
