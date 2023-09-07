package targilim;

public class JavaArray {
    static void arr(){
        int [] arr1 = {1,2,3,4,5};
        String [] arr2 = {"hello","table","door","pizza","banana"};
        int num = (int) (Math.random()*arr1.length);
        int temp1 = 0;
        String temp2 = "";
        temp1 = arr1[num];
        arr1[num] = arr1[0];
        arr1[0] = temp1;
        temp2 = arr2[num];
        arr2[num] = arr2[0];
        arr2[0] = temp2;
    int [][] matrix = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][0]);

    }
}
