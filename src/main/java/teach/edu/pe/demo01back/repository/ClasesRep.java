package teach.edu.pe.demo01back.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import teach.edu.pe.demo01back.model.Clase;

public interface ClasesRep extends JpaRepository<Clase,Long>{
    public List<Clase> findByProfesor(String profesor);
    @Transactional
    public long deleteByID(Long ID);
}
