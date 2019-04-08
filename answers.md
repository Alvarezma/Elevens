Questions

1. Deck, Hand, Discard
2. 
checkAnohterPlayPossible
cardselect
checkIsLegal, if not go back to card select
cardwithdrawl
checkWin, if true restart game.
cardDeal
3. No some of it has yet to be implemented.
4. 
    a. In the constructor and in the method newGame.
    b. The anotherPlayPossible method, and isLegal
    c. 0, 1, 3, 6, 7
    d. 
    for (int i = 0; i < cIndexes.size(); i++)   {
        System.out.println(cards[cIndexes.get(i)] + "\n");
    }
    e. It needs to be called in the anotherPlayPossible function because in the isLegal function it is already handed the selectedCards as a parameter. So it is only in Anpother playPossiblr that it needs to identify what cards are on the board.