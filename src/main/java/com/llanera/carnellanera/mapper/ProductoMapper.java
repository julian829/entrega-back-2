package com.llanera.carnellanera.mapper;

import com.llanera.carnellanera.dto.ProductoDTO;
import com.llanera.carnellanera.model.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

    ProductoDTO toDto(Producto producto);

    Producto toEntity(ProductoDTO dto);
}