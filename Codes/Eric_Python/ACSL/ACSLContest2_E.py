def printPile(pile, hand):
    answer = pile
    cards = hand.split()
    color, number, symbol = pile[0], pile[1], pile[2]

    while True:
        match_found = False
        for i in range(len(cards)):
            matchcount = 0
            card_color, card_number, card_symbol = cards[i][0], cards[i][1], cards[i][2]

            if card_color == color:
                matchcount += 1
            if card_number == number:
                matchcount += 1
            if card_symbol == symbol:
                matchcount += 1

            if matchcount == 2:
                # Update pile and remove matched card from hand
                pile = cards[i]
                answer += " " + cards[i]
                cards.pop(i)  # Remove matched card
                color, number, symbol = pile[0], pile[1], pile[2]
                match_found = True
                break  # Restart the loop after finding a match

        if not match_found:  # Stop if no more matches can be found
            break

    return answer


# Example usage
pile = "B3O"
hand = "R3X B1T B2T R1X B3X B1X Y4O"
print(printPile(pile, hand))  # Output: B3O B3X R3X R1X B1X B1T B2T
