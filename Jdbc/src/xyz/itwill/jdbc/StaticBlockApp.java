package xyz.itwill.jdbc;

//Class 객체(Clazz)를 제공받는 방법
//1.Class.forName(String className) 메소드를 호출하여 반환받는 방법
//2.Object.getClass() 메소드를 호출하여 현재 사용중인 클래스에 대한 Class 객체 반환받는 방법
//3.[클래스명.class] 형식으로 표현하는 방법
public class StaticBlockApp {
	public static void main(String[] args) throws ClassNotFoundException {
		//1.JVM은 ClassLoader 프로그램을 이용하여 클래스를 읽어 메모리에 저장
		//2. new 연산자로 메모리에 저장된 클래스객체-clazz라고도함
		//3. 생성된 객체의 메모리 주소(HashCode)를 제공받아 참조변수를 생성하여 저장
		// -참조변수는 메모리의 Stack 영역에 생성
		
		//참조변수에 저장된 메모리 주소로 객체를 참조하여 메소드를 호출
		/* Class.forName(String className) : 문자열로 표현된 패키지가 포함된 클래스를 전달받아 
		 * ClassLoader 프로그램을 사용하여 클래스를 읽어 메모리에 저장하는 메소드*/
		//=>Class 객체(clazz) 반환
		// =>ClassNotFoundException 발생 : 해당 패키지에 클래스가 없는 경우 발생-일반 예외
		Class.forName("xyz.itwill.jdbc.StaticBlock");
		//StaticBlock sb=new StaticBlock();
		//sb.display();
	}
}
