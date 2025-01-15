print('Gerador de PA')
print('-=' * 10)
pt = int(input('Primeiro termo: '))
r = int(input('Razão da PA: '))
t = pt
c = 1
tot = 0
mais = 10
while mais != 0:
    tot += mais
    while c <= tot:
        print(f'{t} -> ', end='')
        t += r
        c += 1
    print('PAUSA')
    mais = int(input('Quantos termos você quer mais? '))
print('FIM')
