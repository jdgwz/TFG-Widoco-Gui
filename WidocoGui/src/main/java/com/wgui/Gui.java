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

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCusersloyindownloadsmydocumentation;
	private JTextField txtDocumentPath;
	private JTextField txtInsertHereThe;

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
		setBounds(100, 100, 600, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Create template documentation from ontology file");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Create template documentation from ontology URI");
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Create empty skeleton");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Project name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		txtCusersloyindownloadsmydocumentation = new JTextField();
		txtCusersloyindownloadsmydocumentation.setText("C:\\Users\\Loyin\\Downloads\\myDocumentation");
		txtCusersloyindownloadsmydocumentation.setEditable(false);
		txtCusersloyindownloadsmydocumentation.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Project export location");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnNewButton = new JButton("Next >");
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JTextPane txtpnSelectTemplate = new JTextPane();
		txtpnSelectTemplate.setText("1. Select template \n2. Load metadata \n3. Load sections \n4. Finish");
		
		txtDocumentPath = new JTextField();
		txtDocumentPath.setText("document Path");
		txtDocumentPath.setEditable(false);
		txtDocumentPath.setColumns(10);
		
		txtInsertHereThe = new JTextField();
		txtInsertHereThe.setText("Insert here the URL of the vocabulary");
		txtInsertHereThe.setEditable(false);
		txtInsertHereThe.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("Browse");
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel_2 = new JLabel("Steps");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblNewLabel_3 = new JLabel("Step 1: Select a template.");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_3_1 = new JLabel("Choose the type of template you want to create and where to save it");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setContentType("image");
		editorPane.setEditable(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCusersloyindownloadsmydocumentation, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel_2)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtpnSelectTemplate, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
											.addComponent(editorPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(rdbtnNewRadioButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(rdbtnNewRadioButton_1_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(txtInsertHereThe, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(rdbtnNewRadioButton_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(txtDocumentPath, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(lblNewLabel_3_1, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
								.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(376)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(2)))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)
							.addGap(10)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton)
							.addGap(4)
							.addComponent(txtDocumentPath, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtInsertHereThe, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnNewRadioButton_1_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtpnSelectTemplate, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtCusersloyindownloadsmydocumentation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_1_1))
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(0))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
