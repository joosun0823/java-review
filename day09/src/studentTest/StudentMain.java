package studentTest;


public class StudentMain {
	public static void main(String[] args) {
		Student st = new Student("김주선", "외식경영학과", 25, 2);
		
		st.printStudent();
		double score = st.avgScore(90,50);
		System.out.println(score);
		System.out.println(st.gradeScore(score));
		
		
	}
}
