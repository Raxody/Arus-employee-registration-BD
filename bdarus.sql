CREATE DATABASE adnarus;

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

INSERT INTO registro(numeroDocumento,tipoDocumento,primerNombre,
segundoNombre,primerApellido,segundoApellido,codigoAdministradoraSalud,
tipoAdministradoraSalud,fechaAdministradoraSalud,codigoAdministradoraPension,
tipoAdministradoraPension,fechaAdministradoraPension) 
VALUES (1000,'cc','juan','andres','lopez','avila','123','eps','2020-12-12','456','colmevas','2021-12-12');


"{\r\n" + "	\"nombre1\" : \"rodolfo\",\r\n" + "	\"nombre2\" : \"andres\"\r\n" + "}