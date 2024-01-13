package com.espe.prueba;
import com.espe.dao.ClienteDaoImplement;
import com.espe.idao.IClienteDao;
import com.espe.modelo.ClienteBean;

public class Demo {
    public static void main(String[] args) {
        IClienteDao oclienteDao = new ClienteDaoImplement();

        // Imprimir los clientes antes de crear
        System.out.println("Clientes antes de crear:");
        for (ClienteBean clienteBean : oclienteDao.obtenerClientes()) {
            System.out.println(clienteBean.toString());
        }

        // Crear un nuevo cliente
        ClienteBean nuevoCliente = new ClienteBean(3, "Jhon", "Zambrano", "44444444444");
        oclienteDao.crearCliente(nuevoCliente);

        // Imprimir los clientes después de crear
        System.out.println("*************");
        System.out.println("Clientes después de crear:");
        for (ClienteBean clienteBean : oclienteDao.obtenerClientes()) {
            System.out.println(clienteBean.toString());
        }
    }
}
