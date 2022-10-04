package Arrays;

public class RowMajor {
    static String[][] color={{"red","blue"},{"Green","yellow"},{"Pink","Purple"}};
    public static void main(String[] args) {
        for (int i=0;i<color.length;i++){
            for (int j=0;j<color[i].length;j++){
                System.out.println(i);
                System.out.println(j);
                System.out.println("Yellow = "+color[i][j]);
            }
        }
    }
}
