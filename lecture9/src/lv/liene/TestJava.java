package lv.liene;

import lv.liene.users.Teacher;

public class TestJava {

	public static void main(String[] args) {

		String[] strArr = new String[12];
		strArr[0] = "Sport";
		strArr[1] = "Math";

		System.out.println(strArr[0] + ", " + strArr[1]);
		
		Teacher teacher1 = new Teacher("Toms", "Riga");
		System.out.println(teacher1.toString());
//		teacher1.addCourse("Sport");
//		teacher1.addCourse("Math");
//		teacher1.addCourse("Biology");
//		teacher1.addCourse("History");
		
		String[] courses = {"Sport", "Math", "Biology", "History"};
		for(String course : courses){
			teacher1.addCourse(course);
		}


	}

}
