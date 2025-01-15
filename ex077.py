""" Esse código analisa uma lista de palavras e imprime as vogais de cada palavra"""

# Lista de palavras
palavras = 'chipi chipi', 'chapa chapa', 'dubi dubi', 'daba daba', 'magico', 'mi', 'dubi dubi', 'boom boom boom boom'

# Loop externo para iterar sobre as palavras
for p in palavras:
    print(f'\nNa palavra {p.upper()} temos ', end='')

    # loop interno para iterar sobre as letras de cada palavra
    for letra in p:
        # Verifica se a letra (convertida para minúsculo) é uma vogal
        if letra.lower() in 'aeiou':
            print(letra, end=' ')
