valores = list()
while True:
    v = int(input('Digite um valor: '))
    if v not in valores:
        valores.append(v)
        print('VALOR ADICIONADO')
    else:
        print('VALOR DUPLICADO NÃO ADICIONADO')
    r = str(input('Quer continuar? [S/N] '))

    if r in 'Nn':
        break
print('-='*30)
print(f'Você digitou os valores {sorted(valores)}')
