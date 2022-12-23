CREATE TABLE registro(
    numeroDocumento BIGINT PRIMARY KEY,
    tipoDocumento varchar(40),
    primerNombre varchar(40),
    segundoNombre varchar(40),
    primerApellido varchar(40),
    segundoApellido varchar(40),
    codigoAdministradoraSalud varchar(40),
    tipoAdministradoraSalud varchar(40),
    fechaAdministradoraSalud varchar(40),
    codigoAdministradoraPension varchar(40),
    tipoAdministradoraPension varchar(40),
    fechaAdministradoraPension varchar(40)
    );