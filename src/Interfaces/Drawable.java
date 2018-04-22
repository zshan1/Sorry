package Interfaces;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public interface Drawable
{
    void Move(double up,double down, double left, double right);
    void setColor(Color color);
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
    int size();
}