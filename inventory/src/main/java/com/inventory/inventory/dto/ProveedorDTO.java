package com.inventory.inventory.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProveedorDTO {

    private String name;
    private String contactName;
    private String email;
    private String phone;
    private String address;
    private String website;

}
