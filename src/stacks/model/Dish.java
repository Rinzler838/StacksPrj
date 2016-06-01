package stacks.model;

import java.awt.Color;

public class Dish
{
	private boolean isDirty;
	private Color plateColor;
	private int radius;

public void setDirty(boolean isDirty)
{
	this.isDirty = isDirty;
}

public boolean isDirty()
{
	return isDirty;
}

public void setColor(Color plateColor)
{
	this.plateColor = plateColor;
}

public Color getColor()
{
	return plateColor;
}

public void setRadius(int radius)
{
	this.radius = radius;
}

public int getRadius()
{
	return radius;
}

}




