package org.example.app.view;

import java.util.Scanner;

public class AppView {

    static final Scanner sc = new Scanner(System.in);

    public int getMenu() {
        System.out.print("""
                OPTIONS:
                1 - Create contact.
                2 - Read contacts.
                3 - Update contact.
                4 - Delete contact.
                5 - Read contact by id.
                0 - Close the App.
                """);
        System.out.print("Input your option: ");
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    public void getOutput(String message) {
        System.out.println(message);
    }
}
