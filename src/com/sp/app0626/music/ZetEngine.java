package com.sp.app0626.music;

// 같은 회사의 모든 개발자가 반드시 구현해야 할 비행 기능 때문에 아래의 클래스를 정의한다.

// interface 란, 기능만을 보유한 객체. 주로 추상 메서드만을 보유한 객체이다. 클래스가 아니기 때문에 다중 상속에 위배되지 않는다.
// +어차피 추상 메서드만을 보한 추상적인 객체 자료형이기 때문에 굳이 abstract을 명시하지 않는다.
public interface ZetEngine {
	
	public void fly();
}
