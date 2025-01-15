a = int(input('Digite o comprimento da primeira reta: '))
b = int(input('Digite o comprimento da segunda reta: '))
c = int(input('Digite o comprimento da terceira reta: '))
if a < b + c and b < a + c and c < a + b:
    print('Elas podem formar um triângulo :)')
else:
    print('Elas não podem formar triângulo :(')
