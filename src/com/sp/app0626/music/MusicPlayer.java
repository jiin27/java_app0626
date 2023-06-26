package com.sp.app0626.music;

public abstract class MusicPlayer {
	// 아래의 메서드는 실수가 아닌 고의로 불완전하게 정의했다.
	// 몸체 즉 {}가 없는 메서드를 가리켜 추상 메서드라 한다.
	// 추상 메서드는 개발 시점에 그 내용을 알 수 없거나, 작성하지 않아야할 때.
	// 즉, 내용 없이 기준만을 세울 때 사용된다.
	// 단 하나라도 추상 메서드가 포함된 클래스는 불완전하다 하여 
	// 전체가 추상클래스가 돼 버린다. -> 메인 클래스 명에도 abstract 붙여야 한다.
	public abstract void playMp3(); // 불완전한 메서드 = 추상 메서드
	public abstract void setVolume(int v); // 볼륨을 조절한다.
	
	public void charge() { // 추상 메서드가 아닌 메서드와 섞어 쓸 수 있다.
		
	}
}
