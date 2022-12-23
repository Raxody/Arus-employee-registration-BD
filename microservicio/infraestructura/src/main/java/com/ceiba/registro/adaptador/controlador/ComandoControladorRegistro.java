package com.ceiba.registro.adaptador.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.registro.comando.ComandoRegistro;
import com.ceiba.registro.comando.manejador.ManejadorCrearRegistro;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registrar")
@Tag(name = "Controlador comando registro")
public class ComandoControladorRegistro {

    private final ManejadorCrearRegistro manejadorCrearRegistro;

    public ComandoControladorRegistro(ManejadorCrearRegistro manejadorCrearRegistro) {
        this.manejadorCrearRegistro = manejadorCrearRegistro;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    @Operation(summary = "Registrar", description = "Metodo utilizado para generar un registrp")
    public ComandoRespuesta<Long> Registrar(@RequestBody ComandoRegistro comandoRegistro) {
        System.out.println("¡Registro exitoso!");
        return this.manejadorCrearRegistro.ejecutar(comandoRegistro);
    }
}
