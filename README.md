# Implementation of DAO Pattern in Java

This Java project demonstrates the implementation of the DAO (Data Access Object) pattern to access and manage client data in an application.

## Project Structure

The project is organized into three main packages:

- `com.espe.dao`: Contains the concrete implementation of the DAO for the Client entity.
- `com.espe.idao`: Defines the DAO interface specifying CRUD operations for the Client entity.
- `com.espe.modelo`: Contains the class representing the Client entity.
- `com.espe.prueba`: Contains a test class (`Demo`) demonstrating basic DAO functionality.

## Main Classes

### `ClienteDaoImplement`

This class implements the `IClienteDao` interface and provides CRUD operations for the Client entity. It uses an in-memory list to store Client objects.

### `IClienteDao`

An interface that defines methods to access and manage client data in the database.

### `ClienteBean`

A class representing the Client entity with attributes such as id, name, last name, and ID card. It includes a constructor, getters, setters, and a `toString` method for easy visualization.

### `Demo`

A test class that creates an instance of the DAO, prints the list of clients before and after creating a new client.

## Usage

To use the DAO pattern in your application, follow these steps:

1. Create an instance of the `IClienteDao` interface, for example:
   ```java
   IClienteDao clienteDao = new ClienteDaoImplement();
   ```

2. Use the methods of the interface to perform CRUD operations on the Client entity.

```java
// Get list of clients
List<ClienteBean> clients = clienteDao.obtenerClientes();

// Create a new client
ClienteBean newClient = new ClienteBean(3, "Jhon", "Zambrano", "44444444444");
clienteDao.crearCliente(newClient);
```

## Run the Test Class

The test class `Demo` demonstrates the functionality of the DAO. You can execute it to see the results.

```java
public class Demo {
    public static void main(String[] args) {
        IClienteDao clienteDao = new ClienteDaoImplement();

        // Print clients before creating
        System.out.println("Clients before creating:");
        for (ClienteBean clientBean : clienteDao.obtenerClientes()) {
            System.out.println(clientBean.toString());
        }

        // Create a new client
        ClienteBean newClient = new ClienteBean(3, "Jhon", "Zambrano", "44444444444");
        clienteDao.crearCliente(newClient);

        // Print clients after creating
        System.out.println("*************");
        System.out.println("Clients after creating:");
        for (ClienteBean clientBean : clienteDao.obtenerClientes()) {
            System.out.println(clientBean.toString());
        }
    }
}
```
