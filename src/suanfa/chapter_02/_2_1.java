package suanfa.chapter_02;

import org.junit.Test;

/**
 * Created by peter on 2017-06-14.
 */
public class _2_1 {

    private int _2_2_1_factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * _2_2_1_factorial(n - 1);
        }
    }

    @Test
    public void _2_2_1() {
        System.out.println(_2_2_1_factorial(3));
        System.out.println(_2_2_1_factorial(10));
    }

    private int _2_2_2_fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return _2_2_2_fibonacci(n - 1) + _2_2_2_fibonacci(n - 2);
        }
    }

    @Test
    public void _2_2_2() {
        System.out.println(_2_2_2_fibonacci(4));
        System.out.println(_2_2_2_fibonacci(40));
    }

    private int _2_2_4_perm() {

        return 0;
    }

    @Test
    public void _2_2_4() {

    }
}
