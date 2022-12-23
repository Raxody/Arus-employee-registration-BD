package com.ceiba.registro.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.registro.comando.ComandoRegistro;
import com.ceiba.registro.comando.fabrica.FabricaRegistro;
import com.ceiba.registro.modelo.entidad.Registro;
import com.ceiba.registro.modelo.servicio.ServicioRegistro;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearRegistro implements ManejadorComandoRespuesta<ComandoRegistro, ComandoRespuesta<Long>> {

    private final FabricaRegistro fabricaRegistro;
    private final ServicioRegistro servicioRegistro;

    public ManejadorCrearRegistro(FabricaRegistro fabricaRegistro, ServicioRegistro servicioRegistro) {
        this.fabricaRegistro = fabricaRegistro;
        this.servicioRegistro = servicioRegistro;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoRegistro comandoRegistro) {
        Registro registro = this.fabricaRegistro.crearRegistro(comandoRegistro);
        return new ComandoRespuesta<>(this.servicioRegistro.ejecutar(registro));
    }
}
