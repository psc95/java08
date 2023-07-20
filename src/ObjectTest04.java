/* 자바 기본타입 8개 예약어를 포장해서 클래스화 한 것을 래퍼(Wrapper) 클래스라고 한다.
 * 
 * 래퍼클래스 종류)
 *  기본타입 	래퍼클래스
 *  byte	Byte
 *  short	Short
 *  char	Character
 *  int		Integer
 *  long	Long
 *  float	Float
 *  double	Double
 *  boolean Boolean
 *  
 *  오토박싱 : 기본 타입을 참조 래퍼 타입으로 자동형 변환을 해주는 것을 말한다.
 *  오토 언 박싱 : 참조 래퍼타입을 기본타입으로 자동형 변화을 해주는 것을 말한다.
 *  오토박싱과 오토 언 박싱 문법은 jdk 1.5이후에 추가된 문법으로 적옹 가능하다.
 */
public class ObjectTest04 {
	public static void main(String[] args) {
		
		int n01 = 10;
		int n02;
		Integer num01;
		Integer num02 = new Integer(20);
		
		num01 = n01; //오토박싱
		System.out.println("오토 박싱된 값 = "+num01);
		
		n02 = num02; //오토 언 박싱
		System.out.println("오토 언 박싱된 값 = "+n02);
	}
}
