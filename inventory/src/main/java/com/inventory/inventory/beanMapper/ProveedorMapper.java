package com.inventory.inventory.beanMapper;


import com.inventory.inventory.dto.ProveedorDTO;
import com.inventory.inventory.persistence.entity.proveedor.Proveedor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper
public abstract class ProveedorMapper {

    @Mappings({
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "contactName", source = "contactName"),
            @Mapping(target = "email", source = "email"),
            @Mapping(target = "phone", source = "phone"),
            @Mapping(target = "address", source = "address"),
            @Mapping(target = "website", source = "website")
    })
  public abstract Proveedor mapDtoToEntity(ProveedorDTO proveedorDTO);
}
