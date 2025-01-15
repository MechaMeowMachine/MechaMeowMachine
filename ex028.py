from random import randint
n = int(input('Tente adivinhar o número: '))
ns = randint(0, 5)
print(f'O número era: {ns}')
if n == ns:
    print('Você acertou!')
else:
    print('Você errou!')
