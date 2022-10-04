package Arrays;

public class ThreeDPrac {
    static String[][][] arr={
            {
                    {"Shisia","James"},
                    {"Alice","Amina"},
                    {"Peter","Munala"}
            },
            {
                    {"Derrick","bend"},
                    {"Ashley","Menotti"},
                    {"Shanda","Pieing"}
            }
    };

    public static void main(String[] args) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    System.out.printf("["+i+"] ["+j+"] ["+k+"]");
                    System.out.println(" " +
                            "pieing "+arr[1][2][1]);
                }
                System.out.println();
            }
        }
    }
}
