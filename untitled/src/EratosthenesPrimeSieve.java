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
                if (array[i] == 0) {
                    break;
                } else if (array[i] == array[j]) {
                } else if (array[j] % array[i] == 0) {
                    array[j] = 0;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
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

    public static boolean isitPrime(int p) {

        int[] array = new int[p - 1];
        int[] copyarray = new int[p - 1];
        int num = 2;
        for (int i = 0; i < p - 1; i++) {
            array[i] = num;
            num++;
        }

        for (int i = 0; i < p - 1; i++) {
            for (int j = 0; j < p - 1; j++) {
                if (array[i] == 0) {
                    break;
                } else if (array[i] == array[j]) {
                } else if (array[j] % array[i] == 0) {
                    array[j] = 0;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                copyarray[counter] = array[i];
                counter++;
            }
        }

        int[] sumarray = new int[counter];
        for (int i = 0; i < counter; i++) {
            sumarray[i] = copyarray[i];
        }


        for (int s : sumarray) {
            if (s == p)
            {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean isPrime(int p) {
        return isitPrime(p);
    }

    @Override
    public void printPrimes() {
        primeCalculator(100);
    }
}
