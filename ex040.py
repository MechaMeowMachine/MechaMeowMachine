n1 = float(input('Digite a primeira nota: '))
n2 = float(input('Digite a segunda nota: '))
m = (n1+n2)/2
print(f'Sua média é: {m:.2f}')
if m < 5.0:
    print('REPROVADO')
elif 6.9 > m >= 5.0:
    print('RECUPERAÇÃO')
else:
    print('APROVADO')
