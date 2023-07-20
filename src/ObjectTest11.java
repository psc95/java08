/* String 클래스 하위의 내장 메서드 실습
 */
public class ObjectTest11 {
	public static void main(String[] args) {
		
		String s = "Hello";
		char c = s.charAt(1);//charAt(1) 메서드는 주어진 1 인자값에 해당하는 단일 문자를 구한다.첫문자는 0부터 시작
		System.out.println(c); // e
		
		String pwd01 = "56789";
		if(pwd01.equals("56789")) {//문자열 내용값 비번만 비교
			System.out.println("비번이 같다.");
		}else {
			System.out.println("비번이 다르다.");
		}
		
		int idx = s.indexOf('o');//단일 문자 o를 맨 왼쪽에서 부터 찾아서 가장 먼저 나오는 해당 문자 위치번호 첫문자를
		//0부터 시작해서 o문자 위치번호를 반환
		System.out.println("\'Hello\'에서 \'o\'의 위치번호는? "+idx);//4
		System.out.println("\'Hello\'의 문자길이는? "+s.length());//5
		
		String s2 = s.replace("H", "C");//H문자를 C로 변경
		System.out.println(s2);//Cello
	}
}
