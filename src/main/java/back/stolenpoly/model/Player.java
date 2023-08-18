package back.stolenpoly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Player {
    @Id
    private Long id;
    private String username;
    private String password;
    private int position;
    private int bankAccount;
    private boolean isInJail;
}
