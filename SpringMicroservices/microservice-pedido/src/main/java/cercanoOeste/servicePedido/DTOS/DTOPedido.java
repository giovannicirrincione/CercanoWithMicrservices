package cercanoOeste.servicePedido.DTOS;

import cercanoOeste.servicePedido.Entity.DetallePedido;
import cercanoOeste.servicePedido.Enum.TipoEnvio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOPedido {
    private Long nroPedido;
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;
    private String direccion;
    private float monto;
    private List<DTODetallePedido> detalles =  new ArrayList<>();;
}
