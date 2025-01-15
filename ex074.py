""" Este código utiliza a biblioteca 'random' para gerar uma tupla 'n' contendo cinco números inteiros aleatórios no intervalo de 1 a 10(inclusive).
 Em seguida, o código imprime os números sorteados, o maior valor na tupla e o menor valor na tupla"""

# Importa a função randint da biblioteca random
from random import randint

# Gera uma tupla com cinco números inteiros aleatórios entre 1 e 10
n = (randint(1, 10), randint(1, 10), randint(1, 10), randint(1, 10), randint(1, 10))

# Imprime os números sorteados
print(f'Os números sorteados foram {n}')

# Imprime o maior valor na tupla usando a função max
print(f'O maior valor sorteado foi {max(n)}')

# Imprime o menor valor na tupla usando a função min
print(f'O menor valor sorteado foi {min(n)}')
