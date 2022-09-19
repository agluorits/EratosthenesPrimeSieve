import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve {

    public static void primeCalculator(int max) {
        int[] array = new int[max - 1];
        int[] copyarray = new int[max - 1];
        int num = 2;
        for (int i = 0; i < max - 1; i++) {
            array[i] = num;
            num++;
        }

        for (int i = 0; i < max - 1; i++) {
            for (int j = 0; j < max - 1; j++) {
                if (array[i] == 0)
                {
                    break;
                } else if (array[i] == array[j])
                {
                } else if (array[j] % array[i] == 0)
                {
                    array[j] = 0;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
            {
                copyarray[counter] = array[i];
                counter++;
            }
        }

        int[] sumarray = new int[counter];
        for (int i = 0; i < counter; i++) {
            sumarray[i] = copyarray[i];
        }

        for (int i = 0; i < sumarray.length; i++) {
            System.out.println(sumarray[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        primeCalculator(input);
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {

    }
}
