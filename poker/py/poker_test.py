import unittest
from poker import PokerHand

class PokerTestCase(unittest.TestCase):
    def test_something(self):
        self.assertNotEqual(PokerHand("THIS IS A TEST"), None)


if __name__ == '__main__':
    unittest.main()
