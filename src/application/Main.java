package application;

import entities.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Client[] clients = new Client[10];
        Client[] rooms = new Client[10];

        System.out.print("How many students will stay? ");
        int student = sc.nextInt();

        sc.nextLine();
        if (student > 0 && student <= rooms.length) {
            for (int i = 0; i < student; i++) {
                System.out.println("I need the email and name of the student who will stay: ");
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("E-mail: ");
                String email = sc.nextLine();

                clients[i] = new Client(name, email);
            }

            for (int i = 0; i < student; i++) {
                System.out.print("What is the room number you want? ");
                int numberRoom = sc.nextInt();

                while (numberRoom < 0 || numberRoom > 9 || rooms[numberRoom] != null) {
                    System.out.print("Choose another room: ");
                    numberRoom = sc.nextInt();
                }
                rooms[numberRoom] = clients[i];
            }
            for (int i = 0; i < rooms.length; i++){
                if (rooms[i] != null){
                    System.out.println("Room " + i + " occupied, client: " + rooms[i]);
                }
            }

        }

        sc.close();
    }
}