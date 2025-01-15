programa {
  funcao inicio() {
    inteiro i
    real p, a, pr

    para(i = 1; i <= 5; i++){
      escreva("Digite o preço do produto: ")
      leia(p)
      a = (p*20)/100
      pr = p + a
      escreva("Preço reajustado: ", pr, "\n")
    }
  }
}
