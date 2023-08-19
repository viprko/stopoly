package back.stolenpoly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tax {
    @Id
    private Long id;
    private int payout;
    private String title;
}
