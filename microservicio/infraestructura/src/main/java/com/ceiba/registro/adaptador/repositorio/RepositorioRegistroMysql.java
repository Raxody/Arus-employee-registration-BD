package com.ceiba.registro.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.registro.modelo.entidad.Registro;
import com.ceiba.registro.modelo.puerto.repositorio.RepositorioRegistro;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioRegistroMysql implements RepositorioRegistro {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="registrar", value="crear")
    private static String sqlCrear;

    public RepositorioRegistroMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long guardarRegistro(Registro registro) {
        return this.customNamedParameterJdbcTemplate.crear(registro,sqlCrear);
    }
}
