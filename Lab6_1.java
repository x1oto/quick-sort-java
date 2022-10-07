import java.util.Scanner;
import java.util.Arrays;

class Quicksort {
  static int partition(int array[], int low, int high) {
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {

      int pi = partition(array, low, high);
      
      quickSort(array, low, pi - 1);

      quickSort(array, pi + 1, high);
    }
  }
}

class Main {
  public static void main(String args[]) {
System.out.print("Enter array lenght: ");
    
    Scanner scan = new Scanner(System.in);
    int lenghtArray = scan.nextInt();
    int[] data = new int[lenghtArray];
    
    for(int i = 0; i < lenghtArray; i++) {
      
      System.out.print("Enter number: ");
      int number = scan.nextInt();
      
     if (number >= -100000 && number <= 100000) {
         data[i] = number;
      } else {
        System.out.println("======= Your number out of bound! =======");
        i--;
      }
    }
    
    int size = data.length;
    
    System.out.println("Unsorted Array: " + Arrays.toString(data));
    Quicksort.quickSort(data, 0, size - 1);
    System.out.println("Sorted Array: " + Arrays.toString(data));
  }
}