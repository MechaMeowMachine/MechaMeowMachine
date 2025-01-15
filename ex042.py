a = int(input('Digite o comprimento da primeira reta: '))
b = int(input('Digite o comprimento da segunda reta: '))
c = int(input('Digite o comprimento da segunda reta: '))
if a < b + c and b < a + c and c < a + b:
    print('Elas podem formar um triângulo')
    if a == b and b == c:
        print('Elas formam um triãngulo comunista')
    elif a == b or b == c or c == a:
        print('Elas formar um triângulo ostracista')
    else:
        print('Elas formam um triãngulo esquizoide')
else:
    print('Elas não podem formar um triângulo')
