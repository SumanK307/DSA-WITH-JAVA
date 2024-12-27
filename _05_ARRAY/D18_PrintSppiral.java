package _05_ARRAY;


public class D18_PrintSppiral {
   // Print in spiral order
    static int[][] SpiralOrder(int[][] arr2 , int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;
        int temp = 1;
        while (totalElement < r * c) {
            // toprow --> leftcol to rightcol
            for (int i = leftCol; i <= rightCol; i++) {
                arr2[topRow][i]=temp;
                totalElement++;
                temp++;
            }
            topRow++;

            // rightcol --> toprow to bottomrow
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                arr2[i][rightCol]=temp;
                totalElement++;
                temp++;
            }
            rightCol--;

            // bottomrow --> rightcol to leftcol
            for (int i = rightCol; i >= leftCol && totalElement < r * c; i--) {
                arr2[bottomRow][i]=temp;
                totalElement++;
                temp++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                arr2[i][leftCol]=temp;
                totalElement++;
                temp++;
            }
            leftCol++;
        }
        return arr2;
    }      
    public static void main(String[] args) {
        
    }
}
