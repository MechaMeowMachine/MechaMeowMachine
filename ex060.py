n = int(input('Digite um número para saber seu fatorial: '))
fat = 1
i = 2
while i <= n:
    fat = fat*i
    i = i + 1
print(f'O valor de {n}! é = {fat}')

"""from math import factorial
n = int(input('Digite um número para calcular seu fatorial: '))
f = factorial(n
print(f'O fatorial de {n} é {f}')"""

"""n = int(input('Digite um número para calcular seu fatorial: '))
c = n
f = 1
print(f'Calculando {n}! = ', end='')
while c > 0:
    print(f'{c}', end='')
    print(' x ' if c > 1 else ' = ', end='')
    f *= c
    c -= 1
print(f'{f}')'"""

n = int(input('Digite um número para calcular seu fatorial: '))
f = 1
c = n
for c in range(n, 0, -1):
    print(f'{c}', end='')
    print(' x ' if c > 1 else ' = ', end='')
    f *= c
    c -= 1
print(f'{f}')
