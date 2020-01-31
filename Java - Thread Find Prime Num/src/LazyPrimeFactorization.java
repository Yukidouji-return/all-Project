import org.w3c.dom.Node;

public class LazyPrimeFactorization implements Runnable {
    public LazyPrimeFactorization(){}

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println("luoi bieng: "+i);
            }
        }
    }
    public boolean isPrimeNumber(int inputNumber) {
        boolean isItPrime = true;

        if(inputNumber <= 1)
        {
            isItPrime = false;

            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= inputNumber/2; i++)
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;

                    break;
                }
            }
            return isItPrime;
        }
    }
}
