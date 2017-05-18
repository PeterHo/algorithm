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
    }
}