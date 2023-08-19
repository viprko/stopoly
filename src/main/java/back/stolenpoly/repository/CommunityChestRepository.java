package back.stolenpoly.repository;

import back.stolenpoly.model.CommunityChest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityChestRepository extends JpaRepository<CommunityChest, Long> {
}
