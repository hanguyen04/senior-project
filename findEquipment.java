import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class findEquipment extends JFrame {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new findEquipment();
            }
        });
		
	}
	
	public findEquipment() {
		super("findEquipment");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
	}
	
	void init() {
		getContentPane().setLayout(null);
        
        JButton btnNeedReplaced = new JButton("Need Replaced");
        btnNeedReplaced.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		needReplaced nR = new needReplaced (); 
    			nR.show();
    			dispose();		
        	}
        });
        btnNeedReplaced.setBounds(243, 51, 129, 39);
        getContentPane().add(btnNeedReplaced);
        
        JButton btnInSchool = new JButton("In School");
        btnInSchool.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		inSchool iS = new inSchool();
        		iS.show();
        		dispose();
        	}
        });
        btnInSchool.setBounds(243, 129, 129, 39);
        getContentPane().add(btnInSchool);
        
        JButton btnBorrowed = new JButton("Borrowed");
        btnBorrowed.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		borrowed b = new borrowed();
        		b.show();
        		dispose();
        	}
        });
        btnBorrowed.setBounds(243, 207, 129, 39);
        getContentPane().add(btnBorrowed);
        
        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		search s = new search();
        		s.show();
        		dispose();
        	}
        });
        btnSearch.setBounds(61, 287, 119, 39);
        getContentPane().add(btnSearch);
        
        JButton btnHome = new JButton("Home");
        btnHome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mainFrame m = new mainFrame();
        		m.show();
        		dispose();
        	}
        });
        btnHome.setBounds(23, 20, 81, 39);
        getContentPane().add(btnHome);
	}
	
}
