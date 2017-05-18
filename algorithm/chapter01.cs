using System;
using System.Globalization;
using NUnit.Framework;

namespace algorithm
{
    [TestFixture]
    public class chapter_1_1
    {
        [Test]
        public void _01() {
            // a
            Assert.AreEqual(7, (0 + 15) / 2);
            // b
            Assert.Less(Math.Abs(200 - (2.0e-6 * 100000000.1)), 0.0001f);
            // c
            Assert.AreEqual(true, true && false || true && true);
        }

        [Test]
        public void _02() {
            Assert.AreEqual(typeof(double), ((1 + 2.236) / 2).GetType());
            Assert.AreEqual(1.618, (1 + 2.236) / 2);

            Assert.AreEqual(typeof(double), (1 + 2 + 3 + 4.0).GetType());
            Assert.AreEqual(10f, 1 + 2 + 3 + 4.0);

            Assert.AreEqual(typeof(bool), (4.1 >= 4).GetType());
            Assert.AreEqual(true, 4.1 >= 4);

            Assert.AreEqual(typeof(string), (1 + 2 + "3").GetType());
            Assert.AreEqual("33", 1 + 2 + "3");
        }

        string _1_1_3(int i, int j, int k) {
            if (i == j && j == k) {
                return "equal";
            } else {
                return "not equal";
            }
        }

        [Test]
        public void _03() {
            Assert.AreEqual("equal", _1_1_3(1, 1, 1));
            Assert.AreEqual("not equal", _1_1_3(1, 2, 1));
            Assert.AreEqual("not equal", _1_1_3(1, 1, 2));
            Assert.AreEqual("not equal", _1_1_3(2, 1, 1));
        }

        [Test]
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

        bool _1_1_5(double x, double y) {
            return x > 0 && x < 1 && y > 0 && y < 1;
        }

        [Test]
        public void _05() {
            Assert.AreEqual(true, _1_1_5(0.5, 0.5));
            Assert.AreEqual(false, _1_1_5(1.1, 0.5));
            Assert.AreEqual(false, _1_1_5(-1.1, 0.5));
            Assert.AreEqual(false, _1_1_5(0.5, 1.5));
            Assert.AreEqual(false, _1_1_5(0.5, -0.5));
        }

        [Test]
        public void _06() {
            int f = 0;
            int g = 1;
            for (int i = 0; i <= 15; i++) {
                // Fibonacci sequence
                // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
                Console.WriteLine(f);
                f = f + g;
                g = f - g;
            }
        }

        [Test]
        public void _07() {
            // square root of t
            double t = 9.0;
            while (Math.Abs(t - 9.0 / t) > .001)
                t = (9.0 / t + t) / 2.0;
            Console.WriteLine(t);

            // 1 + 2 + 3 + ... + 999
            int sum = 0;
            for (int i = 1; i < 1000; i++) {
                for (int j = 0; j < i; j++)
                    sum++;
            }
            Console.WriteLine(sum);

            // (log2(1000) + 1) * N
            sum = 0;
            int N = 1000;
            for (int i = 1; i < 1000; i *= 2) {
                for (int j = 0; j < N; j++)
                    sum++;
            }
            Console.WriteLine(sum);
        }
    }
}