from random import random
n1 = n2 = menu = 1
while menu != 5:
    n1 = int(input('Digite o primeiro valor: '))
    n2 = int(input('Digite o segundo valor: '))
    menu = int(input('[1]somar\n'
                     '[2]multiplicar\n'
                     '[3]maior\n'
                     '[4]novos números\n'
                     '[5]sair do programa\n'
                     'Digite o que deseja fazer: '))
    if menu == 1:
        print(f'A soma dos números é {n1 + n2}')
    elif menu == 2:
        print(f'O produto dos números é {n1 * n2}')
    elif menu == 3:
        if n1 > n2:
            print(f'O maior número é {n1}')
        else:
            print(f'O maior número é {n2}')
    elif menu == 4:
        print(f'Novos valores: {random():.1f} e {random():.1f}')
    else:
        print('Opção inválida. Tente novamente')
    print('=-=' * 10)
print('\nPrograma encerrado')
