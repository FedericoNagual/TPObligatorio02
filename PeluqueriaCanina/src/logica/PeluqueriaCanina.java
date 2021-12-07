package logica;

import igu.Pantalla;




/**
 *
 * @author Federico
 */
public class PeluqueriaCanina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControllerClienteCanino control = new ControllerClienteCanino();
        
        Pantalla pantalla = new Pantalla(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        
    }
    
}
