resp = 'S'
s = q = m = nM = nm = 0
while resp in 'Ss':
    n = int(input('Digite um número: '))
    s += n
    q += 1
    if q == 1:
        nM = nm = n
    else:
        if n > nM:
            nM = n
        if n < nm:
            nm = n
    resp = str(input('Quer continuar? [S/N] ')).upper().strip()[0]
m = s / q
print(f'Você digitou {q} números e a média foi {m}\nMaior número digitado: {nM}\nMenor número digitado: {nm}')
