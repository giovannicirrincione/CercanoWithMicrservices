package cercanoOeste.servicePedido.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "estadopedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EstadoPedido extends Base{
    private String nombre;
}