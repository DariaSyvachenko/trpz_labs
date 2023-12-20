import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1"; // IP-адреса сервера
        final int SERVER_PORT = 12345; // Порт сервера

        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream())) {

            Task newTask = new Task();
            newTask.setTaskId(1);
            newTask.setTaskName("Нове завдання");
            newTask.setTaskDescription("Опис нового завдання");

            objectOutputStream.writeObject(newTask);

            String response = (String) objectInputStream.readObject();
            System.out.println("Сервер відповів: " + response);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
