import math
co = float(input('Digite o comprimento do cateto oposto: '))
ca = float(input('Digite o comprimento do cateto adjacente: '))
hipotenusa = math.sqrt(math.pow(ca, 2)+math.pow(co, 2))
print(f'O comprimento da hipotenusa é: {hipotenusa:.2f}')
