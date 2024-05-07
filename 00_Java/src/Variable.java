
public class Variable {

	public static void main(String[] args) {
		// 1.정수 2.문자 3.문자열 4.실수 5.논리형(참,거짓)
		
		// 1. 정수 byte short int long
		// byte = 1byte = 8bit
		byte 바이트 = 1;
		System.out.println("바이트");
		System.out.println(바이트);
		//파일을 저장할 때 ctrl + s 를 눌러주면 저장됨
		byte bt = 2;
		System.out.println(bt);
		
		short 쇼트 = 3;
		System.out.println(쇼트);
		
		int 인트 = 1;
		System.out.println(인트);
		
		// byte 자료형 선언 선언이름 bte bte 안에 숫자 2 넣고 출력하기
		// short 자료형 선언 선언이름 shrt shrt 안에 숫자 2 넣고 출력하기
		// int 자료형 선언 선언이름 nt nt 안에 숫자 2 넣고 출력하기
		// long 자료형 선언 선언이름 lng lng 안에 숫자 2 넣고 출력하기
		byte bte = 2;
		System.out.println(bte);
		short shrt =2;
		System.out.println(shrt);
		int nt = 2;
		System.out.println(nt);
		long lng = 2;
		System.out.println(lng);
		
		// 2. 문자 char String
		char myChar = 'A';
		System.out.println(myChar);
		// 문자를 나타내는 char은 '' 작은 따옴표를 사용해서 표현
		// "" 큰 따옴표는 String 문자열을 나타내는 표현
		
		//char myChar2 = "A";
		//System.out.println(myChar2);
		//char 에는 하나의 문자만 담을 수 있기 때문에
		// A나 B 둘 중 하나만 작성 가능
		
		/*
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * char myChar5 = '가나다';
		 * 모두 문자가 하나가 아니기 때문에 출력할 수 없음
		 * */	
		
		//String
		String str1 = "와 드디어 문자다~~";
		System.out.println(str1);
		
		//String을 사용해서 본인의 이름 출력하기
		String name = "권혁철";
		
		/*
		 * System.out.print("당신의 이름은 ");
		 * System.out.println(name);
		 * System.out.print("입니다.");
		 */		
		
		System.out.print("당신의 이름은 ");
		System.out.println(name + "입니다.");
		// 만약에 여러 글자나 내용을 한 줄로 출력하고 싶다면
		// + 를 사용해서 이어서 출력할 수 있음
		System.out.println("당신의 이름은"+name+"입니다.");
		// 원하는 건 당신의 이름은 ㅇㅇㅇ 입니다.
		System.out.println("당신의 이름은 "+name+" 입니다.");
		System.out.println("당 신 의 이 름 은 "+name+" 입 니 다.");
		// 띄어쓰기를 넣고 싶은 경우 "" 큰 따옴표 내부에 띄어쓰기를 넣어야 함
		
		// 정수 + 문자 + 문자열 출력하기
		/*
		 * 안녕하세요. 저는요. 서울에 사는 ㅇㅇㅇ 입니다.
		 * 제 전화번호는 111-222-3333입니다.
		 * 제 주민번호는 비밀입니다.
		 * 제 혈액형은 A형입니다.
		 */
		String greeting = "안녕하세요. ";
		String introduction = "저는요. 서울에 사는 ㅇㅇㅇ";
		String end = " 입니다.";
		int number1 = 111;
		int number2 = 222;
		int number3 = 3333;
		char dash = '-';
		String secret = "비밀";
		String bloodType = "A형";
		
		System.out.println(greeting+introduction+end);
		System.out.println("제 전화번호는 "+number1+dash+number2+dash+number3+end);
		System.out.println("제 주민번호는 "+secret+end);
		System.out.println("제 혈액형은 "+bloodType+end);
		
		System.out.print(number1+dash+number2+dash+number3);
		// 111+222+3333의 값인 3756이 출력됨
		// 나중에 가면 int보다 String을 많이 사용
		String number = "111-222-3333";
		System.out.println("제 전화번호는 "+number+end);
		
		// 4. 실수, 5. 논리형
		// 실수는 float과 double이 있음
		// 실수는 기본으로 double 형식으로 되어있음
		// float = 4byte, double = 8byte
		// float에 실수를 담기 위해서는 f를 붙여줘야 함
		// 실수 뒤에 f를 붙일 때 대,소문자 구분 없이 사용 가능
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		System.out.println("ff1 은 : "+ff1+" 이다.");
		System.out.println("ff2 는 : "+ff2+" 이다.");
		
		// double은 크기가 float보다 크고 애초에 double을 넣으려 했기 때문에
		// 뒤에 다른 수식을 붙이지 않아도 사용할 수 있음 
		double dd1 = 3.14;
		System.out.println(dd1);
		
		// 5. 논리형
		// boolean을 사용해서 true인지 false인지 표현할 수 있음
		// 나중에 알고리즘이나 if for while 문을 사용할 때 자주 사용
		
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("오늘 날씨는 "+isTrue);
		System.out.println("내일 날씨는 "+isFalse+" ?");
		
		// 정수 문자 문자열 실수 논리형
		int num = 10;
		System.out.println("정수 num의 값 = "+num);
		
		char ch = 'Z';
		System.out.println("문자 ch 의 값 = "+ch);
		
		String text = "Hello, World!";
		System.out.println("문자열은 text = "+text);
		
		double db1 = 3.14;
		System.out.println(db1);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = "+isTrue2);
		
		// num에다가 10 대신 20을 넣고 싶다면?
		
		int 숫자 = 10;
		System.out.println("숫자의 값 = "+숫자);
		숫자 = 20;
		System.out.println("20으로 변경한 숫자의 값 = "+숫자);
		
		// 지정값은 처음 1회만 사용한 후
		// 변수명에 다른 숫자나 값을 넣을 때는
		// 지정값을 생략한다.
		
		/*
		 * 철수는 19살이었다.
		 * 그런데 24년이 되면서 20살이 되었다.
		 */
		String name1 = "철수";
		String age = "19";
		System.out.println(name1+"는 "+age+"살이었다.");
		age = "20";// age 값을 20으로 변경
		System.out.println("그런데 24년이 되면서 "+age+"살이 되었다.");
	}

}
