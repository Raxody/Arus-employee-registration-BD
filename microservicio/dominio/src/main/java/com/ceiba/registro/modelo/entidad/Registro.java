package com.ceiba.registro.modelo.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Registro {

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


    @Override
    public String toString() {
        return "Registro{" +
                "numeroDocumento=" + numeroDocumento +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", codigoAdministradoraSalud='" + codigoAdministradoraSalud + '\'' +
                ", tipoAdministradoraSalud='" + tipoAdministradoraSalud + '\'' +
                ", fechaAdministradoraSalud='" + fechaAdministradoraSalud + '\'' +
                ", codigoAdministradoraPension='" + codigoAdministradoraPension + '\'' +
                ", tipoAdministradoraPension='" + tipoAdministradoraPension + '\'' +
                ", fechaAdministradoraPension='" + fechaAdministradoraPension + '\'' +
                '}';
    }
}
