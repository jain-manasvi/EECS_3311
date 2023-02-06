import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.Border;

public class Buttons extends JButton{

	public Buttons(String name, boolean focus, Font font, Color backgroundColor, Color foregroundColor, 
					Border border) {
		
		this.setText(name);
		this.setFont(font);
		this.setBackground(backgroundColor);
		this.setForeground(foregroundColor);
		this.setBorder(border);
	}

}