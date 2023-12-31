package sec1;

public class Example3 {
    public static String[] add(String[] originArr, String txt) {          //void가 아니면 return 문을 넣어줘야한다.
        String[] newArr = new String[originArr.length + 1]; //새로운 배열은 원래 배열의 데이터에서 하나 더 증가
        for (int i = 0; i < originArr.length; i++) {               //원래 배열데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }

        newArr[originArr.length] = txt; // 추가되는 원소를 txt변수로 입력받아 새로운 원소로 추가
        return newArr;


    }

    //remove
    public static String[] remove(String[] originArr) {
        String[] newArr = new String[originArr.length - 1];
        for (int i = 0; i < originArr.length - 1; i++) {
            newArr[i] = originArr[i];
        }


        return newArr;
    }


    public static void main(String[] args) {
        //원소추가 함수
        String[] originArr = {"동해물과", "백두산", "마르고", "닳도록", "이라네"};
        //originArr = new String[]{"동해물과", "백두산", "마르고", "닳도록", "이라네"}; - 값을 재초기화를 한꺼번에 할 수는 있으나
        //originArr [5] = "그러네";
        originArr = add(originArr, "그러네");
        originArr = add(originArr, "뭐라네");//함수를 호출할 때 원래 배열과 추가 데이터를 같이 대입
        for (String s : originArr) {
            System.out.println(s);
        }


        System.out.println("----");
        originArr = remove(originArr);
        for (String s : originArr) {
            System.out.println(s);


        }
    }
}
