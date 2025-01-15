print('='*40)
print('    BANCO SEM DINHEIRO')
print('='*40)

#global
count = 0 #contadora de cédulas


v = float(input('Que valor você quer sacar? R$'))
if v ** 5 != int:
    print('\033[31mValor inválido\033[m')
while v > 50:
    v -= 50
    count += 1


print(f'Cédulas de 50: {count}')

count = 0
while v > 20:
    v -= 20
    count += 1
print(f'Cédulas de 20: {count}')

count = 0
while v > 10:
    v -= 10
    count += 1
print(f'Cédulas de 10: {count}')

count = 0
while v > 0:
    v -= 1
    count += 1
print(f'Cédulas de 1: {count}')
