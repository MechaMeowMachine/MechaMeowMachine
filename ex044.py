print(f'{" LOJA DO VENTO ":=^40}')
p = float(input('Preço do produto: '))
print('''FORMAS DE PAGAMENTO
[ 1 ] à vista dinheiro/cheque
[ 2 ] à vista cartão
[ 3 ] 2x no cartão
[ 4 ] 3x ou mais no cartão''')
fp = int(input('Qual é a forma de pagamento?'))
if fp == 1:
    print(f'Valor a ser pago: {p-(p*0.10)}')
elif fp == 2:
    print(f'Valor a ser pago : {p-(p*0.05)}')
elif fp == 3:
    print(f'Valor a ser pago: {p}')
elif fp == 4:
    print(f'Valor a ser pago: {p+(p*0.20)}')

