"""print('-' * 30)
print('Sequência de Fibonacci')
print('-' * 30)
n = int(input('Digite a quantidade de termos: '))
t1 = 0
t2 = 1
print('~' * 30)
print(f'{t1} -> {t2}', end='')
cont = 3
while 3 <= n:
    t3 = t1 + t2
    print(f' -> {t3}', end='')
    t1 = t2
    t2 = t3
    cont += 1
print(' -> FIM')"""

n = int(input('Digite quantos termos você deseja ver da sequência fibonacci: '))
f1 = 0
f2 = 1
while n != 0:
    print(f1, end=(' -> ' if n > 1 else ' -> FIM'))
    n -= 1
    f2 += f1
    f1 = f2 - f1
