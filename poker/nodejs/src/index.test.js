import PokerHand from './index';

test('can create a hand', () => {
  const hand = new PokerHand();
  expect(hand).not.toBeNull();
});