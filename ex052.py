n = int(input('Digite um número para saber se ele é primo: '))
tot = 0
for c in range(1, n+1):
    if n % c == 0:
        print('\033[32m', end=' ')
        tot += 1
    else:
        print('\033[31m', end=' ')
    print(f'{c}', end=' ')
print(f'\n\033[mO número {n} foi divisível {tot} vezes')
if tot == 2:
    print('Devido a isso ele é um número primo')
else:
    print('Devido a isso ele não é um número primo')

