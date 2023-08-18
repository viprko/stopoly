package back.stolenpoly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Property {
    @Id
    private Long id;
    private String title;
    private int price;
    private int payout;
    private int house;
    private boolean hotel;
    private int payoutPerHouse;
    private boolean isMortgaged;
    @ManyToOne
    private Monopoly monopoly;
    @ManyToOne
    private Player player;
}
