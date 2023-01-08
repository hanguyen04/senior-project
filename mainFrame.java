import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.Font;

public class mainFrame extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new mainFrame();
            }
        });
	}
	
	public mainFrame() {
		super("mainFrame");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Duke of Edinburg International Award Database");
		lblNewLabel.setFont(new Font("Heiti SC", Font.PLAIN, 15));
		lblNewLabel.setBounds(124, 106, 358, 16);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Student");
		btnNewButton.setFont(new Font("Louis George Cafe", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStudent cs = new checkStudent (); 
				cs.show();
				dispose();
			}
		});
		
		btnNewButton.setBounds(238, 163, 117, 37);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Equipments");
		btnNewButton_1.setFont(new Font("Louis George Cafe", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkEquipemnt ce = new checkEquipemnt (); 
				ce.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(238, 225, 117, 37);
		getContentPane().add(btnNewButton_1);	
	
	}

}
