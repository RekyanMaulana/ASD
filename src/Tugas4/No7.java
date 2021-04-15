
package Tugas4;

public class No7 {
       public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) { 
            int key = A[i]; 
            int j = i - 1; 
            while((j >= 0) && (A[j] > key)) { 
                A[j + 1] = A[j];
                j--; 
            }
            A[j + 1] = key;
        }
    }
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        int cari = 25;
        No7.tampil(A);
        No7.insertionSort(A);
        No7.tampil(A); 
        
        System.out.println("");
        
        for (int i = 0; i < A.length; i++) {
            if (cari == A[i]) {
                System.out.print("Data "+ cari +" berada pada indeks ke-"+ i);
                break; //stop perulangan
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("R. Rekyan Maulana Setyawan");
    }
}