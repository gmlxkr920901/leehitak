package kr.or.test;

import java.io.IOException;
import java.io.InputStreamReader;

import org.edu.vo.MemberVO;

/**
 * * 자바에서 예외처리하는 테스트 클래ㅡㅅ
 * @author gmlxk
 *
 */
public class ExceptionTest {

	public static void main(String[] args) {
		//toString메서드에 대해...
		MemberVO memberVO = new MemberVO();//jsp폼데이터를 set으로 저장, get으로 출력
		//멤버클래스에 값을 입력해 봅니다. 메모리에..
		memberVO.setUser_id("leehitak");
		memberVO.setUser_name("이희탁");
		memberVO.setEmail("leehitak@abc.com");
		System.out.println("회원정보 클래스의 멤버변수 값들을 출력하기 = " + memberVO.getUser_name() + 
		memberVO.toString()
		);
		// 진입 실행 메서드 main()
		// 메서드 내부변수
		String[] stringArray = {"10", "2a", "100"};
		int indexValue = 0;
		for(int cnt=0;cnt<=2;cnt++) {
			
			/*
			indexValue = Integer.parseInt(stringArray[cnt]);//배열의 문자값을 int형변환
			System.out.println(cnt + " 번째 배열에 저장된 숫자는 = " + indexValue);
			 */			
			try {
				indexValue = Integer.parseInt(stringArray[cnt]);
				System.out.println((cnt+1) + " 번째 배열에 저장된 숫자는 = " + indexValue);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("에러메시지 출력" + e.toString());
				System.out.println("배열의 크기가 올바르지 않습니다.");
			}catch(NumberFormatException e) {
				System.out.println("에러메시지 출력" + e.toString());
				System.out.println("개발자가 지정한 에러메세지는 숫자 변환시 에러가 발생 되었음.");
			}finally {
				System.out.println("finally는 try~catch 결과와 상관없이 항상 실행");
			}
		}

	}
}