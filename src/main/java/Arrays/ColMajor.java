package Arrays;

public class ColMajor {
    static String[][] color={{"red","blue"},{"Green","yellow"},{"Pink","Purple"},{"ashley","zack"}};
    public static void main(String[] args) {
        for (int i=0;i<color[0].length;i++){
            for (int j=0;j<color.length;j++){
                System.out.println(i);
                System.out.println(j);
                System.out.println("ColMajor "+color[j][i]);
            }
        }
    }
}
