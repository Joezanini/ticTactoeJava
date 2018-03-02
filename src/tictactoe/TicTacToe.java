
package tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javax.swing.JOptionPane;


public class TicTacToe extends Application {
    Button b1 = new Button(" ");
    Button b2 = new Button(" ");
    Button b3 = new Button(" ");
    Button b4 = new Button(" ");
    Button b5 = new Button(" ");
    Button b6 = new Button(" ");
    Button b7 = new Button(" ");
    Button b8 = new Button(" ");
    Button b9 = new Button(" ");
    
    int turn = 0;
    
    public void winCheck() {
        if (b1.getText().equals("X") && b2.getText().equals("X") 
                && b3.getText().equals("X") || b4.getText().equals("X") &&
                b5.getText().equals("X") && b6.getText().equals("X") ||
                b7.getText().equals("X") && b8.getText().equals("X") &&
                b9.getText().equals("X") || b3.getText().equals("X") && 
                b5.getText().equals("X") && b7.getText().equals("X") || 
                b1.getText().equals("X") && b5.getText().equals("X") &&
                b9.getText().equals("X") || b1.getText().equals("X") &&
                b4.getText().equals("X") && b7.getText().equals("X") || 
                b2.getText().equals("X") && b5.getText().equals("X") &&
                b8.getText().equals("X") || b3.getText().equals("X") &&
                b6.getText().equals("X") && b9.getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "X wins!");
        } else if (b1.getText().equals("Y") && b2.getText().equals("Y") 
                && b3.getText().equals("Y") || b4.getText().equals("Y") &&
                b5.getText().equals("Y") && b6.getText().equals("Y") ||
                b7.getText().equals("Y") && b8.getText().equals("Y") &&
                b9.getText().equals("Y") || b3.getText().equals("Y") && 
                b5.getText().equals("Y") && b7.getText().equals("Y") || 
                b1.getText().equals("Y") && b5.getText().equals("Y") &&
                b9.getText().equals("Y") || b1.getText().equals("Y") &&
                b4.getText().equals("Y") && b7.getText().equals("Y") || 
                b2.getText().equals("Y") && b5.getText().equals("Y") &&
                b8.getText().equals("Y") || b3.getText().equals("Y") &&
                b6.getText().equals("Y") && b9.getText().equals("Y")) {
            JOptionPane.showMessageDialog(null, "Y wins!");
        }
    }
    
    public void clicker(Button b) {
        if (b.getText().equals(" ")) {
            if (turn == 0) {
                b.setText("X");
                b.setFont(Font.font("Times", FontWeight.EXTRA_BOLD,
                        30));
                turn = 1;
                winCheck();
            } else if (turn == 1) {
                Button bNew = new Button("Y");
                bNew.setFont(Font.font("Times", FontWeight.EXTRA_BOLD, 60));
                b.setText("Y");
                b.setFont(Font.font("Times", FontWeight.EXTRA_BOLD,
                        30));
                turn = 0;
                winCheck();
            }
        }
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        
        
        b1.setMinSize(100, 100);
        b2.setMinSize(100, 100);
        b3.setMinSize(100, 100);
        b4.setMinSize(100, 100);
        b5.setMinSize(100, 100);
        b6.setMinSize(100, 100);
        b7.setMinSize(100, 100);
        b8.setMinSize(100, 100);
        b9.setMinSize(100, 100);
        
        
        
        
        GridPane.setConstraints(b1, 0, 0);
        GridPane.setConstraints(b2, 1, 0);
        GridPane.setConstraints(b3, 2, 0);
        GridPane.setConstraints(b4, 0, 1);
        GridPane.setConstraints(b5, 1, 1);
        GridPane.setConstraints(b6, 2, 1);
        GridPane.setConstraints(b7, 0, 2);
        GridPane.setConstraints(b8, 1, 2);
        GridPane.setConstraints(b9, 2, 2);

        
        pane.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        
        b1.setOnAction((event) -> {
            clicker(b1);
            //winCheck();
        });
        
        b2.setOnAction((event) -> {
            clicker(b2);
            //winCheck();
        });
        
        b3.setOnAction((event) -> {
            clicker(b3);
            //winCheck();
        });
        
        b4.setOnAction((event) -> {
            clicker(b4);
            //winCheck();
        });
        
        b5.setOnAction((event) -> {
            clicker(b5);
            //winCheck();
        });
        
        b6.setOnAction((event) -> {
            clicker(b6);
            //winCheck();
        });
        
        b7.setOnAction((event) -> {
            clicker(b7);
            //winCheck();
        });
        
        b8.setOnAction((event) -> {
            clicker(b8);
            //winCheck();
        });
        
        b9.setOnAction((event) -> {
            clicker(b9);
            //winCheck();
        });
        
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("tic tac toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
