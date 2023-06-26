package com.sp.app0626.animal;

// 최상위 클래스인 Object 클래스를 import 하지 않아도 사용 가능한 이유.
// 자바 프로그램 개발시 사용빈도가 아주 높은 경우, java.lang 이라는 패키지에서 주요 클래스들을 지원하며,
// 이 java.lang 패키지는 개발자가 import 하지 않아도 접근이 가능하다. 즉 Object 도 java.lang에 들어있다.

public class Duck extends Bird{
	String name="도날드"; 
	public void fly() {
		System.out.println("오리가 난다");
	}
	
	public static void main(String[] args) {
		Duck d = new Duck();
		d.toString();
		
		String x="5";
		Integer.parseInt(x);
	}
}

// this/ Super/ d... 등은 모두 레퍼런스 변수 인스턴스가 생성되기 전에는 쓸 수 없다. this/Super는 sun사가 정한 레퍼런스 변수명. 변경 불가하다.
// 원본 클래스 Duck 의 name을 main메서드에서 지정 변경 불가하다. -> 인스턴스를 생성해야 함. new Duck();
// main 메서드에서 즉 원본 클래스 코드에서 생성된 인스턴스의 변수나 메서드에 접근하려면 인스턴스 주소값을 가진 레퍼런스 변수를 통해야만 한다.

// 모든 출력 대상은 .앞에 지정된 변수의 자료형이 무엇인지를 따르면 된다. 단!!
// 단!! 자식이 업그레이드 한 경우 즉, 자식의 메서드가 오버라이딩 된 경우! 무조건 자식의 메서드를 호출한다. 오버라이딩 된 경우는 무조건 메서드만 따름 메서드만!!!!!!!!!!!!!

// 모든 클래스는 자식 위주. 즉 자식 인스턴스를 기준으로 상위 객체가 올라가는 것. 하위 객체는 자동으로 올라가지 않는다!


// 상속