// String 클래스 하위의 내장메서드
public class ObjectTest12 {
	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");//,를 기준으로 문자를 분리해서 분리된 문자를 배열에 저장한다.
		
		for(String animal : arr) {
			System.out.println(animal);
		}
		System.out.println("\n===========================\n");
		
		String str = "java.lang.Object";
		String c = str.substring(10);//첫문자를 0부터  시작해서 10이후 부터 마지막 문자까지 Object를 반환
		System.out.println(c);
		
		String p = str.substring(5, 9);//첫문자를 0부터 시작해서 5이상 9미만 사이의 문자 반환=> lang
		System.out.println(p);
	}
}
