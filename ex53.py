f = str(input('Digite uma frase: '))
f2 = (f.lower())
f3 = (f2.replace(' ', ''))
f4 = f3[::-1]
print(f'A frase {f3} ao contrário é {f4}')
if f4 == f3:
    print('A frase é um palíndromo')
else:
    print('A frase não é um palíndromo')

#frase = str(input('Digite uma frase: ')).strip().upper()
#palavras = frase.split()
#junto = ''.join(palavras)
#inverso = ''
#for letra in range(len(junto) -1, -1, -1):
#    inverso += junto[letra]
#print(f'O inverso de {junto} é {inverso}')
#if inverso == junto:
#    print('Temos um palíndromo!)
#else:
#    print('A frase digitada não é um palíndromo!')
