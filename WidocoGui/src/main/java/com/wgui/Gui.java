package com.wgui;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Gui extends JFrame {

	private JPanel contentPanel;
	@SuppressWarnings("unused")
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField projectNameField_1;
	private JTextField createFromURLField;
	private JTextField createFromFileField;
	private JTextField projectNameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		setTitle("Step 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 400);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		final CardLayout layout = new CardLayout(0, 0);
		contentPanel.setLayout(layout);
		
		ImageIcon headIcon = new ImageIcon(this.getClass().getClassLoader().getResource("images/widoco.png"));
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JSeparator separator1 = new JSeparator();
		
		JButton nextButton = new JButton("Next >");
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layout.next(contentPanel);
			}
		});
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JTextPane setupField = new JTextPane();
		setupField.setText("1. Select template \n2. Load metadata \n3. Load sections \n4. Finish");
		
		JLabel headImage = new JLabel();
		headImage.setIcon(headIcon);
		
		headImage.setBackground(Color.WHITE);
		
		JLabel projectNameLabel = new JLabel("Project name");
		projectNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel setupLabel = new JLabel("Steps");
		setupLabel.setHorizontalAlignment(SwingConstants.LEFT);
		setupLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel projectExportLocationLabel = new JLabel("Project export location");
		projectExportLocationLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		projectNameField_1 = new JTextField();
		projectNameField_1.setColumns(10);
		
		JLabel step1desc1 = new JLabel("Step 1: Select a template.");
		step1desc1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JRadioButton createFromFile = new JRadioButton("Create template documentation from ontology file");
		
		JRadioButton createFromURL = new JRadioButton("Create empty skeleton");
		
		createFromURLField = new JTextField();
		createFromURLField.setText("Insert here the URL of the vocabulary");
		createFromURLField.setEditable(false);
		createFromURLField.setColumns(10);
		
		JRadioButton createEmpty = new JRadioButton("Create template documentation from ontology URL");
		
		createFromFileField = new JTextField();
		createFromFileField.setText("document Path");
		createFromFileField.setEditable(false);
		createFromFileField.setColumns(10);
		
		JLabel step1desc2 = new JLabel("Choose the type of template you want to create and where to save it");
		step1desc2.setFont(new Font("Arial", Font.BOLD, 12));
		
		JSeparator separator2 = new JSeparator();
		
		projectNameField = new JTextField();
		projectNameField.setText("C:\\Users\\FilePlace\\myDocumentation");
		projectNameField.setEditable(false);
		projectNameField.setColumns(10);
		
		JButton browseButton = new JButton("Browse");
		GroupLayout gl_panel1 = new GroupLayout(panel1);
		gl_panel1.setHorizontalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addComponent(separator1, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel1.createSequentialGroup()
					.addGroup(gl_panel1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel1.createSequentialGroup()
							.addGap(376)
							.addComponent(nextButton, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(2))
						.addGroup(gl_panel1.createSequentialGroup()
							.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(setupField, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addComponent(headImage, Alignment.LEADING))
								.addComponent(projectNameLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(setupLabel)
								.addComponent(projectExportLocationLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
								.addComponent(projectNameField_1, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
								.addGroup(gl_panel1.createSequentialGroup()
									.addGap(4)
									.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
										.addComponent(step1desc1, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createFromFile, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createFromURL, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createFromURLField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createEmpty, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(step1desc2, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(separator2, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addGroup(gl_panel1.createSequentialGroup()
											.addComponent(createFromFileField, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED))))
								.addGroup(gl_panel1.createSequentialGroup()
									.addComponent(projectNameField, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))))
					.addGap(0))
		);
		gl_panel1.setVerticalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel1.createSequentialGroup()
							.addContainerGap()
							.addComponent(step1desc1)
							.addGap(10)
							.addComponent(step1desc2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(separator2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(createFromFile)
							.addGap(4)
							.addComponent(createFromFileField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(createEmpty, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(createFromURLField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(createFromURL))
						.addGroup(gl_panel1.createSequentialGroup()
							.addGap(4)
							.addComponent(headImage)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(setupLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(setupField, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(projectNameField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(projectNameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(projectNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(browseButton)
						.addComponent(projectExportLocationLabel))
					.addGap(18)
					.addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(nextButton)
						.addComponent(cancelButton))
					.addGap(0))
		);
		panel1.setLayout(gl_panel1);
		contentPanel.add(panel1, "name_56571641381500");
		
		JPanel panel4 = new JPanel();
		contentPanel.add(panel4, "name_56874771941700");
		
		JLabel lblNewLabel = new JLabel("You are done!");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel headImage_1 = new JLabel();
		headImage_1.setIcon(headIcon);
		headImage_1.setBackground(Color.WHITE);
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel_1 = new JLabel("The documentation was generated successfully. Now you can:\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_2 = new JLabel("View the ontology documentation in your Web browser\n");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JLabel setupLabel_1 = new JLabel("Steps");
		setupLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		setupLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JTextPane setupField_1 = new JTextPane();
		setupField_1.setText("1. Select template \n2. Load metadata \n3. Load sections \n4. Finish");
		
		JSeparator separator_1 = new JSeparator();
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layout.next(contentPanel);
			}
		});
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		GroupLayout gl_panel4 = new GroupLayout(panel4);
		gl_panel4.setHorizontalGroup(
			gl_panel4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel4.createSequentialGroup()
					.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel4.createSequentialGroup()
							.addComponent(setupLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, gl_panel4.createSequentialGroup()
							.addGroup(gl_panel4.createParallelGroup(Alignment.TRAILING)
								.addComponent(setupField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
								.addComponent(headImage_1, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel4.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel4.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(348))
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
							.addGap(0))
						.addGroup(gl_panel4.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel4.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(1))
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(101))))
				.addGroup(Alignment.TRAILING, gl_panel4.createSequentialGroup()
					.addContainerGap(393, Short.MAX_VALUE)
					.addComponent(btnRestart)
					.addGap(10)
					.addComponent(btnFinish)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel4.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel4.setVerticalGroup(
			gl_panel4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel4.createSequentialGroup()
					.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel4.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(headImage_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(setupLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(setupField_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRestart)
						.addComponent(btnFinish))
					.addContainerGap())
		);
		panel4.setLayout(gl_panel4);
	}
}
