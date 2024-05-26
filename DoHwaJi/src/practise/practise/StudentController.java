package practise.practise;

import practise.practise.*;

public class StudentController {

	Student[] sArr = new Student[5]; // Student에서 만든 형식을 바탕으로 5명의 학생을 만들겠다.
	public static final int CUT_LINE = 60;
	
	
	public StudentController() {
		
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student ("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student ("홍길동", "자바", 20);
		
	} // 5개의 객체배열(학생들)을 만들겠다 - 기본생성자 안에 5개의 객체배열 값들을 넣는다.
	// 이게 왜 매개변수 생성자에는 안되지?

	public Student[] printStudent() {
		return sArr;
	} // 객체배열에 있는 데이터(즉 sArr의 데이터들) 반환
	
	int sum = 0;
	public int sumScore() {
		// 객체 배열의 점수 구하기
		//sArr[i].getScore() -> 객체 배열의 점수
		// 그것의 합 구하기
		
		for(int i=0; i<sArr.length;i++) {
			sum += sArr[i].getScore();
		} // 객체배열의 점수의 누적합
		return sum; //sum값 리턴
	}// 객체 배열의 점수를 합한 리턴값
	
	public double[] avgScore() {
		// double배열 만들기
		double[] average= new double[2];
		// 0번째 인덱스와 1번째 인덱스만 필요하므로 칸은 2칸 필요함
		// sumScore의 리턴값을 0번째 인덱스에 저장하기
		
		average[0] = sumScore(); // sum이 아니라 sumScore()메소드가 들어가야 한다. 
		// sum이라 하면 Menu에서 출력 시 sumScore의 sum이 아닌 int sum=0값을 가져온다.
		// sumScore 내 메소드를 가져와야 하는데 sum이라 쓰면 반영이 안된다.
		
		//합의 평균을 1번째 인덱스에 저장하기
		
		average[1] = sum/sArr.length;
		// 합의 평균 : 합 나누기 인원수. 5명이므로 sArr.length
		
		return average;
		//어차피 average 모두 반환할 것이므로 for문 등을 쓸 필요는 없다.
		// average자체가 이미 배혈형 이므로 배열형을 반환하여야 한다.
		
	}
	
}
