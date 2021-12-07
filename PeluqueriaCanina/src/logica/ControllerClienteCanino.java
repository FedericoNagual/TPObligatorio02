package logica;

import java.util.List;
import java.util.Random;
import persistencia.ControllerPersistencia;

/**
 *
 * @author Federico
 */
public class ControllerClienteCanino {

    ControllerPersistencia controlLogi = new ControllerPersistencia();

    public void altaClienteCanino(ClienteCanino cliente) {
        controlLogi.crearClienteCanino(cliente);
    }

    public void bajaClietneCanino(String id) {
        controlLogi.eliminarClienteCanino(id);
    }

    public void modificaClienteCanino(ClienteCanino cliente) {
        controlLogi.modificarClienteCanino(cliente);
    }

    public List<ClienteCanino> traerClienteCanino() {
        return controlLogi.traerClienteCanino();
    }

    public ClienteCanino encontrarClienteCanino(String id) {
        return controlLogi.encontrarClienteCanino(id);
    }

    public void altaClienteCanino(String numeroCliente, String nombre, String raza, String color, boolean alergico, boolean especial, String nombreDuenio, String celDuenio, String observaciones) {

        ClienteCanino cliente = new ClienteCanino();
        if (numeroCliente.equals("")) {
            Random rn = new Random();
            int aleatorio= rn.nextInt(101);
            cliente.setNum_cliente(Integer.toString(aleatorio));
        } else {
            cliente.setNum_cliente(numeroCliente);
        }
        cliente.setNombre_perro(nombre);
        cliente.setNombre_duenio(nombreDuenio);
        cliente.setAlergico(alergico);
        cliente.setAtencion_especial(especial);
        cliente.setCelular_duenio(celDuenio);
        cliente.setObservaciones(observaciones);
        cliente.setRaza(raza);
        cliente.setColor(color);

        controlLogi.crearClienteCanino(cliente);
    }

}
