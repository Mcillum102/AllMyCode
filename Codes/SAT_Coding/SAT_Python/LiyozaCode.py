from random import randrange

print("Snake chance game")
print("STARTING!")
no_Snake = True
score = 0
while no_Snake:
    Snake_door = randrange(1, 3)
    print("There are 3 doors..")
    print("One of them holds a snake!")
    print("Which door to choose?")
    door = input("Pick a door: 1, 2, or 3?\n")
    door_num = int(door)
    if door_num == Snake_door:
        print("OH NO! A SNAKE!!")
        no_Snake = False
    else:
        print("yay! no snake to be seen!")
        score = score + 5
print("Ah! RUN AWAY!")
print(f"Game OVER, your score was {score}")
if score == 100:
    print("WOAH! YOU WON!")
    print("WINNER!")
