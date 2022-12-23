package com.ceiba.registro.comando.fabrica;

import com.ceiba.registro.comando.ComandoRegistro;
import com.ceiba.registro.modelo.entidad.Registro;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FabricaRegistro {

    public Registro crearRegistro(ComandoRegistro comandoRegistro){
        return new Registro(comandoRegistro.getNumeroDocumento(),comandoRegistro.getTipoDocumento(),
                comandoRegistro.getPrimerNombre(),comandoRegistro.getSegundoNombre(),
                comandoRegistro.getPrimerApellido(),comandoRegistro.getSegundoApellido(),
                comandoRegistro.getCodigoAdministradoraSalud(),comandoRegistro.getTipoAdministradoraSalud(),
                comandoRegistro.getFechaAdministradoraSalud(),comandoRegistro.getCodigoAdministradoraPension(),
                comandoRegistro.getTipoAdministradoraSalud(),comandoRegistro.getFechaAdministradoraSalud());
    }


}
