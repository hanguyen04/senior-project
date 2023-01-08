import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class studentResult extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new studentResult();
            }
        });
	}
	
	public studentResult() {
		super("studentResult");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ben");
		lblNewLabel.setBounds(91, 53, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Group 4, Silver Standard");
		lblNewLabel_1.setBounds(316, 53, 177, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Skill");
		lblNewLabel_2.setBounds(91, 130, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Physical Rec.");
		lblNewLabel_3.setBounds(91, 175, 110, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Service");
		lblNewLabel_4.setBounds(91, 228, 61, 16);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Expedition");
		lblNewLabel_5.setBounds(91, 278, 87, 16);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("In progress");
		lblNewLabel_6.setBounds(271, 130, 87, 16);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("In progress");
		lblNewLabel_7.setBounds(271, 175, 110, 16);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Finished");
		lblNewLabel_8.setBounds(271, 228, 61, 16);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Finished Practice");
		lblNewLabel_9.setBounds(271, 278, 110, 16);
		getContentPane().add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame m = new mainFrame();
				m.show();
				dispose();
			}
		});
		btnNewButton.setBounds(462, 298, 96, 37);
		getContentPane().add(btnNewButton);
		
	}

}
