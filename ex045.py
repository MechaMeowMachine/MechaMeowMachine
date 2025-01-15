from random import randint
itens = ('Pedra', 'Papel', 'Tesoura')
c = randint(0, 2)
print('JOKENPÔ!')
print('''Opções:
[ 0 ] PEDRA
[ 1 ] PAPEL
[ 2 ] TESOURA''')
j = int(input('Sua jogada: '))
print('-=' * 11)
print(f'Computador jogou {(itens[c])}')
print(f'Jogador jogou {(itens[j])}')
print('-=' * 11)
if c == 0 and j == 2:
    print('Você perdeu :)')
    print('Mais sorte na próxima vez!')
elif c == 0 and j == 1:
    print("Eu perdi :'‑)")
elif c == 0 and j == 0:
    print('Ahh, empate! você está me imitando por acaso?')
elif c == 1 and j == 0:
    print('Você perdeu :)')
    print('Vamos, você pode ser melhor que isso')
elif c == 1 and j == 2:
    print('Eu perdi!')
    print('Maldição!')
elif c == 1 and j == 1:
    print('Empate! você não sabe escolher outra coisa?!')
elif c == 2 and j == 0:
    print('Eu perdi!')
    print('Agh! não fique tão convencido!')
    print('na próxima irei ganhar!')
elif c == 2 and j == 2:
    print('Ah! empate!')
else:
    print('Bwahahahah! nunca ira ganhar de mim!')
