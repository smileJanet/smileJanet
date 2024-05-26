package practise.practise;

import practise.practise.*;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	// StudentController라는 객체배열 자료형에 ssm이라는 이름을 붙여주고 heap 메모리에 생성하였다. 
	// StudentController의 메소드를 불러와서 쓰고 싶을 때 ssm을 붙이면 된다.
	
	public StudentMenu() {
		
		System.out.println("========학생 정보 출력========");
		
		//StudentController에서 printStudent()의 반환값을 통해 학생 정보 출력
		
		Student[] sArr = ssm.printStudent(); // sArr이 ssm.printStudent메소드에 있는 배열임을 알려줌 -> sArr이 뭔지 알려줘야한다.
		for(int i=0; i<5; i++) {
			System.out.println(sArr[i].information());
		}
		// 위에서 sArr이 뭔지 연결해주었으므로 이제 값을 출력시킬 수 있게 해야 한다. 
		
		
		System.out.println("========학생 성적 출력========");
		
		// StudentController에 avgScore()을 통해 점수 합계와 평균을 출력
		double[] average = ssm.avgScore(); // average배열이 ssm.avgScore메소드에 있는 배열임을 알려줌 -> average가 뭔지 알려줘야한다.
		
		System.out.println("학생 점수 합계: "+average[0]);
		System.out.println("학생 점수 평균: "+average[1]);
		
		// average는 avgScore의 메소드에서 값을 가져오므로 합계, 평균점수를 가져 오르면 sum이 아닌 sumScore을 제시해야 한다.
		
		System.out.println("========학생 결과 출력========");
		
		// cutline 미만이면 재시험, 이상이면 통과
		for(int i=0; i<sArr.length;i++) {
			if(sArr[i].getScore()<ssm.CUT_LINE) {
				System.out.println(sArr[i].getName()+" 님은 재시험 대상입니다.");
			}else {
				System.out.println(sArr[i].getName()+"님은 통과입니다.");
			}
		}
		
		
		
		
	}

}
