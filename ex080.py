lista = []  # Cria uma lista vazia chamada 'lista'

for c in range(0, 5):  # Loop que itera 5 vezes para receber 5 números do usuário
    n = int(input('Digite um número: '))  # Solicita ao usuário que insira um número
    if c == 0 or n > (lista[-1]):  # Se for o primeiro número ou maior que o último número na lista
        lista.append(n)  # Adiciona o número ao final da lista
        print('Adicionado ao final da lista...')
    else:
        pos = 0  # Inicializa a posição para 0
        while pos < len(lista):  # Loop para percorrer a lista
            if n <= lista[pos]:  # Se o número for menor ou igual ao número na posição atual da lista
                lista.insert(pos, n)  # Insere o número na posição atual da lista
                print(f'Adicionado na posição {pos} da lista...')
                break  # Sai do loop
            pos += 1  # Incrementa a posição

print('-='*30)  # Linha de separação visual
print(f'Os valores digitados em ordem foram {lista}')  # Imprime os valores digitados em ordem
