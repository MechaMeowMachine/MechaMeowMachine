maior = 0
menor = 0
for p in range(1, 6):
    peso = (float(input(f'Digite o peso da {p}ª pessoa: ')))
    if p == 1:
        maior = peso
        menor = peso
    else:
        if peso > maior:
            maior = peso
        if peso < menor:
            menor = peso
print(f'O maior peso lido foi de {maior}Kg')
print(f'O menor peso lido foi de {menor}Kg\n')

pesos = [float(input(f'Peso da {a}ª pessoa: ')) for a in range(1, 6)]
print(f'O maior peso foi de {max(pesos)}Kg')
print(f'O menor foi de {min(pesos)}Kg')
