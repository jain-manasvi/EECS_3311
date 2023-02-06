import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener {

	JFrame frame;

	JButton first_year;
	JButton second_year;
	JButton third_year;

	JButton uploadButton;
	JButton coursesButton;
	JLabel label;

	JMenuBar menuBar;

	JMenu profileMenu;

	JMenuItem logout;

	public Dashboard() {

		frame = new Frames();

		uploadButton = new JButton("+");
		uploadButton.setBounds(0, 0, 5, 5);
		uploadButton.setFocusable(false);
		uploadButton.addActionListener(this);

		coursesButton = new JButton("Courses");
		coursesButton.setFocusable(false);
		coursesButton.addActionListener(this);

		first_year = new Buttons("1000-level", false, new Font("Comic Sans", Font.BOLD, 25),
				Color.LIGHT_GRAY, Color.BLACK, BorderFactory.createEtchedBorder());
		first_year.setBounds(0, 0, 200, 80);
		first_year.addActionListener(this);

		second_year = new Buttons("2000-level", false, new Font("Comic Sans", Font.BOLD, 25),
				Color.MAGENTA, Color.cyan, BorderFactory.createEtchedBorder());
		second_year.setBounds(210, 0, 200, 80);
		second_year.addActionListener(this);

		third_year = new Buttons("3000-level", false, new Font("Comic Sans", Font.BOLD, 25),
				Color.RED, Color.cyan, BorderFactory.createEtchedBorder());
		third_year.setBounds(420, 0, 200, 80);
		third_year.addActionListener(this);

		menuBar = new JMenuBar();

		profileMenu = new JMenu("Profile");
		profileMenu.setBorder(BorderFactory.createEtchedBorder());
		JMenuItem logout = new JMenuItem("Logout");
		profileMenu.add(logout);

		menuBar.add(uploadButton);
		menuBar.add(coursesButton);
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(profileMenu);

		frame.setJMenuBar(menuBar);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == coursesButton) {
			frame.add(first_year);
			frame.add(second_year);
			frame.add(third_year);
		}

	}

}
