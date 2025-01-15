mi = 0
h = 0
mm = 0
while True:
    print('-'*30)
    print('    CADASTRE UMA PESSOA')
    print('-'*30)
    i = int(input('Idade: '))
    s = str(input('Sexo: [M/F] ')).lower()
    if i >= 18:
        mi += 1
    if s == 'm':
        h += 1
    if s == 'f' and i <= 19:
        mm += 1
    print('-'*30)
    qc = str(input('Quer continuar? [S/N] ')).lower()
    if qc == 'n':
        break
print('='*6, 'FIM DO PROGRAMA', '='*6)
print(f'Total de pessoas com mais de 18 anos: {mi}')
print(f'Ao todo temos {h} homens cadastrados')
print(f'E temos {mm} mulheres cadastradas com menos de 20 anos')
