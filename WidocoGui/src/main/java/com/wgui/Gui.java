package com.wgui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField projectNameField;
	private JTextField projectExportLocationField;
	private JTextField createFromFileField;
	private JTextField createURLField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JRadioButton createFromFile = new JRadioButton("Create template documentation from ontology file");
		buttonGroup.add(createFromFile);
		
		JRadioButton createEmpty = new JRadioButton("Create template documentation from ontology URL");
		buttonGroup.add(createEmpty);
		
		JRadioButton createFromURL = new JRadioButton("Create empty skeleton");
		buttonGroup.add(createFromURL);
		
		projectNameField = new JTextField();
		projectNameField.setColumns(10);
		
		JLabel projectNameLabel = new JLabel("Project name");
		projectNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		projectExportLocationField = new JTextField();
		projectExportLocationField.setText("C:\\Users\\Loyin\\Downloads\\myDocumentation");
		projectExportLocationField.setEditable(false);
		projectExportLocationField.setColumns(10);
		
		JLabel projectExportLocationLabel = new JLabel("Project export location");
		projectExportLocationLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton nextButton = new JButton("Next >");
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JTextPane txtpnSelectTemplate = new JTextPane();
		txtpnSelectTemplate.setText("1. Select template \n2. Load metadata \n3. Load sections \n4. Finish");
		
		createFromFileField = new JTextField();
		createFromFileField.setText("document Path");
		createFromFileField.setEditable(false);
		createFromFileField.setColumns(10);
		
		createURLField = new JTextField();
		createURLField.setText("Insert here the URL of the vocabulary");
		createURLField.setEditable(false);
		createURLField.setColumns(10);
		
		JButton browseBottom = new JButton("Browse");
		
		JSeparator separator = new JSeparator();
		
		JLabel steps = new JLabel("Steps");
		steps.setHorizontalAlignment(SwingConstants.LEFT);
		steps.setFont(new Font("Arial", Font.BOLD, 20));
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel step1desc1 = new JLabel("Step 1: Select a template.");
		step1desc1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel step1desc2 = new JLabel("Choose the type of template you want to create and where to save it");
		step1desc2.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel headImage = new JLabel();
		headImage.setBackground(new Color(255, 255, 255));
		headImage.setIcon(null);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(376)
							.addComponent(nextButton, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(2))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(txtpnSelectTemplate, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addComponent(headImage, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
								.addComponent(projectNameLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(steps)
								.addComponent(projectExportLocationLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(projectNameField, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(4)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(step1desc1, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createFromFile, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createFromURL, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createURLField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createEmpty, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(createFromFileField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(step1desc2, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
										.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(projectExportLocationField, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(browseBottom, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(step1desc1)
							.addGap(10)
							.addComponent(step1desc2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(createFromFile)
							.addGap(4)
							.addComponent(createFromFileField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(createEmpty, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(createURLField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(createFromURL))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(headImage, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(steps)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtpnSelectTemplate, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(projectNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(projectNameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(projectExportLocationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(browseBottom)
						.addComponent(projectExportLocationLabel))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(nextButton)
						.addComponent(cancelButton))
					.addGap(0))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
