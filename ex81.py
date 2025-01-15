v = list()  # Cria uma lista vazia chamada 'v'

while True:  # Loop infinito até que o usuário decida parar
    v.append(int(input('Digite um número: ')))  # Solicita ao usuário que insira um número e o adiciona a lista 'v'
    r = str(input('Quer continuar? [S/N]: ')).upper()  # Solicita ao usuário que decida se quer continuar ou não

    if r == 'N':  # Se o usuário digitar 'N', o loop é interrompido
        break
    if r != 'S':  # Se o usuário digitar algo diferente de 'S' ou 'N', uma mensagem de resposta inválida é exibida
        print('\033[31mRESPOSTA INVÁLIDA\033[m')

print('-='*30)  # Linha de separação visual

# Imprime a quantidade de números digitados (tamanho da lista 'v'
print(f'Números digitados: {len(v)}')

v.sort(reverse=True)  # Ordena os números em ordem decrescente
# Imprime os números em ordem decrescente
print(f'Números em ordem decrescente: {v}')

# Verifica se o número 5 está presente na lista 'v' e imprime uma mensagem correspondente
if 5 in v:
    print('O número 5 está na lista')

else:
    print('O número 5 não está na lista')
