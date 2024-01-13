package com.espe.dao;
import com.espe.modelo.ClienteBean;
import java.util.ArrayList;
import java.util.List;
import com.espe.idao.IClienteDao;
public class ClienteDaoImplement implements IClienteDao{
    // Lista de clientes
    List<ClienteBean> clientes;

    // inicializar los objetos y agregar a la visa
    public ClienteDaoImplement() {
        clientes = new ArrayList<>();
        ClienteBean cliente1 = new ClienteBean(0, "Angel", "Patiño", "22222222222");
        ClienteBean cliente2 = new ClienteBean(1, "Genesis", "Yanez", "333333333333");
        clientes.add(cliente1);
        clientes.add(cliente2);
    }

    @Override
    public List<ClienteBean> obtenerClientes() {
        return clientes;
    }

    @Override
    public ClienteBean obtenerClientePorID(int id) {
        return clientes.get(id);
    }

    @Override
    public void actuaizarCliente(ClienteBean cliente) {
        clientes.get(cliente.getIdCli()).setNombreCli(cliente.getNombreCli());
        clientes.get(cliente.getIdCli()).setApellidoCli(cliente.getApellidoCli());
        clientes.get(cliente.getIdCli()).setCedulaCli(cliente.getCedulaCli());

        System.out.println("Cliente con ID: "+cliente.getIdCli() + " Actualizado");
    }

    @Override
    public void eliminarCliente(ClienteBean cliente) {
        clientes.remove(cliente.getIdCli());
        System.out.println("Cliente con ID: "+cliente.getIdCli() + " Eliminado");

    }

    @Override
    public void crearCliente(ClienteBean cliente) {
        clientes.add(cliente);
        System.out.println("Cliente creado con ID: " + cliente.getIdCli());
    }

}
