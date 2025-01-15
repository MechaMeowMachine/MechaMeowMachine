c = float(input('Digite o valor da casa: R$'))
s = float(input('Seu salário: R$'))
a = float(input('Quantos anos de financiamento: '))
pm = c/(a*12)
print(f'Para pagar uma casa de R$ {c:.2f} em {a} anos')
print(f'a prestação será de R$ {pm:.2f}')
if pm <= s*0.30:
    print('Empréstimo pode ser concedido')
else:
    print('EMPRÉSTIMO NEGADO!')

