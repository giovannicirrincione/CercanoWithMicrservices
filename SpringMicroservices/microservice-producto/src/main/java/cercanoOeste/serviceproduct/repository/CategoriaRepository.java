package cercanoOeste.serviceproduct.repository;

import cercanoOeste.serviceproduct.entity.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria,Long>{
    @Query(
            value = "SELECT * FROM categoria WHERE categoria.fecha_baja IS NULL ",
            nativeQuery = true
    )
    List<Categoria> busquedaPorAltaCategoria();

}
