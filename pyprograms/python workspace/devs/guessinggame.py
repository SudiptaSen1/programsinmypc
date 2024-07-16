import random


def game(x, lives=7):
    
    guess = int(input("Enter your guess: "))
    
    if guess == x:
        return True
    
    if lives <= 0:
        return False
    
    return game(x, lives-1)
   
    
x = random.randint(int(input("Enter a: ")), int(input("Enter b: ")))

if game(x, 7) == True:
    print("You won")
else:
    print("You lost")
