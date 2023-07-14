import java.util.Scanner;
public class EquilibriumIndex {
    static int equilibriumIndexOfArray(int[] A){
        int p[] = new int[A.length];
        p[0] = A[0];
        for(int i = 1; i < A.length; i++){
            p[i] = p[i-1]+A[i];
        }
        for(int i = 1; i < A.length; i++){
            int left = p[i]-A[i], right = p[A.length-1] - p[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        System.out.print("Array Elements: ");
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(equilibriumIndexOfArray(array));
    }
}
