s = str(input('Digite seu sexo: [M/F]')).upper().strip()
while s != 'M' and s != 'F':
    s = str(input('Por favor digite M ou F:')).upper().strip()
print(f'Sexo {s} registrado com sucesso')

#while s not in 'MmFf':
