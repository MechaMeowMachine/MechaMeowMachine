""" Esse código solicita ao usuário que digite quatro números, armazena esses números em uma tupla chamada 'num', e, em seguida, realiza algumas operações
com esses números"""

# Recebe quatro números do usuário e armazena em uma tupla
num = (int(input('Digite o primeiro número: ')),
       int(input('Digite o segundo número: ')),
       int(input('Digite o terceiro número: ')),
       int(input('Digite o quarto número: ')))

# Imprime a quantidade de vezes que o valor 9 apareceu na tupla
print(f'O valor 9 apareceu {num.count(9)} vezes')

# Verifica se o valor 3 está na tupla e, se estiver, imprime sua posição
if 3 in num:
    print(f'O valor 3 apareceu na {num.index(3)+1}ª posição')
else:
    print('O valor 3 nõ foi digitado em nenhuma posição')

# Imprime os valores pares da tupla usando um loop for
print('Os valores pares digitados foram ', end='')
for n in num:
    if n % 2 == 0:
        print(n, end=' ')
