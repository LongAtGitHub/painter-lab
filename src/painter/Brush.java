package painter;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.Point;

public interface Brush {
    public void apply(Point location, CanvasWindow canvas, BrushOptions brushOptions);
}