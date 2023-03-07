package classroom;

public enum Tipo {
	DISCIPLINAR(10,"DISCIPLINAR"), FUNDAMENTACION(20,"FUNDAMENTACION"), ELECTIVA(30, "ELECTIVA");
	
	int codigo;
	String nombre;
	private Tipo(int codigo,String nombre) {
		
		this.codigo = codigo;
		this.nombre=nombre;
	}
}