package weber_3_methodsmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Weber_3_MethodsMadness extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1200, 900);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void setup(GraphicsContext gc) {
        for(int i = 0; i < 13; i++){
            drawCollumnOne(gc, i);
            drawCollumnTwo(gc, i);
        }
    }
    private void drawShapes(GraphicsContext gc) {
        setup(gc);
    }
    private void drawCollumnOne(GraphicsContext gc, int place){
        for(int i = 0; i < 600; i += 50) {
            gc.setFill(Color.BLACK);
            gc.fillRect(place*50, i, 25, 25);
        }
    }
    private void drawCollumnTwo(GraphicsContext gc, int place){
        for(int i = 0; i < 600; i += 50) {
            gc.setFill(Color.BLACK);
            gc.fillRect(25+place*50, i+25, 25, 25);
        }
    }
}