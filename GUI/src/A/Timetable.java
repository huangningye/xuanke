package A;

import java.util.Scanner;

import A.Student;
import A.Teacher;

public class Timetable {
	public static void main(String[] args) {
		Teacher t1,t2,t3;
		Student s1,s2,s3;
		System.out.println("ѧ��ѡ��ϵͳ");
		System.out.println("�γ����£�");	
		t1 = new Teacher(1,"����","��","����","��101","8:00am--10:00am",5);
		System.out.println(t1.toString());
		t2 = new Teacher(2,"����","��","Java","��101","10:20am--12:20am",3);
		System.out.println(t2.toString());
		t3 = new Teacher(3,"����","��","Ӣ��","��102","2:00pm--4:00pm",2);
		System.out.println(t3.toString());
		System.out.println("ѧ����Ϣ  ��   ѧ�ţ�7   ��������һ    �Ա���" );
		s1 = new Student(7,"��һ","��",t1);
		s2 = new Student(7,"��һ","��",t2);
		s3 = new Student(7,"��һ","��",t3);
		System.out.println ("��ѡ��γ̣�");
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		switch(a){
	         case 1:
	            System.out.println("����Ӹÿγ�   "+s1.toString());break;
	         case 2:
	            System.out.println("����Ӹÿγ�"+s2.toString());break;
	         case 3:
	            System.out.println("����Ӹÿγ�"+s3.toString()); break;
	         default:
	            System.out.println("����ѡ");
	      }
		 System.out.println("�����ѡ�Σ�");
		 int b = i.nextInt();
			switch(b){
		         case 1:
		            System.out.println("ע�⣬�ÿγ���ѡ��");break;
		         case 2:
		            System.out.println("����Ӹÿγ�"+s2.toString());break;
		         case 3:
		            System.out.println("����Ӹÿγ�"+s3.toString()); break;
		         default:
		            System.out.println("����ѡ");
		      }
			System.out.println("�����ѡ�Σ�");
			 int c = i.nextInt();
				switch(c){
			         case 1:
			            System.out.println("ע�⣬�ÿγ���ѡ��");break;
			         case 2:
			            System.out.println("ע�⣬�ÿγ���ѡ��");break;
			         case 3:
			            System.out.println("����Ӹÿγ�"+s3.toString()); break;
			         default:
			            System.out.println("����ѡ");
			      }
			System.out.println();
			System.out.println("��ѡ�γ̣�");
			 if( a == 1 ){
				 System.out.println(t1.toString());
		      }
			 if(b == 2 ){
				 System.out.println(t2.toString());	 
		      }
			 else if(b == 3){
				 System.out.println(t3.toString());
			 }
			 if( c == 3 ){
				 System.out.println(t3.toString());
		      }
			 else if(c == 2){
				 System.out.println(t2.toString());
			 }
        System.out.println();
       
        System.out.println("�˿�:");
        int d =i.nextInt();
        System.out.println("ѧ����Ϣ  ��   ѧ�ţ�7   ��������һ    �Ա���" );
        if(d == 1) {
        	  System.out.println("�˿γɹ���");
        	  System.out.println(t2.toString());
        	  System.out.println(t3.toString());
        }else if(d == 2) {
        	System.out.println("�˿γɹ���");
        	System.out.println(t1.toString());
      	    System.out.println(t3.toString());
        }else if(d == 3) {
        	System.out.println("�˿γɹ���");
        	System.out.println(t1.toString());
      	    System.out.println(t2.toString());
        }	
	}
}