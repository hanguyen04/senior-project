import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class changed extends JFrame {

	private JTable table;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new changed();
            }
        });
	}
	
	public changed() {
		super("changed");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		String[] columnNames = { "Team Name", "Bags L", "Bags S", "Tent L", "Tent S", "Misc." };
		String[][] data = {
	            { "Group 1", "5", "2", "1", "2", "3" },
	            { "Group 2", "1", "3", "0", "2", "2" },
	            { "Group 3", "4", "2", "2", "0", "2" }
	    };
		
		table = new JTable(data, columnNames);
		table.setFont(new Font("Heiti TC", Font.PLAIN, 15));
		table.setBounds(57, 39, 504, 292);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 43, 532, 204);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
		
		JButton btnHome = new JButton("Home");
        btnHome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mainFrame m = new mainFrame();
        		m.show();
        		dispose();
        	}
        });
        btnHome.setBounds(469, 325, 81, 29);
        getContentPane().add(btnHome);
        
        JLabel lblNewLabel = new JLabel("Do you wish to change anything?");
        lblNewLabel.setBounds(94, 268, 236, 16);
        getContentPane().add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Yes");
        btnNewButton.setBounds(371, 263, 97, 29);
        getContentPane().add(btnNewButton);
	}
}
