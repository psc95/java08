/* 
 *  자기 자신 문자 내용을 변경가능한 STringBuffer 내장 api
 */

public class ObjectTest14 {
	public static void main(String[] args) {
		
		StringBuffer sb01 = new StringBuffer("abc");
		StringBuffer sb02 = new StringBuffer("abc");
		
		System.out.println("sb01 == sb02 ?"+ (sb01 == sb02));//참조 타입을 ==로 비교하면 객체주소를
		//비교한다. 그래서 false
		System.out.println("sb01.equals(sb02) ?"+sb01.equals(sb02));//false=>
		//이유는 StringBuffer 클래스에는 equals()메서드가 오버라이딩이 안되어 있어서 Object클래스의 equals()메서드를
		//상속받아서 사용하기 때문에 객체주소를 비교해서 false이다.
		
		/* 문제)그러면 sb01과 sb02의 각 객체 문자 내용만 비교해서 참이 나오게 소스를 추가코드 해보자.
		 */
		String re01 = sb01.toString();
		String re02 = sb02.toString();
		
		System.out.println("re01.equals(re02) ? "+re01.equals(re02));//문자 내용만 비교해서 참
	}
}
