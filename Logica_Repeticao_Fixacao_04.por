programa {
  funcao inicio() {
    inteiro i, cont = 0
    real s, m, tot = 0

    para(i = 1; i <= 5; i++){
      escreva("Digite seu salário: ")
      leia(s)
      cont = cont + 1
      tot = tot + s
    }
    m = tot/cont
    escreva("Média salárial da população: ", m)
  }
}
