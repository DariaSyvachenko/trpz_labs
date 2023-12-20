import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        final int PORT = 12345; // Порт сервера

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер запущений...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream())) {

                    Task receivedTask = (Task) objectInputStream.readObject();

                    if (receivedTask != null) {
                        System.out.println("Отримано нове завдання:");
                        System.out.println("ID завдання: " + receivedTask.getTaskId());
                        System.out.println("Назва завдання: " + receivedTask.getTaskName());
                        System.out.println("Опис завдання: " + receivedTask.getTaskDescription());
                    } else {
                        System.out.println("Помилка: Отримано пусте завдання.");
                    }


                    objectOutputStream.writeObject("Завдання отримано та оброблено на сервері.");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
