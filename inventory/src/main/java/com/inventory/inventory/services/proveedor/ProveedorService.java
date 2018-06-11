package com.inventory.inventory.services.proveedor;

import com.inventory.inventory.DA.ProveedorDA;
import com.inventory.inventory.dto.ProveedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService {


    @Autowired
    ProveedorDA proveedorDA;

    public Long save(ProveedorDTO proveedorDTO) {
        return proveedorDA.save(proveedorDTO);
    }
}
