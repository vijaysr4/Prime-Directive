// Import statement for arrayList
import java.util.ArrayList;

class PrimeDirective {
  // method to determine the prime number 
  public boolean isPrime(int number) {
    if (number == 2) {
      return true;
    } else if (number < 2) {
        return false;
      }
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
 }
  
  //method for ArrayList  
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
      for (int number : numbers) {
        if (isPrime(number)) {
          primes.add(number);
        }
      }
      return primes;
}
  //main function
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.onlyPrimes(numbers));
  }
}
