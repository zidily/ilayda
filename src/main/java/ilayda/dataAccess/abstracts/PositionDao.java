package ilayda.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import ilayda.entities.concretes.Position;


public interface PositionDao extends JpaRepository<Position, Integer>{

}
