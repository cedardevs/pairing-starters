import PokerHand from './PokerHand';

test('can create a hand', () => {
  const hand = new PokerHand();
  expect(hand).not.toBeNull();
});