package Arrays;

public class ColMajor {
    static String[][] color={{"red","blue"},
                            {"Green","yellow"},
                            {"Pink","Purple"},
                            {"ashley","zack"}};
    public static void main(String[] args) {
//        for (int i=0;i<color[0].length;i++){
//            for (int j=0;j<color.length;j++){
//                System.out.println(i);
//                System.out.println(j);
//                System.out.println("ColMajor "+color[j][i]);
//            }
//        }
        practise();
    }

    public static void practise(){
        int[][] numArray={{1,6},{2,7},{3,8},{4,9},{5,10}};
        //column major to print values 1-10 in order
        for (int i=0;i<numArray[0].length;i++){
            for (int j=0;j<numArray.length;j++){
                System.out.println("Number: "+numArray[j][i]);
            }
        }
    }
}
