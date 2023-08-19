package back.stolenpoly.repository;

import back.stolenpoly.model.Monopoly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonopolyRepository extends JpaRepository<Monopoly, Long> {
}
