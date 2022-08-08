// Create array of object of class   Student with attributes Enrollment_no, Name, Sem, CPI for 5 
// students, scan their information and print it. 

class   Student{
	long Enrollment_no;
	String Name;
	int Sem;
	double Cpi;

	  Student(long Enrollment_no,String Name,int Sem,double Cpi){
		this.Enrollment_no=Enrollment_no;
		this.Name=Name;
		this.Sem=Sem;
		this.Cpi=Cpi;
	}

	public void displydata(){
		System.out.println("Enrollment no is:"+Enrollment_no);
		System.out.println("Name:"+Name);
		System.out.println("Semester:"+Sem);
		System.out.println("Cpi is:"+Cpi);
		System.out.println();
	}
}

public class Student_Detail{
	public static void main(String[] args) {
		//Scanner S=new Scanner(System.in);
		  Student obj[]=new   Student[5]; //Here ojb is Reference
		obj[0]=new   Student(101,"A",3,8.7);
		obj[1]=new   Student(102,"B",6,8.9);
		obj[2]=new   Student(103,"C",3,7.7);
		obj[3]=new   Student(104,"D",5,8.5);
		obj[4]=new   Student(105,"E",4,6.7);

		for(int i=0;i<5;i++){
			obj[i].displydata();
		}
	}
}