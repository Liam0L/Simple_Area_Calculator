// Java Program to calculate Area of Triangle or Rectangle

import javax.swing.JOptionPane; // Dialog box methods

public class Area
{
	public static void main(String[] args) 
	{
		double shape, length, width, base, height, area;
		String shapeStr, lengthStr, widthStr, baseStr, heightStr;

		/* Get data in string form: convert to float */
 		shapeStr = JOptionPane.showInputDialog("Rectangle [1] or Triangle [2]?, Please enter the corresponding number to make a selection.");
		shape = Double.parseDouble(shapeStr);
		
		if (shape == 1)
		{
			lengthStr = JOptionPane.showInputDialog("Enter Length: ");
			length = Double.parseDouble(lengthStr);

			widthStr = JOptionPane.showInputDialog("Enter Width: ");
			width = Double.parseDouble(widthStr);	
			
			area = length + width;
			JOptionPane.showMessageDialog(null, "Area of Rectangle = " + area );
		}
		 
		if(shape == 2) 
		{
			baseStr = JOptionPane.showInputDialog("Enter Base Width: ");
			base = Double.parseDouble(baseStr);
			
			heightStr = JOptionPane.showInputDialog("Enter Height: ");
			height = Double.parseDouble(heightStr);
			
			area = (base/2)*height;
			JOptionPane.showMessageDialog(null, "Area of Triangle = " + area);
			
		}
		else if (shape != 1 && shape != 2)
		{
				JOptionPane.showMessageDialog(null, "Incorrect Entry, Please Try Again");		
		}
		
		System.exit(0); // Terminate program
	}
}
