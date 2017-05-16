using System;
using NUnit.Framework;

namespace algorithm
{
    [TestFixture]
    public class chapter_1_1
    {
        [Test]
        public void _01() {
            Assert.AreEqual(7, (0 + 15) / 2);
        }

        [Test]
        public void _02() {
            Assert.Less(Math.Abs(200 - (2.0e-6 * 100000000.1)), 0.0001f);
        }

        [Test]
        public void _03() {
            Assert.AreEqual(true, true && false || true && true);
        }
    }
}