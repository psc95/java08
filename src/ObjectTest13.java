/* String 클래스 하위의 내장 메서드를 활용해서 주어진 파일로 부터 파일명과 확장자를 구하는 예제)
 */
public class ObjectTest13 {
	public static void main(String[] args) {
		
		String fullName = "Hello.java";
		
		int index = fullName.indexOf('.');// .를 맨 왼쪽에서 부터 찾아서 가장 먼저 나오는 해당 문자 위치번호를
		System.out.println(index);
		//왼쪽 0부터 시작해서 반환 => 5
		
		/* 문제)Hello.java에서 index변수값 5를 활용해서 String 클래스 하위의 내장메서드를 사용해서 파일명만 구해
		 * 보자.
		 */
		String filename = fullName.substring(0, index);//0이상 5미만 사이의 파일명을 구함
		System.out.println("파일명은 : "+filename);
		
		/* 문제2)Hello.java에서 index변수가 5를 활용해서 String 클래스의 하위의 내장메서드를 사용해서 확장자만
		 * 구해보자.
		 */
		String extension = fullName.substring(index+1);//6이후 부터 마지막 문자까지 구함->java
		System.out.println("확장자명은 : "+extension);
	}
}
