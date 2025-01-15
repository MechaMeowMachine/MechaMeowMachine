""" Este código solicita ao usuário que digite um número entre 0 e 20 e, em seguida, imprime o equivalente por extenso desse número,
utilizando uma tupla 't' para armazenar as palavras correspondentes aos números."""

# Esta linha cria uma tupla chamada 't' que contém palavras correspondentes aos números de 0 a 20
t = 'zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze', 'quatorze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte'

# Aqui, o programa solicita ao usuário que digite um número e converte a entrada para um inteiro
n = int(input('Digite um número entre 0 e 20: '))

"""Esta é uma estrutura condicional que verifica se o número digitado está fora do intervalo de 0 a 20(inclusive). Se estiver, solicita ao usuário que 
insira um número válido, destacando a mensagem em vermelho."""
if n < 0 or n == n > 20:
    n = int(input('\033[31mDigite um número entre 0 e 20: \033[m'))

# Finalmente, esta linha imprime a palavra correspondente ao número digitado utilizando a tupla 't'
print(f'O número digitado foi {t[n]}')
