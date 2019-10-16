/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleanimation;



import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author usuario
 */
public class CircleAnimation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Circle circle = new Circle(125,100, 50);
       circle.setStroke(Color.BLACK);
       circle.setFill(Color.WHITE);
       Rectangle rect = new Rectangle(115,90,10,30);
       rect.setFill(Color.ORANGE);
       PathTransition pt = new PathTransition();
       
       
       
       pt.setDuration(Duration.millis(4000)); 
       pt.setPath(circle); 
       pt.setNode(rect); 
       pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT); 
       pt.setCycleCount(Timeline.INDEFINITE); 
       pt.setAutoReverse(true);
       pt.play(); // Start animation 
       circle.setOnMousePressed(e -> pt.pause()); 
       circle.setOnMouseReleased(e -> pt.play());
        
        Pane root = new Pane();
        root.getChildren().add(circle);
        root.getChildren().add(rect);
        
        
       
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
