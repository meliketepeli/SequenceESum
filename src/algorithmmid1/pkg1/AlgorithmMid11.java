
package algorithmmid1.pkg1;
import java.util.Scanner;
public class AlgorithmMid11 {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like to give as an array? Please enter:");
        int n= scan.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements of the array:");  
        for(int i=0; i<n; i++){
            array[i]=scan.nextInt();
        } 
        System.out.println("What is the sum of the elements of the array?"); 
        int k = scan.nextInt();
        int result =subsequenceWSum(array,k);
        if(result!=-1){
            System.out.println("Result is: " + result);
        }
        else{
            System.out.println("No subsequence!");
       }
    }
    static int subsequenceWSum(int array[], int k){

        for(int m=0; m<array.length; m++){
            int sum=0; int j=m;
            while(j<array.length){
                if(sum<k){
                    sum = sum + array[j];
                    j+=1;
                }
                else if(sum==k){
                    return m;
                }
                else{
                break; }
               }
        }
        return -1;      
    }
    
}
