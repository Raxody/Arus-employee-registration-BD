package com.ceiba.registro.modelo.servicio;

import com.ceiba.registro.modelo.entidad.Registro;
import com.ceiba.registro.modelo.puerto.repositorio.RepositorioRegistro;

public class ServicioRegistro {

    private final RepositorioRegistro repositorioRegistro;

    public ServicioRegistro(RepositorioRegistro repositorioRegistro) {
        this.repositorioRegistro = repositorioRegistro;
    }

    public Long ejecutar(Registro registro){
        return this.repositorioRegistro.guardarRegistro(registro);
    }
}
