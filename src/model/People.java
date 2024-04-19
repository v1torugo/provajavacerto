package model;

public class People {
	//Atritutos de People
	private String sexo; 
	private String cargo; 
	private String cidade; 
	private String estado;
	
	public People(String sexo,String cargo,String cidade, String estado) {
		super();
		this.sexo = sexo;
		this.cargo = cargo;
		this.cidade = cidade;
		this.estado = estado;
	
	}
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getsexo() {
		return sexo;
	}
	public void setsexo(String sexo) {
		this.sexo = sexo;
	}
	public String getcargo() {
		return cargo;
	}
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}
	public String getcidade() {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getestado() {
		return estado;
	}
	public void setAge(String estado) {
		this.estado = estado;
	}

	

}
