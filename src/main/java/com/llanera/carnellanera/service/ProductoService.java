package com.llanera.carnellanera.service;

import com.llanera.carnellanera.dto.ProductoDTO;
import com.llanera.carnellanera.model.Producto;
import com.llanera.carnellanera.mapper.ProductoMapper;
import com.llanera.carnellanera.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    public ProductoService(ProductoRepository repository, ProductoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductoDTO guardar(ProductoDTO dto) {

        Producto producto = mapper.toEntity(dto);

        Producto guardado = repository.save(producto);

        return mapper.toDto(guardado);
    }
}
