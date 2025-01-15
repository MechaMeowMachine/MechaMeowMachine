print('Soma entre todos os números ímpares múltiplos de três:')
impares = 0
for c in range(0, 500):
    if c % 2 != 0 and c % 3 == 0:
        impares += c
print(impares)
