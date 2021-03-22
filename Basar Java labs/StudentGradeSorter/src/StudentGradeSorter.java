import java.io.*;
import java.util.*;

public class StudentGradeSorter {

	
	public static void main(String[] args) {
			String dataF;
			String dataM;
			String dataL;
			Student stu;
			int dataG;	
			String students = "Students.txt";
			String sortedStudents = "students_sorted.txt";
			
			ArrayList<Student> studentList = new ArrayList<Student>();
			try {
				Scanner input = new Scanner(new File(students));
				
				while(input.hasNext()) {
					dataF = input.next();
					dataM = input.next();
					dataL = input.next();
					dataG = input.nextInt();
					stu = new Student(dataF, dataM, dataL, dataG);
					studentList.add(stu);
					
				}
				input.close();
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(studentList);
			sort(studentList);
			System.out.println(studentList);
			
			try{
				PrintWriter output = new PrintWriter(new File(sortedStudents)); 
				int index = 0;
				for( ; ; ) {
					output.print(studentList.get(index).getFirstName() + " ");
					output.print(studentList.get(index).getMiddleName() + " ");
					output.print(studentList.get(index).getLastName() + " ");
					output.println(studentList.get(index).getGrade());
					index++;
					
					if(index > studentList.size()-1) {
						break;
					}
				}
				output.close();
				} 
			catch (IOException e){ System.out.println(e.getMessage());
				}
			
		}

		private static void sort(ArrayList<Student> studentList) {
			int pFill;
			int pTest;
			int pSmallest;
			Student temp;
			for (pFill = 0; pFill < studentList.size(); pFill++) {
				pSmallest = pFill;
				for (pTest = pFill + 1; pTest < studentList.size(); pTest++) {
					if (studentList.get(pTest).getGrade() < studentList.get(pSmallest).getGrade()) {
						pSmallest = pTest;
					} }
				temp = studentList.get(pFill);
				studentList.set(pFill, studentList.get(pSmallest));
				studentList.set(pSmallest, temp);
			} }

	}

	



