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
		   return "ѧ����Ϣ  ��       " +"  ѧ�ţ�" + id+ " ������" + name 
				   + " �Ա�" + sex+"["+teacher+"]" ;
		   }
		   
}