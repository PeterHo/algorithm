package chapter_01;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class _1_1_19_Fibonacci {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F(N));
    }
}

class _1_1_19_Fibonacci2 {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        int maxN = 100;
        BigDecimal[] r = new BigDecimal[maxN];
        r[0] = new BigDecimal(0);
        r[1] = new BigDecimal(1);
        for (int N = 0; N < 100; N++) {
            if (N > 1) {
                r[N] = r[N - 1].add(r[N - 2]);
            }
            System.out.println(N + " " + r[N]);
        }
    }
}

public class _1_1 {

    double delta = 0.0001;

    @Test
    public void _01() {
        // a
        assertEquals(7, (0 + 15) / 2);
        // b
        assertEquals(200, 2.0e-6 * 100000000.1, delta);
        // c
        assertEquals(true, true && false || true && true);
    }

    @Test
    public void _02() {

        Double d = (1 + 2.236) / 2;
        assertEquals(Double.class, d.getClass());

        d = 1 + 2 + 3 + 4.0;
        assertEquals(Double.class, d.getClass());
        assertEquals(10, d, delta);

        Boolean b = (4.1 >= 4);
        assertEquals(Boolean.class, b.getClass());
        assertEquals(true, b);

        String s = 1 + 2 + "3";
        assertEquals("33", s);
    }

    String _1_1_3(int i, int j, int k) {
        if (i == j && j == k) {
            return "equal";
        } else {
            return "not equal";
        }
    }

    @Test
    public void _03() {
        assertEquals("equal", _1_1_3(1, 1, 1));
        assertEquals("not equal", _1_1_3(1, 2, 1));
        assertEquals("not equal", _1_1_3(1, 1, 2));
        assertEquals("not equal", _1_1_3(2, 1, 1));
    }

    @Test
    public void _04() {
        int a = 1, b = 2, c;
        // a
        if (a > b)
            c = 0;
        // b
        if (a > b) {
            c = 0;
        }
    }

    boolean _1_1_5(double x, double y) {
        return x > 0 && x < 1 && y > 0 && y < 1;
    }

    @Test
    public void _05() {
        assertEquals(true, _1_1_5(0.5, 0.5));
        assertEquals(false, _1_1_5(1.1, 0.5));
        assertEquals(false, _1_1_5(-1.1, 0.5));
        assertEquals(false, _1_1_5(0.5, 1.5));
        assertEquals(false, _1_1_5(0.5, -0.5));
    }

    @Test
    public void _06() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            // Fibonacci sequence
            // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    @Test
    public void _07() {
        // square root of t
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        System.out.println(t);

        // 1 + 2 + 3 + ... + 999
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++)
                sum++;
        }
        System.out.println(sum);

        // (log2(1000) + 1) * N
        sum = 0;
        int N = 1000;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < N; j++)
                sum++;
        }
        System.out.println(sum);
    }

    @Test
    public void _08() {
        assertEquals('b', 'b');
        // ascii of b add ascii of c = 98 + 99 = 197
        assertEquals(197, 'b' + 'c');
        // ascii of a add 4 = 97 + 4 = 101 => char = e
        assertEquals('e', (char) ('a' + 4));
    }

    String _1_1_9(int N) {
        if (N <= 0) {
            return "wrong";
        }
        String s = "";
        for (int i = N; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        return s;
    }

    @Test
    public void _09() {
        assertEquals("wrong", _1_1_9(-1));
        assertEquals("wrong", _1_1_9(0));
        assertEquals("111", _1_1_9(7));
        assertEquals("101101", _1_1_9(45));
        assertEquals("1110110000000", _1_1_9(7552));
    }

    @Test
    public void _10() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }
        assertEquals(81, a[9]);
    }

    @Test
    public void _11() {
        boolean[][] a = {
                {true, false, true, false, false},
                {false, false, true, true, false},
                {false, false, false, false, true},
                {true, true, false, false, true},
                {true, false, false, false, true},
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Test
    public void _12() {
        // 0 1 2 3 4 5 6 7 8 9
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }

    int[][] _1_1_13(int[][] a) {
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    @Test
    public void _13() {
        int M = 3;
        int N = 5;
        int[][] a = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = i * M + N;
            }
        }
        int[][] b = _1_1_13(a);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                assertEquals(b[j][i], a[i][j]);
            }
        }
    }

    int _1_1_14_exp(int n, int m) {
        int r = 1;
        for (int i = 0; i < m; i++) {
            r *= n;
        }
        return r;
    }

    int _1_1_14_lg(int N) {
        for (int i = 0; i < N / 2; i++) {
            if (_1_1_14_exp(2, i) > N) {
                return i - 1;
            }
        }

        return 0;
    }

    @Test
    public void _14() {
        assertEquals(0, _1_1_14_lg(1));
        assertEquals(6, _1_1_14_lg(100));
        assertEquals(9, _1_1_14_lg(1000));
        assertEquals(10, _1_1_14_lg(1024));
    }

    int[] histogram(int[] a, int M) {
        int[] r = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M) {
                r[a[i]]++;
            }
        }
        return r;
    }

    @Test
    public void _15() {
        assertArrayEquals(new int[]{0, 2, 1, 1}, histogram(new int[]{1, 2, 3, 1}, 4));
        assertArrayEquals(new int[]{0, 2, 1}, histogram(new int[]{1, 2, 3, 1}, 3));
        assertArrayEquals(new int[]{0, 2, 1, 1, 0}, histogram(new int[]{1, 2, 3, 1}, 5));
    }

    String exR1(int n) {
        if (n <= 0)
            return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    @Test
    public void _16() {
        assertEquals("311361142246", exR1(6));
    }

    @Test
    public void _17() {
        // The base case will never be reached. A call to exR2(3) will result in calls to
        // exR2(0), exR2(-3), exR3(-6), and so forth until a StackOverflowError occurs.
    }

    int _1_1_18_mul(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return _1_1_18_mul(a + a, b / 2);
        }
        return _1_1_18_mul(a + a, b / 2) + a;
    }

    int _1_1_18_exp(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return _1_1_18_exp(a * a, b / 2);
        }
        return _1_1_18_exp(a * a, b / 2) * a;
    }

    @Test
    public void _18() {
        assertEquals(50, _1_1_18_mul(2, 25));
        assertEquals(33, _1_1_18_mul(3, 11));
        assertEquals(33554432, _1_1_18_exp(2, 25));
        assertEquals(177147, _1_1_18_exp(3, 11));
    }

    @Test
    public void _19() {
        _1_1_19_Fibonacci2.main(null);
    }

    double _1_1_20_ln(int N) {
        if (N == 1) {
            return 0;
        }
        return _1_1_20_ln(N - 1) + Math.log(N);
    }

    long _1_1_20_factorial(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * _1_1_20_factorial(number - 1);
        }
    }

    @Test
    public void _20() {
        assertEquals(Math.log(_1_1_20_factorial(5)), _1_1_20_ln(5), delta);
        assertEquals(Math.log(_1_1_20_factorial(10)), _1_1_20_ln(10), delta);
    }

    void _1_1_21(String name, int a, int b) {
        System.out.format("%s %d %d %.3f\n", name, a, b, (float) (a) / b);
    }

    @Test
    public void _21() {
        _1_1_21("abc", 2, 3);
        _1_1_21("bcd", 4, 2);
    }


    int _1_1_22_rank(int key, int[] a, int lo, int hi, int lv) {
        // Index of key in a[], if present, is not smaller than lo and not larger than hi.
        for (int i = 0; i < lv; i++) {
            System.out.print("    ");
        }
        System.out.format("%d %d\n", lo, hi);

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return _1_1_22_rank(key, a, lo, mid - 1, lv + 1);
        else if (key > a[mid]) return _1_1_22_rank(key, a, mid + 1, hi, lv + 1);
        else return mid;
    }

    @Test
    public void _22() {
        int[] a = {1, 2, 4, 6, 9, 20, 30, 35, 55, 80};
        assertEquals(1, _1_1_22_rank(2, a, 0, a.length - 1, 0));
        assertEquals(2, _1_1_22_rank(4, a, 0, a.length - 1, 0));
        assertEquals(8, _1_1_22_rank(55, a, 0, a.length - 1, 0));
    }
}






























