n = nd = s = 0
while True:
    n = int(input('Digite um número (digite 999 para parar): '))
    if n == 999:
        break
    s += n
    nd += 1
print(f'Foram digitados {nd} números\nE a soma entre eles é {s}')
