package A;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame {
	JPanel jp1,jp2,jp3;  
	JButton Login;
	JLabel user,Id;    
	JTextField jtf1,jtf2;
	final Container c = getContentPane();
	
	void init() {
		Login.addActionListener(new Listener());
	}
	
	public Login() {
		this.setTitle("ѧ������ϵͳ");
		this.setSize(500, 500);
		this.setVisible(true);
		
		jp1 = new JPanel();
		user = new JLabel("�û�����");
		jtf1 = new JTextField(15);
		   jp1.add(user);
		   jp1.add(jtf1);
		   
		jp2 = new JPanel();
	    Id = new JLabel("ѧ�ţ�");
		jtf2 = new JTextField(15);
		 jp2.add(Id);
	     jp2.add(jtf2);
	     
	   jp3 = new JPanel();
	   Login = new JButton("��¼");
	   jp3.add(Login);
	   
	   c.setLayout(new GridLayout(5,1,10,10));
	   c.add(new JPanel());   
	   c.add(jp1);
	   c.add(jp2);
	   c.add(jp3);
	   c.add(new JPanel());
	}
	/*
	 * ���ڼ�����ť��¼
	 */
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s1 = jtf1.getText();
			String s2 = jtf2.getText();
			if(s1.equals("��һ")&&s2.equals("7")) {
				new Timetable();//��ʾѡ�ν���
			} else {
				JOptionPane.showMessageDialog(null, "�û�����ѧ�Ŵ�������������");
			}
		}
	}
	public static void main(String[] args) {
		Login  lg = new Login();
		new Login().init();
	}
}
