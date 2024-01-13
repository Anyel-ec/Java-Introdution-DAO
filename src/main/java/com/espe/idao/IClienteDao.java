package com.espe.idao;
import com.espe.modelo.ClienteBean;
import java.util.List;
public interface IClienteDao {
    // declaracion de metodos para acceder a la BD
    List<ClienteBean> obtenerClientes();
    ClienteBean obtenerClientePorID(int id);
    void actuaizarCliente(ClienteBean cliente);
    // eliminar
    void eliminarCliente(ClienteBean cliente);
    // crear
    void crearCliente(ClienteBean cliente);

}
