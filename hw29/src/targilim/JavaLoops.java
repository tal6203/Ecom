package targilim;

public class JavaLoops {
    static void loop(){
        int index = 0;
        while (index < 31){
            if (index % 2 == 0){
                System.out.println(index);
            }
            index++;
        }
        int [][] matrix = {{1,2,3,4,5},{6,7,8,9,10}};
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
        for (int [] arr:matrix){
            for (int num :arr){
                System.out.println(num);
            }
        }
    }
}
