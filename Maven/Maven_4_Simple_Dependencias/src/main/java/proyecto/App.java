package proyecto;

import proyecto.services.UsarPersona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        UsarPersona u = new UsarPersona ();
        u.escribirPersona();
    }
}
