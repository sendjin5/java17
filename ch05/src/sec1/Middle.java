package sec1;

public class Middle extends Score{
    private int history;

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void prtPoint(){
        System.out.println(super.eng);
        //super는 부모 클래스를 말한다.
    }


}
