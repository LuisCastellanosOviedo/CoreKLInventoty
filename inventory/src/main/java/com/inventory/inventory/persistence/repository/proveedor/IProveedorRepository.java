package com.inventory.inventory.persistence.repository.proveedor;

import com.inventory.inventory.persistence.entity.proveedor.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorRepository extends JpaRepository<Proveedor,Long> {
}
