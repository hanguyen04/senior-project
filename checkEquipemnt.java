import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkEquipemnt extends JFrame {
	
	public static void main(String[] args) {	
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new checkEquipemnt();
            }
        });	
	}
	
	public checkEquipemnt() {
		super("checkEquipemnt");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findEquipment f = new findEquipment();
				f.show();
				dispose();
			}
		});
		btnNewButton.setBounds(251, 116, 117, 38);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sort");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sorted s = new sorted();
				s.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(251, 220, 117, 38);
		getContentPane().add(btnNewButton_1);
	}

}
