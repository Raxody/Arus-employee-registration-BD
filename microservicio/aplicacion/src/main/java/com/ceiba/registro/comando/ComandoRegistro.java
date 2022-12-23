package com.ceiba.registro.comando;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoRegistro {

    private Long numeroDocumento;
    private String tipoDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String codigoAdministradoraSalud;
    private String tipoAdministradoraSalud;
    private String fechaAdministradoraSalud;
    private String codigoAdministradoraPension;
    private String tipoAdministradoraPension;
    private String fechaAdministradoraPension;


}
