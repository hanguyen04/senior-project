import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class checkStudent extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new checkStudent();
            }
        });
	}
	
	public checkStudent() {
		super("checkStudent");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		String standards[] = { "Bronze", "Silver", "Gold" };
		
		JComboBox comboBox = new JComboBox(standards);
		comboBox.setBounds(315, 98, 131, 38);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Standard");
		lblNewLabel.setBounds(176, 108, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(176, 179, 82, 16);
		getContentPane().add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(315, 174, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		String ans = textField.getText();
		
		//studentResult r = new studentResult();
		//r.show();
		//dispose();
		//errorMessage error = new errorMessage();
		//error.show();
		//dispose();
	
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//studentResult r = new studentResult();
				//r.show();
				//dispose();
				errorMessage error = new errorMessage();
				error.show();
				dispose();
			}
		});
		btnNewButton.setBounds(252, 285, 117, 29);
		getContentPane().add(btnNewButton);
		
	}

}
