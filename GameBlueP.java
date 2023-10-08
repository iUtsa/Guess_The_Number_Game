public class GameBlueP {
    private int num;
    private int rand;

    public GameBlueP(int ran){  //constructor for random and used another with set and get
        this.rand=ran;
    }

    public int getRand(){
        return rand;
    }

    public void setNum(int n){
        this.num=n;
    }

    public int getNum(){
        return num;
    }
}
