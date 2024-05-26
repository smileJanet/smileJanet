package practise.practise;

public class Student {
	
	//필드부
	private String name;
	private String subject;
	private int score;
	
	
	//생성자부
	
	public Student() {}
	
	public Student(String name, String subject, int score) {
		this.name =name;
		this.subject=subject;
		this.score= score;
	}//constructor
	
	//메소드부
	
	//setter-getter
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public String information() {
		return "이름: "+name+" / 과목: "+subject+" / 점수: "+ score;
	}
	

}//class
