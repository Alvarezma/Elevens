Questions

1. 
Similarities - 
    Decks
    Dealing
    Cards on board
    Removing and replacing selected cards
    Win when all cards are gone
    Checking if there are legal plays available
    Check if a play is legal
Differences -
    Ammount of cards on the board
    What cards can match up to be removed
    Point value of card ranks

2. Even though the variables are declared in the board class, they have yet to be set with any value. So when it is inherited by the ElevensBoard in its contructor it will use those declared vairables from Board and initialize them with unique values for the eleven game.

3. IsLegal() and AnotherPlayIsPossible() are both abstract in the board class. No they don't cover all the difference because custom methods are needed in each game such as ContainsJQK or ContainsPairSum11 to correctly make the isLegal() and AnotherPlayIsPossible() work correctly.