package com.inventory.inventory.persistence.entity.proveedor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by LuisCO on 7/01/2018.
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Proveedor {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProveedor;
    private String name;
    private String contactName;
    private String email;
    private String phone;
    private String address;
    private String website;

}
