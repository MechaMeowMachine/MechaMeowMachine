n = 0
while True:
    n = int(input('Digite um número para saber sua tabuada: '))
    print('-' * 30)
    if n < 0:
        break
    else:
        for c in range(1, 11):
            print(f'{n} x {c:2} = {n * c}')
    print('-'*30)
 