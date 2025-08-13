package ReviewVideogiochi.repository;

import ReviewVideogiochi.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
