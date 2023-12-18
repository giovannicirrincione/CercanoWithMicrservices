package cercanoOeste.serviceproduct.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "categoria")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Categoria extends Base{

    private String nombreCategoria;

    @Column(name = "fechaBaja")
    private LocalDateTime fechaBaja;

    @Column(name = "fechaModificacion")
    private LocalDateTime fechaModificacion;


}