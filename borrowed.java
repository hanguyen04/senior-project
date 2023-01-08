import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class borrowed extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new borrowed();
            }
        });
	}
	
	public borrowed() {
		super("borrowed");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Standards");
		lblNewLabel.setBounds(268, 115, 73, 16);
		getContentPane().add(lblNewLabel);
		
		String standards[] = { "Bronze", "Silver", "Gold" };
		
		JComboBox comboBox = new JComboBox(standards);
		comboBox.setBounds(237, 158, 131, 38);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrowed2 b = new borrowed2 (); 
    			b.show();
    			dispose();
			}
		});
		btnNewButton.setBounds(431, 295, 117, 38);
		getContentPane().add(btnNewButton);
		
	}

}
