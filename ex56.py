si = 0
mi = 0
mih = 0
nv = 0
tm20 = 0
for p in range(1, 5):
    print(f'======{p}ª PESSOA======')
    n = str(input('Nome: ')).strip()
    i = int(input('Idade: '))
    s = str(input('Sexo [M/F]: ')).strip()
    si += i
    if p == 1 and s in 'Mm':
        mih = i
        nv = n
    if s in 'Mm' and i > mih:
        mih = i
        nv = n
    if s in 'Ff' and i < 20:
        tm20 += i
mi = si/4
print(f'Média da idade do grupo é {mi} anos')
print(f'O homem mais velho tem {mih} e se chama {nv}')
print(f'Ao todo são {tm20} mulheres com menos de 20 anos')
