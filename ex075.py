""" Este código produz uma listagem de itens e preços de maneira agradável"""

#listagem de preços
listagem = ('Lápis', 1.75, 'Borracha', 2.00, 'Caderno', 15.00, 'Estojo', 25.00, 'Transferidor', 4.20, 'Compasso', 9.99, 'Mochila', 120.32, 'Canetas', 22.30, 'Livro', 34.90)

# Linhas de caracteres '-' repetidas para criar uma moldura
print('-'*39)
print('          LISTAGEM DE PREÇOS')
print('-'*39)

# Loop for para iterar sobre a lista e exibir os itens e preços formatados
for pos in range(0, len(listagem)):
    if pos % 2 == 0:  # Se a posição for par (índice dos itens)
        print(f'{listagem[pos]:.<30}', end='')  # Alinhamento a esquerda com pontos
    else:  # Se a posição for ímpar (índice dos preços)
        print(f'R${listagem[pos]:>7.2f}')  # Alinhamento a direita com duas casa decimais

# A execução dp loop termina aqui
