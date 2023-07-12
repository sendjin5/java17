package sec1;

public class Example3 {
    //변수명 규칙 (기본규칙, 회사마다 다름, 가장 맨 위에 있으며, 누구든지 쉽게 알 수 있게 해야한다)
    //1. 영문 소문자로 시작(class 등 사용 불가)
    //2. 예약어는 사용할 수 없음(키워드)
    //3. 변수명 중간에 공백을 넣을 수 없다. / int a b (X) / 윈도우는 대문자 소문자 구분 불가, 리눅스는 구분가능(자바)
    //4. 시작시 $ 또는 _(언더스코어)로 시작할 수 있음
    //5. 대분자와 소문자가 서로 엄격히 다름
    //관례
    //1. 누구나 그 변수를 쉽게 알 수 있게 하여야한다.
    //2. 여러 변수명으로 정할 경우, 스네이크(파스칼케이스)방식 또는 카멜방식으로 연결한다.
    //ex1) chunjaeitcenter > chunjae_it_center - 스네이크방식 --> 파이썬 선호
    //ex2) chunjaeitcenter > ChunjaeItCenter - 카멜방식 --> 자바 선호
    //3. 어떤 상황이든 개발기준서를 기준으로 접두어나 접두사를 붙여 정함
    //ex1) 단순 데이터 저장일 경우 - 해당 변수는 모두 set으로 시작함 > setKim
    int a, a1, $a, _a;
    //int Aa;    대문자로 시작하지 않도록 유의, 진행은 되나 관례상 진행이 안되는 경우가 많음
    //int k*j;   연산자를 변수로 사용할 수 없음
    //int 1a;    숫자로 시작 안됨
    //int a b;   변수면 중간에 띄어쓰기 불가
    //int class; 예약어는 변수명 불가

}
