package stacks.model;

import java.awt.Color;

public class Dish
{
	private boolean isDirty;
	private Color plateColor;
	private int radius;
	
	public Dish(boolean isDirty, Color plateColor, int radius)
	{
		this.isDirty = isDirty;
		this.plateColor = plateColor;
		this.radius = radius;
	}

	public void setDirty(boolean isDirty)
	{
		this.isDirty = isDirty;
	}

	public boolean getDirty()
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
