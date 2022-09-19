public class EratosthenesPrimeSieve implements PrimeSieve {
    static int max = 100;
    static int[] array = new int[max - 1];
    static int[] copyarray = new int[max - 1];

    public static void primeCalculator() {
        int num = 2;
        for (int i = 0; i < max - 1; i++) {
            array[i] = num;
            num++;
        }

        for (int i = 0; i < max-1; i++) {
            int currentnum = array[i];
            for (int j = 0; j < max - 1; j++) {
                if (array[j] == 0) {
                    break;
                } else if (array[j] % currentnum == 0) {
                    array[j] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        primeCalculator();
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {

    }
}
