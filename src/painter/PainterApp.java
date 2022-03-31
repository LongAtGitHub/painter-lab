package painter;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.ui.Button;

import java.awt.Color;

import org.w3c.dom.events.Event;

public class PainterApp {
    private CanvasWindow canvas;
    private final PaintSettingsView paintSettingsView;
    private Brush currentBrush;

    public PainterApp() {
        canvas = new CanvasWindow("Painter", 900, 800);
        currentBrush = new CirclesBrush();

        paintSettingsView = new PaintSettingsView(Color.BLUE, 60);
        BrushOptions brushOptions = paintSettingsView.getBrushOptions();
        canvas.add(paintSettingsView, 10 - paintSettingsView.getBounds().getMinX(), 10);
        

        // Replace with event handlers that use mouse position
        canvas.onMouseDown(event -> currentBrush.apply(event.getPosition(), canvas, brushOptions ));
        canvas.onDrag(event ->  currentBrush.apply(event.getPosition(), canvas, brushOptions));

    }

    private void addBrushButton(Brush brush, double y) {
        Button bu
    }

    public static void main(String[] args) {
        new PainterApp();
    }
}
