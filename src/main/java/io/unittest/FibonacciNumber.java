package io.unittest;

public class FibonacciNumber {
    public int find(int i) {

        if(i<=0){
            throw new IllegalArgumentException();
        }
        if(i==1 || i==2){
            return 1;
        }
        return find(i-2)+find(i-1);
    }
}
