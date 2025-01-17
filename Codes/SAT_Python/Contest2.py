def printPile(pile, hand):
    # Split the hand into a list of cards
    hand_cards = hand.split()
    pile_cards = [pile]  # Initialize the pile with the face-up card

    while True:
        matched = False  # Flag to track if a match was found
        for i in range(len(hand_cards)):
            current_card = hand_cards[i]
            # Check if exactly two characteristics match
            if (current_card[0] == pile_cards[-1][0] and current_card[1] == pile_cards[-1][1]) or \
               (current_card[0] == pile_cards[-1][0] and current_card[2] == pile_cards[-1][2]) or \
               (current_card[1] == pile_cards[-1][1] and current_card[2] == pile_cards[-1][2]):
                # Add the matched card to the pile
                pile_cards.append(current_card)
                # Remove the matched card from the hand
                hand_cards.pop(i)
                matched = True
                break  # Restart the loop after a match

        if not matched:  # No match found, stop the loop
            break

    # Return the pile as a space-separated string
    return " ".join(pile_cards)


# Example usage
pile = "B3O"
hand = "R3X B1T B2T R1X B3X B1X Y4O"
print(printPile(pile, hand))
