package com.ceiba.configuracion;


import com.ceiba.registro.modelo.puerto.repositorio.RepositorioRegistro;
import com.ceiba.registro.modelo.servicio.ServicioRegistro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {


    @Bean
    public ServicioRegistro servicioRegistro(RepositorioRegistro repositorioRegistro) {
        return new ServicioRegistro(repositorioRegistro);
    }

}
