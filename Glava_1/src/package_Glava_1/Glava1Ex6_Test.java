package package_Glava_1;
public class Glava1Ex6_Test {
    public static void main (String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5){
            
            if (y < 5){
                x = x + 1;
                if (y < 3){
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }//конец while (x < 5)
    }//конец main
}//конец класса
