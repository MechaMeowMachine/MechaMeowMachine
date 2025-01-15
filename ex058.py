from random import randint
n = 0
ns = randint(0, 10)
p = 0
while n != ns:
    n = int(input('Tente adivinhar um número de 0 a 10: '))
    p += 1
    if n == ns:
        print(f'O número era {ns}')
    else:
        if n < ns:
            print('Mais...Tente mais uma vez')
        elif n > ns:
            print('Menos...Tente mais uma vez')
print('Você acertou!')
print(f'Você tentou um total de {p} vezes')
