d = float(input('Digite a distância da viagem: '))
if d <= 200:
    print(f'De acordo com a distância dada, o preço da viagem será de: {d*0.50}')
else:
    print(f'De acordo com a distância dada, o preço da viagem será de: {d*0.45}')

#preço = distância * 0.50 if distância <= 200 else distância * 0.45
