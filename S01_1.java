//Q1) Write a Program to print all Prime numbers in an array of ‘n’ elements.
//(use command line arguments)
public class S01_1{
    public static void main(String args[]){
        int n = args.length;
        int [] arr = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.println("Prime Numbers In Array : ");
        for (int i=0;i<n;i++){
            cnt=0;
            for (int j=2;j<arr[i];j++){
                if (arr[i]%j==0)
                    cnt++;
            }
            if (cnt == 0)
                System.out.println(arr[i]+" ");
        }
    }
}
