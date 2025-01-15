mp = 0
pm = 0
t = 0
nmp = 0
while True:
    print('-'*30)
    print('    LOJA IMAGINÁRIA')
    print('-'*30)
    n = str(input('Nome do produto: '))
    p = float(input('Preço: R$'))
    t += p
    if mp == 0:
        mp = p
        nmp = n
    if p < mp:
        mp = p
        nmp = n
    if p >= 1000:
        pm += 1
    qc = str(input('Quer continuar? [S/N]')).lower()
    if qc == 'n':
        break
    if qc != 's':
        print('\033[31mResposta inválida\033[m')
        
print(f'O total de compra foi {t}')
print(f'Temos {pm} produtos custando mais de R$1000.00')
print(f'O produto mais barato foi {nmp} que custa R${mp}')
