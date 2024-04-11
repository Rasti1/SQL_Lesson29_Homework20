package org.example.app.controller;

import org.example.app.service.UserService;
import org.example.app.view.*;

public class AppController {

    public void runApp(){

        AppView view = new AppView();
        UserService service = new UserService();

        while(true){

            int option = view.getMenu();
            switch (option){
                case 1 -> {
                    CreateUser viewCreate = new CreateUser();
                    viewCreate.getOutput(service.create(viewCreate.getData()));
                }
                case 2 -> {
                    ReadUser viewRead = new ReadUser();
                    viewRead.getOutput(service.read());
                }
                case 3 -> {
                    UpdateUser viewUpdate = new UpdateUser();
                    viewUpdate.getOutput(service.update(viewUpdate.getData()));
                }
                case 4 -> {
                    DeleteUser viewDelete = new DeleteUser();
                    viewDelete.getOutput(service.delete(viewDelete.getData()));
                }
                case 5 -> {
                    ReadById viewId = new ReadById();
                    viewId.getOutput(service.readById(viewId.getData()));
                }
                case 0 -> {
                    view.getOutput("App Closed.");
                    System.exit(0);
                }
                default -> view.getOutput("Incorrect value. Try again.");
            }
        }
    }
}
