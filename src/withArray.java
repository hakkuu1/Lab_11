import java.util.Arrays;
import java.util.Scanner;

public class withArray {
    int[] intArray;
    int n;
    public withArray(int n){
        this.n = n;
        intArray = new int[n];
    }
    public void inputArr(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            intArray[i]= sc.nextInt();
        }
    }
    public void outputArr(){
        System.out.println("arr:");
        for(int i = 0;i < n;i++){
            System.out.println("i["+i+"]" +" : "+intArray[i]);
        }
    }
    public int[] sortArr(){
        for(int i = 0;i < n - 1;i++){
            for (int j = 0 ; j < n - 1 - i;j++){
                if(intArray[j] > intArray[j+1]){
                    int mew = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = mew;
                }
            }
        }
        return (intArray);
    }
    public static void main(String[] args){
        withArray arr = new withArray(5);
        arr.inputArr();
        arr.outputArr();
        arr.sortArr();
        arr.outputArr();
    }
}