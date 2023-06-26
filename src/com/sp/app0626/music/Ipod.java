package com.sp.app0626.music;

// 사원 중 한 명의 개발자가 Ipod을 정의한다.
// 주의) 반드시 mp3 파일 재생 기능, 볼륨 조절 기능 넣어야 함.
// 자바 언어에서 구현 강제의 방법을 찾아보자
public class Ipod extends MusicPlayer implements ZetEngine, Roller{
						/*is a*/						/*is a*/ // 즉, is a 관계로써 형변환이 가능하다!
	// 추상클래스를 상속받은 자식 클래스는, 부모의 재산을 물려받은 것이 아니라 부모의 빚을 떠안은 것이다.
	// 따라서 부모가 물려준 불완전한 메서드의 완성의무를 자식이 부담한다.
	
	public void playMp3() {
		System.out.println("Ipod에서 mp3를 재생합니다");
	}
	
	public void setVolume(int v) {
		System.out.println("Ipod에서 볼륨을 "+v+"로 놓습니다");
	}

	public void fly() {
		System.out.println("Ipod으로 날고 있어");
	}
	
	public void roll() {
		System.out.println("Ipod 타고 구르기");
	}
}
