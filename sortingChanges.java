import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sortingChanges extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new sortingChanges();
            }
        });
	}
	
	public sortingChanges() {
		super("sortingChanges");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Group:");
		lblNewLabel.setBounds(150, 100, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Item:");
		lblNewLabel_1.setBounds(150, 148, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number:");
		lblNewLabel_2.setBounds(150, 201, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(312, 95, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(312, 143, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(312, 196, 130, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changed c = new changed();
				c.show();
				dispose();
			}
		});
		btnNewButton.setBounds(256, 290, 117, 37);
		getContentPane().add(btnNewButton);
	}

}
