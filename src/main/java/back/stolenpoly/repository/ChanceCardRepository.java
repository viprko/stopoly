package back.stolenpoly.repository;

import back.stolenpoly.model.ChanceCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChanceCardRepository extends JpaRepository<ChanceCard, Long> {
}
