import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class errorMessage extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new checkStudent();
            }
        });
	}
	
	public errorMessage() {
		super("errorMessage");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Error: Student Not Found");
		lblNewLabel.setBounds(219, 148, 222, 16);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame m = new mainFrame();
				m.show();
				dispose();
			}
		});
		btnNewButton.setBounds(255, 287, 96, 37);
		getContentPane().add(btnNewButton);
	}

}
