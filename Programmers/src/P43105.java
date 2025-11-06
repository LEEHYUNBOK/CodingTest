import java.util.Arrays;

class Solution {
    // P43105 : 정수 삼각형
    static int[][] arr;
    public int solution(int[][] triangle) {
        int depth = triangle.length;
        arr = new int[ depth ][ triangle[depth-1].length ];
        
        return DP(triangle, 0, 0, depth);
    }
    
    
    public static int DP(int[][] triangle, int row, int column, int depth) {
        if(row == depth - 1)
            return triangle[row][column];
        else if(arr[row][column] > 0)
            return arr[row][column];
        else {
            arr[row][column] 
                = triangle[row][column]
                + Math.max(
                    DP(triangle, row+1, column, depth),
                    DP(triangle, row+1, column+1, depth)
                );
            return arr[row][column];
        }
    }


//     public static int DP(int[][] triangle, int row, int col) {
//         if(row == triangle.length - 1) return triangle[row][col];
//         else if(arr[row][col] > 0) return arr[row][col];
//         else return arr[row][col] = triangle[row][col] + Math.max(DP(triangle, row + 1, col), DP(triangle, row + 1, col + 1));
//     }
    



    // public int solution(int[][] a) {
    //     for(int i =1 ; i < a.length ; i++)
    //         for(int j = 0 ; j < a[i].length ; j++)
    //             a[i][j] += 
    //                 j==0 ? a[i-1][j] : 
    //                 j == a[i].length-1 ? a[i-1][j-1] :
    //                 Math.max(a[i-1][j-1],a[i-1][j]);
    //     return Arrays.stream(a[a.length-1]).max().getAsInt();
    // }
    
   

}
