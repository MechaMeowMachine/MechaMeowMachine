v = float(input('Velocidade do carro: '))
if v > 80:
    print('Você foi multado!')
    print(f'Sua multa: {(v-80)*7}')
else:
    print('Você está dentro dos limites de velocidade.')
