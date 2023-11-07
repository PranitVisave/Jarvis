import java.util.*;
import java.io.*;
class S04_1{
    public static void main(String args[]){
        int i,j,n,r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        r = sc.nextInt();

        System.out.println("Enter number of columns : ");
        c = sc.nextInt();
        int [][] arr = new int[r][c];
        int [][] arr2 = new int[r][c]; 
        System.out.println("Enter Elements in 2D Array : ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Arrya : ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                arr2[i][j]=arr[j][i];
            }
        }
        System.out.println("Transposed Array : ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}