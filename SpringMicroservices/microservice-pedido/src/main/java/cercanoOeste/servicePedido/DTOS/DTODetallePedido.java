package cercanoOeste.servicePedido.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTODetallePedido {
    private int cantidad;
    private String nombreProducto;
}
