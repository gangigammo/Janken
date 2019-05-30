package sample;

public class Main implements Field{
    public static void main(String[] args){
        JankenController A = new JankenController();
        for(int i = 0;i < 15;i++){
            int outputA = A.jankenOutput();
            System.out.print("Aの出力:");
            if(outputA == ROCK){
                System.out.print("グー");
            }else if(outputA == PAPER){
                System.out.print("チョキ");
            }else{
                System.out.print("パー");
            }
            System.out.println();
        }
    }
}
