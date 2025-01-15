idade = int(input('Digite sua idade: '))
if idade <= 9:
    print('MIRIM')
elif idade == 10 or idade <= 14:
    print('INFANTIl')
elif idade == 15 or idade <= 19:
    print('JUNIOR')
else:
    print('MASTER')

from datetime import date
atual = date.today().year
nascimento = int(input('Ano de nascimento: '))
idade = atual - nascimento
print(f'O atleta tem {idade}anos')
if idade <= 9:
    print('Classificação: INFANTIL')
elif idade <= 14:
    print('Classificação: JUNIOR')
elif idade <= 25:
    print('Classificação: SÊNIOR')
else:
    print('Classificação: MASTER')
