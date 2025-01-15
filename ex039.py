idade = int(input('Digite sua idade: '))
if idade < 18:
    print('Você ainda vai se alistar')
    print(f'Faltam {18 - idade} anos para você se alistar')
elif idade == 18:
    print('É hora de se alistar!')
else:
    print('Já passou do tempo de alistamento')
    print(f'Já se passou {idade - 18} anos do tempo de você se alistar')
