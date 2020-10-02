A famous casino is suddenly faced with a sharp decline of their revenues. They decide to offer Texas hold'em also online. Can you help them by writing an algorithm that can rank poker hands?

### Task
Create a poker hand with a constructor that accepts a string containing 5 cards:

```java
PokerHand hand = new PokerHand("KS 2H 5C JD TD");
```

The characteristics of the string of cards are:

- Each card consists of two characters, where
    - The first character is the value of the card: 2, 3, 4, 5, 6, 7, 8, 9, T(en), J(ack), Q(ueen), K(ing), A(ce)
    - The second character represents the suit: S(pades), H(earts), D(iamonds), C(lubs)
- A space is used as card separator between cards

Implement a poker hand method to compare itself to another poker hand:

```java
int PokerHand.compareTo(PokerHand hand);
```

The result of your poker hand comparison function should be an integer which is:
- `> 0` for WIN
- `0` for DRAW
- `< 0` for LOSE

### Notes
- Apply the [Texas Hold'em rules](https://en.wikipedia.org/wiki/Texas_hold_%27em) for ranking the cards.
- Low aces are NOT valid in this kata.
- There is no ranking for the suits.

### Credit
Shamelessly borrowed and modified from: https://www.codewars.com/kata/5739174624fc28e188000465
