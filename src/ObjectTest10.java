
class Person extends Object{
	long id;
	
	Person(long id){
		this.id = id;
	}//생성자 오버로딩

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
}

public class ObjectTest10 {
	public static void main(String[] args) {
		Person p01 = new Person(991025L);
		Person p02 = new Person(991025L);
		
		if(p01 == p02) {//참조타입을 ==로 비교하면 객체주소를 비교한다.여기서는 주소값이 달라서 거짓
			System.out.println("p01과 p02는 같은 사람입니다.");
		}else {
			System.out.println("p01과 p02는 다른 사람입니다.");
		}
		
		if(p01.equals(p02)) {//객체주소를 비교하지 않고 내용값만 비교
			System.out.println("p01과 p02는 같은 사람이다.");
		}else {
			System.out.println("p01과 p02는 다른 사람이다.");
		}
	}
}
