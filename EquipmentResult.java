import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class EquipmentResult extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new EquipmentResult();
            }
        });
	}
	
	public EquipmentResult() {
		super("EquipmentResult");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type:");
		lblNewLabel.setBounds(134, 119, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(134, 172, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Status:");
		lblNewLabel_2.setBounds(134, 231, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tent");
		lblNewLabel_3.setBounds(316, 119, 61, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("C19");
		lblNewLabel_4.setBounds(316, 172, 61, 16);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Borrowed by Group 2");
		lblNewLabel_5.setBounds(316, 231, 182, 16);
		getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame m = new mainFrame();
				m.show();
				dispose();
			}
		});
		btnNewButton.setBounds(27, 26, 96, 37);
		getContentPane().add(btnNewButton);
		
	}

}
