package painter;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;

import edu.macalester.graphics.ui.Button;

import java.awt.Color;
import java.util.List;

/**
 * The whole app
 */
public class PainterApp {
    private CanvasWindow canvas;
    private final PaintSettingsView paintSettingsView;
    private Brush currentBrush;
    private List<Brush> availableBrushes;

    public PainterApp() {
        canvas = new CanvasWindow("Painter", 900, 800);
        GraphicsGroup paintLayer = new GraphicsGroup();
        canvas.add(paintLayer);

        CirclesBrush circlesBrush = new CirclesBrush();
        SprayPaint sprayPaint = new SprayPaint();
        Eraser eraser = new Eraser();
        NormalBrush normalBrush = new NormalBrush();
        currentBrush = sprayPaint;
        availableBrushes = List.of(sprayPaint, circlesBrush, eraser, normalBrush);
        double y_position = 250;
        for (Brush brush: availableBrushes) {
            addBrushButton(brush, y_position);
            y_position+=30;
        }

        paintSettingsView = new PaintSettingsView(Color.BLUE, 60);
        canvas.add(paintSettingsView, 10 - paintSettingsView.getBounds().getMinX(), 10);
        

        // Replace with event handlers that use mouse position
        canvas.onMouseDown(event -> currentBrush.apply(event.getPosition(), paintLayer,  paintSettingsView.getBrushOptions() ));
        canvas.onDrag(event ->  currentBrush.apply(event.getPosition(), paintLayer,  paintSettingsView.getBrushOptions()));

    }

    private void addBrushButton(Brush brush, double y) {
        String title = brush.getName();
        Button button = new Button(title);
        this.canvas.add(button, 10 ,y);
        button.onClick(()-> currentBrush = brush);
    }

    public static void main(String[] args) {
        new PainterApp();
    }
}
