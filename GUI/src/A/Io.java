package A;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Io extends JFrame implements ActionListener{
	JButton Choosing = new JButton("ѡ      ��");
	JButton Printing = new JButton("�����Ϣ");
	
	Io(){
		setTitle("ѧ��");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		add("West",Choosing);add("East",Printing);
		validate();
		Choosing.addActionListener(this);;
		Printing.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Choosing) {
			new Io();
		}
		if(e.getSource()==Printing) {
			try {
				Runtime.getRuntime().exec("D:\\java��ҵ\\GUI\\src\\A\\ѧ��ѡ��.txt");
				} catch (Exception e1) {
					System.out.println("txt��ʧ�ܣ�");
					e1.printStackTrace();
				}
				} 
	   
	}
	public static void main(String[] args) {
		Io c = new Io();
	}
}