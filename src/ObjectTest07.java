import java.util.StringTokenizer;

/* java.util패키지의 STringTokenizer 내장 api클래스 특징)
 *  어떤 특수문자 기호를 기준으로 문자를 분리 즉 파싱해 준다. 분리된 문자를 토큰 문자 또는 파싱된 문자라고 한다.
 *  토큰이 되어진 문자 즉 분리된 문자를 구하는 예제이고 주로 회원정보 수정폼 등에서 활용된다. 파싱된 문자는 딱 한번만 사용가능.
 */
public class ObjectTest07 {
	public static void main(String[] args) {
		String phone = "010-999-9999";
		StringTokenizer ph = new StringTokenizer(phone,"-");//-를 기준으로 폰번호를 분리한다.
		int count = ph.countTokens();//파싱된 문자 즉 분리된 문자 개수
		System.out.println("파싱된 문자 개수 : "+count+" 개");
		
		while(ph.hasMoreElements()) {//분리된 토큰이 있다면 참
			System.out.println(ph.nextToken());//분리된 폰번호를 반환한다.
		}
		System.out.println("===========================>");
		StringTokenizer ph02 = new StringTokenizer(phone,"-");
		System.out.println(ph02.nextToken());//한번 사용된 토큰은 다시 사용못한다. 다시 사용하려면 다시
		//생성해서 사용해야 한다.
		System.out.println(ph02.nextToken());
		System.out.println(ph02.nextToken());//분리된 폰번호 반환
	}
}
