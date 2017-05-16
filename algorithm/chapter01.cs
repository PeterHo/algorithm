using System;
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

        [Test]
        public void _03() {
        }
    }
}