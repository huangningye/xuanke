package A;

class Student extends Person{
	Teacher teacher;
	public Student(int id,String name,String sex,Teacher teacher) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.teacher = teacher;
	}
	public String toString() {
		   return "学生信息  ：       " +"  学号；" + id+ " 姓名：" + name 
				   + " 性别：" + sex+"["+teacher+"]" ;
		   }
		   
}