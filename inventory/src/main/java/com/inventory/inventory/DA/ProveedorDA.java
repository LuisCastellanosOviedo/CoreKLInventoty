package com.inventory.inventory.DA;

import com.inventory.inventory.beanMapper.ProveedorMapper;
import com.inventory.inventory.dto.ProveedorDTO;
import com.inventory.inventory.persistence.entity.proveedor.Proveedor;
import com.inventory.inventory.persistence.repository.proveedor.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProveedorDA {

    @Autowired
    private IProveedorRepository proveedorRepository;

    @Autowired
    ProveedorMapper proveedorMapper;

    public long save(ProveedorDTO proveedorDTO){
        Proveedor proveedor =  proveedorMapper.mapDtoToEntity(proveedorDTO);
        return    proveedorRepository.save(proveedor).getIdProveedor();
    }
}
