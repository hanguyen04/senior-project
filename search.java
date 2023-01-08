import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class search extends JFrame {
	private JTextField textField;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new search();
            }
        });
	}
	
	public search() {
		super("search");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		String types[] = { "Bag", "Tent" };
		
		JComboBox comboBox = new JComboBox(types);
		comboBox.setBounds(315, 98, 131, 38);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Item");
		lblNewLabel.setBounds(176, 108, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Item Name");
		lblNewLabel_1.setBounds(176, 179, 82, 16);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(315, 174, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				EquipmentResult r = new EquipmentResult();
				r.show();
				dispose();
			}
		});
		btnNewButton.setBounds(252, 285, 117, 29);
		getContentPane().add(btnNewButton);
		
	}
}
