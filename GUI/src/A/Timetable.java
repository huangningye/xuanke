package A;

import java.util.Scanner;

import A.Student;
import A.Teacher;

public class Timetable {
	public static void main(String[] args) {
		Teacher t1,t2,t3;
		Student s1,s2,s3;
		System.out.println("学生选课系统");
		System.out.println("课程如下：");	
		t1 = new Teacher(1,"张三","男","高数","教101","8:00am--10:00am",5);
		System.out.println(t1.toString());
		t2 = new Teacher(2,"李四","男","Java","机101","10:20am--12:20am",3);
		System.out.println(t2.toString());
		t3 = new Teacher(3,"王五","男","英语","教102","2:00pm--4:00pm",2);
		System.out.println(t3.toString());
		System.out.println("学生信息  ：   学号；7   姓名：王一    性别：男" );
		s1 = new Student(7,"王一","男",t1);
		s2 = new Student(7,"王一","男",t2);
		s3 = new Student(7,"王一","男",t3);
		System.out.println ("请选择课程：");
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		switch(a){
	         case 1:
	            System.out.println("已添加该课程   "+s1.toString());break;
	         case 2:
	            System.out.println("已添加该课程"+s2.toString());break;
	         case 3:
	            System.out.println("已添加该课程"+s3.toString()); break;
	         default:
	            System.out.println("请重选");
	      }
		 System.out.println("请继续选课：");
		 int b = i.nextInt();
			switch(b){
		         case 1:
		            System.out.println("注意，该课程已选！");break;
		         case 2:
		            System.out.println("已添加该课程"+s2.toString());break;
		         case 3:
		            System.out.println("已添加该课程"+s3.toString()); break;
		         default:
		            System.out.println("请重选");
		      }
			System.out.println("请继续选课：");
			 int c = i.nextInt();
				switch(c){
			         case 1:
			            System.out.println("注意，该课程已选！");break;
			         case 2:
			            System.out.println("注意，该课程已选！");break;
			         case 3:
			            System.out.println("已添加该课程"+s3.toString()); break;
			         default:
			            System.out.println("请重选");
			      }
			System.out.println();
			System.out.println("已选课程：");
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
       
        System.out.println("退课:");
        int d =i.nextInt();
        System.out.println("学生信息  ：   学号；7   姓名：王一    性别：男" );
        if(d == 1) {
        	  System.out.println("退课成功！");
        	  System.out.println(t2.toString());
        	  System.out.println(t3.toString());
        }else if(d == 2) {
        	System.out.println("退课成功！");
        	System.out.println(t1.toString());
      	    System.out.println(t3.toString());
        }else if(d == 3) {
        	System.out.println("退课成功！");
        	System.out.println(t1.toString());
      	    System.out.println(t2.toString());
        }	
	}
}