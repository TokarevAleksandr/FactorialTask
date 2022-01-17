package sample;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
    public BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i<=n; i++){
            result = BigInteger.valueOf(i).multiply(result);
        }
        return result;
    }

    @Override
    public void run() {
        int id = Integer.parseInt(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + " - id: " + Thread.currentThread().getId() +" factorial: " + this.factorial(id));
    }
}