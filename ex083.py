# Solicita ao usuário que digite uma expressão e armazena em 'expr'
expr = str(input('Digite uma expressão: '))

# Cria uma lista vazia chamada 'pilha' para rastrear os parênteses
pilha = []

# Loop que itera sobre cada caractere na expressão
for simb in expr:
    # Se encontrar um parêntese de abertura, adiciona a pilha
    if simb == '(':
        pilha.append('(')
    # Se encontrar um parêntese de fechamento:
    elif simb == ')':
        # Se houver parenteses de abertura na pilha, remove um parêntese de abertura
        if len(pilha) > 0:
            pilha.pop()
        # Se a pilha estiver vazia ou não houver parênteses de abertura suficientes, a expressão é inválida
        else:
            pilha.append(')')
            break

# Se a pilha estiver vazia, todos os parênteses foram fechados corretamente
if len(pilha) == 0:
    print('Sua expressão está válida!')
# Caso contrário, a expressão é inválida
else:
    print('Sua expressão está errada!')
