p = float(input('Digite seu peso: '))
a = float(input('Digite sua altura: '))
imc = p/(a**2)
print(f'O IMC é: {imc:.1f}')
if imc < 18.5:
    print('Abaixo do peso')
elif imc == 18.5 or imc <= 25:
    print('Peso ideal')
elif imc == 26 or imc <= 30:
    print('Sobrepeso')
elif imc == 31 or imc <= 40:
    print('Obesidade')
else:
    print('Obesidade mórbida')

# 25 <= imc < 30
