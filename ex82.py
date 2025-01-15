n = []  # Cria uma lista vazia para armazenar os números digitados
pares = []  # Cria uma lista vazia para armazenar os números pares
impares = []  # Cria uma lista vazia para armazenar os números ímpares

while True:  # Loop infinito até que o usuário decida parar
    n.append(int(input('Digite um número: ')))  # Solicita ao usuário que insira um número e o adiciona a lista 'n'
    r = str(input('Quer continuar [S/N]: ')).upper()  # Solicita ao usuário que decida se quer continuar ou não

    if r == 'N':  # Se o usuário digitar 'N', o loop é interrompido
        break

    if r != 'S':  # Se o usuário digitar algo diferente de 'S' ou 'N', uma mensagem de resposta inválida é exibida
        print('\033[31mRESPOSTA INVÁLIDA\033[m')

print('-='*30)  # Linha de separação visual

# Loop que itera sobre cada número na lista 'n'
for i, v in enumerate(n):
    if v % 2 == 0:  # Se o número for par, é adicionado a lista 'pares'
        pares.append(v)
    elif v % 2 != 0:  # Se o número for ímpar, é adicionado a lista 'ímpares'
        impares.append(v)

# Imprime as listas de números digitados, números pares e números ímpares
print(f'Números digitados: {n}\nNúmeros pares digitados: {pares}\nNúmeros ímpares digitados: {impares}')
