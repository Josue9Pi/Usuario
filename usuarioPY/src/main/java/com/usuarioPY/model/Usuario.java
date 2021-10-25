package com.usuarioPY.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {

    private String idUser;
    private String nombre;
    private String tipo;
    private String codEmpleado;
    private String puesto;
    private String perfil;

    @JsonProperty("idUser")
    public String getIDUser() { return idUser; }
    @JsonProperty("idUser")
    public void setIDUser(String value) { this.idUser = value; }

    @JsonProperty("nombre")
    public String getNombre() { return nombre; }
    @JsonProperty("nombre")
    public void setNombre(String value) { this.nombre = value; }

    @JsonProperty("tipo")
    public String getTipo() { return tipo; }
    @JsonProperty("tipo")
    public void setTipo(String value) { this.tipo = value; }

    @JsonProperty("codEmpleado")
    public String getCodEmpleado() { return codEmpleado; }
    @JsonProperty("codEmpleado")
    public void setCodEmpleado(String value) { this.codEmpleado = value; }

    @JsonProperty("puesto")
    public String getPuesto() { return puesto; }
    @JsonProperty("puesto")
    public void setPuesto(String value) { this.puesto = value; }

    @JsonProperty("perfil")
    public String getPerfil() { return perfil; }
    @JsonProperty("perfil")
    public void setPerfil(String value) { this.perfil = value; }


}
