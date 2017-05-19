package chapter_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    int exp(int n, int m) {
        int r = 1;
        for (int i = 0; i < m; i++) {
            r *= n;
        }
        return r;
    }

    int lg(int N) {
        for (int i = 0; i < N / 2; i++) {
            if (exp(2, i) > N) {
                return i - 1;
            }
        }

        return 0;
    }

    @Test
    public void _14() {
        assertEquals(0, lg(1));
        assertEquals(6, lg(100));
        assertEquals(9, lg(1000));
        assertEquals(10, lg(1024));
    }
}
