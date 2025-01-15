print('Gerador de PA')
print('-=' * 10)
pt = int(input('Digite o primeiro termo: '))
r = int(input('Digite a razão: '))
t = pt
cont = 1
while cont <= 10:
    print(f'{t} -> ', end='')
    t = t + r
    cont += 1
print('FIM')
