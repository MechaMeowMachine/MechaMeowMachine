 programa {
  funcao inicio() {
    inteiro notas, div, r, c, d, x, i, v

    escreva("Digite o valor a ser sacado: ")
    leia(notas)
    se (notas >= 100)
    div = notas / 100
    r = notas % 100
    c = div
    se (notas >= 50 e notas <= 100)
    div = r / 50
    r = r % 50
    d = div
    se (notas >= 10 e notas <= 50)
    div = r / 10
    r = r % 10
    x = div
    se (notas >= 5 e notas <= 10)
    div = r / 5
    r = r % 5
    v = div
    se (notas >= 1 e notas <= 5)
    div = r / 1
    i = div
    escreva("\n100 = ", c)
    escreva("\n50 = ", d)
    escreva("\n10 = ", x)
    escreva("\n5 = ", v)
    escreva("\n1 = ", i)
  }
}

