package com.llanera.carnellanera.repository;

import com.llanera.carnellanera.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}