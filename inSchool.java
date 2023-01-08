import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class inSchool extends JFrame {
	private JTable table;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new inSchool();
            }
        });
	}
	
	public inSchool() {
		super("inSchool");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);  	
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		String[] columnNames = { "Type", "Name"};
		String[][] data = {
	            { "Bag", "A1" },
	            { "Bag", "A3" },
	            { "Bag", "A8" },
	            { "Bag", "A9" },
	            { "Bag", "A13" },
	            { "Tent", "C5"},
	            { "Tent", "C6"},
	            { "Tent", "C9"}, 
	            { "Tent", "C10"}
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
