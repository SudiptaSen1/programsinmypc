import random


def checkmatch(word, guess):
    str = ''
    for i in guess:
        str += i
    if str == word:
        return True
    return False


def game(lives=7):
    
    words = ('archive', 'hello', 'sayonara', 'newword')
    w = random.randint(0,len(words)-1)
    word = words[w]
    guess = []
    f = False
    
    for i in word:
        guess.append('_')

    
    print(guess)
    while(lives!=0):
        g = input('Enter your guess: ')[0]
        if g in word:
            for i in range(len(word)):
                if word[i]==g:
                    guess[i]=g
        else:
            lives -= 1
        print(guess)
        if checkmatch(word, guess):
            f = True
            break
    
    if f:
        print('You Win')
    else:
        print('You Loose')
    
        
def main():
    game(7)
    
main()