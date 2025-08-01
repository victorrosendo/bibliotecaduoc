package biblioteca.salas.duoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.salas.duoc.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

}
