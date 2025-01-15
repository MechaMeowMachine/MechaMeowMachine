from random import randint
c = randint(1, 10)
s = v = 0
print('-='*11)
print('PAR OU ÍMPAR')
print('-='*11)
while True:
    e = str(input('Digite sua escolha [P/I]: ')).lower()
    j = int(input('Digite sua jogada: '))
    s = j + c
    if e == 'p' and s % 2 == 0:
        print('-' * 40)
        print(f'Jogador jogou {j} e o computador jogou {c}. Total: {s} = Par')
        print('-' * 40)
        print('Você venceu :)')
        print('Congratulations!')
        print('Vamos denovo!')
        print('-=' * 20)
        v += 1
    elif e == 'i' and s % 2 != 0:
        print('-' * 40)
        print(f'Jogador jogou {j} e o computador jogou {c}. Total: {s} = Ímpar')
        print('-' * 40)
        print('Você venceu :)')
        print('Congratulations!')
        print('Vamos denovo!')
        print('-=' * 20)
        v += 1
    elif e == 'i' and s % 2 == 0:
        print('-' * 40)
        print(f'Jogador jogou {j} e o computador jogou {c}. Total: {s} = Par')
        print('-' * 40)
        print('GAME OVER')
        print(f'Você venceu um total de {v} vezes!')
        break
    elif e == 'p' and s % 2 != 0:
        print('-' * 40)
        print(f'Jogador jogou {j} e o computador jogou {c}. Total: {s} = Ímpar')
        print('-' * 40)
        print('GAME OVER')
        print(f'Você venceu um total de {v} vezes!')
        break
