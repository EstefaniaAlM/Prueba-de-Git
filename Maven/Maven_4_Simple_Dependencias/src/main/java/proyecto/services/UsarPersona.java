package proyecto.services;

import proyecto.model.Persona;

public class UsarPersona {
	
	public void escribirPersona () {
		
		Persona per = new Persona ();
		per.setId(1);
		per.setNombre("Juan");
		per.setEdad(18);
		/* System.out.println("La persona introducida es: " + per +
				": " + per.getId() + ", " + per.getNombre()); */
		System.out.println("La persona introducida es: " + per.toString());
	}	

}