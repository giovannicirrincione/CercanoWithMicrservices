package cercanoOeste.servicePedido.Product;

import cercanoOeste.servicePedido.DTOS.DTOProducto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-student", url = "localhost:8080/producto")
public interface ProductClient {
    @GetMapping("/{id}")
    DTOProducto getProducto(@PathVariable Long id);
}
