package painter;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Point;

public interface Brush {
    public void apply(Point location, GraphicsGroup paintLayer, BrushOptions brushOptions);
    public String getName();
}