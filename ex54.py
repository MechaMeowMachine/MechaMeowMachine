from datetime import date
atual = date.today().year
totmaior = 0
totmenor = 0
for pess in range(1, 8):
    n = int(input(f'Digite o ano de nascimento da {pess}ª pessoa: '))
    i = atual - n
    if i >= 21:
        totmaior += 1
    else:
        totmenor += 1
print(f'Ao todo tem {totmaior} maiores de idade')
print(f'E {totmenor} menores de idade')
