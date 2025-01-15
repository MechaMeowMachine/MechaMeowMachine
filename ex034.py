print('Bem vindo funcionário!')
s = int(input('Digite seu salário para saber seu aumento: '))
if s >= 1250:
    print(f'Seu novo salário: {s+((s*15)/100)}')
else:
    print(f'Seu novo salário: {s+((s*10)/100)}')

