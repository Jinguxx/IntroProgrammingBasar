public class Student {

	private String lastName;
	private String firstName;
	private String middleName;
	private int grade;
	
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public int getGrade() {
		return grade;
	}


	public Student(String firstName, String middleName, String lastName,int grade){
      
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.grade = grade;
		
	}

	
	public String toString()
	  {
	    String stu = firstName + " " + middleName + " " + lastName + " " + grade;
	    return(stu);
	

	  }

}
  

