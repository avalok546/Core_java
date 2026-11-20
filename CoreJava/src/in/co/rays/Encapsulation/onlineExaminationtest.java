package in.co.rays.Encapsulation;

public class onlineExaminationtest {
	public static void main(String[] args) {
		onlineExamination exam = new onlineExamination();
		
		exam.setexamId(14458);
		exam.setsubject("maths");
		exam.setduartion(3);
		exam.settotalQuestion(10);
		exam.settotalMarks(20);
		
		
		
		System.out.println("your exam id" + exam.getexamId());
		System.out.println("subject------"+ exam.getsubject());
		System.out.println("duaration------"+ exam.getduartion());
		System.out.println("total question------"+ exam.gettotalQuestion());
		System.out.println("total marks------"+ exam.gettotalMarks());
		
	}

}
