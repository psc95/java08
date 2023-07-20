import java.util.Calendar;
import java.util.GregorianCalendar;

/* java.util 패키지의 GregorianCalendar api를 사용해서 올해가 윤년인지 아닌지를 판단 해본다.
 */
public class ObjectTest09 {
	public static void main(String[] args) {
		
		GregorianCalendar gcal = new GregorianCalendar();
		
		int year = gcal.get(Calendar.YEAR);//년도
		int month = gcal.get(Calendar.MONTH)+1;//월, +1을 한 이유는 1월이 0으로 반환되기 때문이다.
		int date = gcal.get(Calendar.DATE);//일
		
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		System.out.print(year+"년은 ");
		if(gcal.isLeapYear(year)) {//isLeapYear()메서드는 해당 년도가 윤년인지 아닌지를 판단
			System.out.println(" 윤년입니다.");
		}else {
			System.out.println(" 윤년이 아닙니다.");
		}
	}
}
