package com.llanera.carnellanera;

import com.llanera.carnellanera.dto.ProductoDTO;
import com.llanera.carnellanera.service.ProductoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarnellaneraApplication implements CommandLineRunner {

    private final ProductoService service;

    public CarnellaneraApplication(ProductoService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(CarnellaneraApplication.class, args);
    }

    @Override
    public void run(String... args) {

        ProductoDTO producto = new ProductoDTO();

        producto.setNombre("Carne a la Llanera");
        producto.setPrecio(25000);

        ProductoDTO respuesta = service.guardar(producto);

        System.out.println("Producto guardado:");
        System.out.println(respuesta.getNombre());
        System.out.println(respuesta.getPrecio());
    }
}
