import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class borrowed2 extends JFrame {
	private JTable table;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new borrowed2();
            }
        });
	}
	
	public borrowed2() {
		super("borrowed2");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
		
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		String[] columnNames = { "Type", "Name", "Student" };
		String[][] data = {
	            { "Bag", "A2", "Ben" },
	            { "Bag", "A7", "Eva" },
	            { "Compass", "N/A", "Steven"},
	            { "Tent", "C12", "Elaine"}
	    };
		
		table = new JTable(data, columnNames);
		table.setFont(new Font("Heiti TC", Font.PLAIN, 15));
		table.setBounds(57, 39, 504, 292);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 43, 532, 270);
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
		

	}

}
