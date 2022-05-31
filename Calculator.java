import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 
import javafx.event.EventHandler; 
import javafx.event.ActionEvent;
         
public class Calculator extends Application { 
   @Override 
   public void start(Stage stage) {      
      Text text1 = new Text("number1");        
      Text text2 = new Text("number2");
      Text text3 = new Text("result"); 
       
      TextField textField1 = new TextField();       
      TextField textField2 = new TextField();  
      TextField textField3 = new TextField();  
       
      //Creating Buttons 
      Button button1 = new Button("Add"); 
      Button button2 = new Button("Substract");  
      Button button3 = new Button("Multiply");  
      Button button4 = new Button("Divide");  
      Button button5 = new Button("Close");  
      
      //Handle the calculate button
      EventHandler<ActionEvent> addEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                textField3.setText(Integer.toString(Integer.parseInt(textField1.getText())+ Integer.parseInt(textField2.getText())))
            }
        };
       button1.setOnAction(addEvent); 

        EventHandler<ActionEvent> subEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                textField3.setText(Integer.toString(Integer.parseInt(textField1.getText())- Integer.parseInt(textField2.getText())))
            }
        };
       button2.setOnAction(subEvent); 

       EventHandler<ActionEvent> mulEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                textField3.setText(Integer.toString(Integer.parseInt(textField1.getText()) * Integer.parseInt(textField2.getText())))
            }
        };
       button3.setOnAction(mulEvent); 


       
       EventHandler<ActionEvent> divEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                textField3.setText(Integer.toString(Integer.parseInt(textField1.getText()) / Integer.parseInt(textField2.getText())))
            }
        };
       button4.setOnAction(divEvent); 

      button5.setOnAction((event)=>{
         System.exit(0);
      })
       

      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane 
      gridPane.setMinSize(400, 200); 
      
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0); 
      gridPane.add(textField1, 1, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(textField2, 1, 1); 
      gridPane.add(text3, 0, 2);       
      gridPane.add(textField3, 1, 2); 
      gridPane.add(button1, 0, 3); 
      gridPane.add(button2, 1, 3); 
      gridPane.add(button3, 2, 3); 
      gridPane.add(button4, 3, 3); 
      gridPane.add(button5, 4, 3); 
       
       
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
       
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}