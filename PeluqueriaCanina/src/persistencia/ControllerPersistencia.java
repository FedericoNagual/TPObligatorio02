
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.ClienteCanino;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Federico
 */
public class ControllerPersistencia {
    
    ClienteCaninoJpaController cliJPA = new ClienteCaninoJpaController();
    
    public void crearClienteCanino(ClienteCanino cli){
        try {
            cliJPA.create(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarClienteCanino (String id){
        try {
            cliJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarClienteCanino (ClienteCanino cli){
        try {
            cliJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List <ClienteCanino> traerClienteCanino(){
        List <ClienteCanino> lista = cliJPA.findClienteCaninoEntities(); 
        return lista;
    }
    
    public ClienteCanino encontrarClienteCanino (String id){
        ClienteCanino cliente = cliJPA.findClienteCanino(id);        
        return cliente;
    }
    
}
