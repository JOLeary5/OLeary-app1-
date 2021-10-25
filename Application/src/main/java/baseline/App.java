/*
 *  UCF COP3330 Summer 2021 baseline.Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*Linked list will be very, very important this assignment, I
 *  feel like once I can get a linked list to work with
 *  the individual classes I can get this programming running smoothly
 */

public class App extends Application {

    // ToDoList ToDoListObject =  new ToDoList


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ApplicationGUI(PROTOTYPE1).fxml"));

        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("To-Do Application");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    // Function void Save To Do list(){
    //
    //    - for (Number of links in linkedList)
    //        - if (linkListItem == Selected)
    //             - Save linked List to a file directory of user choice
    //}


    // Function LinkedList LoadToDoLists(){
    //
    //  File ScanR = new Scanner
    //
    //  parse the data into the main linkedList in the back
    //}

    // Function SelectToDoLists(ToDoX){
    //
    //  ToDoX.selected = true;
    //
    //}
}