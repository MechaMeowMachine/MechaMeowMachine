cont = s = 0
n = int(input('Digite um número inteiro [999 para parar]: '))
while n != 999:
    s += n
    cont += 1
    n = int(input('Digite um número inteiro [999 para parar]: '))
    if n == 999:
        print(f'Você digitou um total de {cont} números\nSoma entre os números: {s}')
