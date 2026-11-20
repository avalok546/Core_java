package in.co.rays.Encapsulation;

public class onlineExamination {
	private int examId;
	private String subject;
	private int totalQuestion;
	private int duartion;
	private int totalMarks;
	
	
	public void setexamId (int examId) {
		this.examId = examId;
	}
	public int getexamId() {
		return examId;
	}
	public void setsubject (String subject) {
		this.subject = subject;
	}
	public String getsubject() {
		return subject;
	}
	public void settotalQuestion (int totalQuestion) {
		this.totalQuestion = totalQuestion;
	}
	public int gettotalQuestion() {
		return totalQuestion;
	}
	public void setduartion (int duartion) {
		this.duartion = duartion;
	}
	public int getduartion() {
		return duartion;
	}
	public void settotalMarks (int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int gettotalMarks() {
		return totalMarks;
	}

}
