package com.usuarioMS.model;

public class RequestUsuario {
	
    private String codigoUsuario;
    private String nombre;
    private String tipo;
    private String inline1;
    private String inline2;
    private String inline3;
    
	public RequestUsuario(String codigoUsuario, String nombre, String tipo, String inline1, String inline2,
			String inline3) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.nombre = nombre;
		this.tipo = tipo;
		this.inline1 = inline1;
		this.inline2 = inline2;
		this.inline3 = inline3;
	}
	
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getInline1() {
		return inline1;
	}
	public void setInline1(String inline1) {
		this.inline1 = inline1;
	}
	public String getInline2() {
		return inline2;
	}
	public void setInline2(String inline2) {
		this.inline2 = inline2;
	}
	public String getInline3() {
		return inline3;
	}
	public void setInline3(String inline3) {
		this.inline3 = inline3;
	}
    
    
    

}
