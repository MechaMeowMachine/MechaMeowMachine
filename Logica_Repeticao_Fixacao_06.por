programa {
  funcao inicio() {
    inteiro i, idade, cont = 0, cont2 = 0
    real peso, alt, sa = 0, m

    para(i = 1; i <= 5; i++){
      escreva("Digite sua idade: ")
      leia(idade)
      escreva("Digite seu peso: ")
      leia(peso)
      escreva("Digite sua altura: ")
      leia(alt)
      se (idade >= 50)
      cont = cont + 1
      se (peso >= 60 e peso <= 80)
      sa = sa + alt
      cont2 = cont2 + 1
    }
    m = sa/cont2
    escreva("Pessoas com idade igual ou superior a 50 anos: ", cont)
    escreva("Média das alturas das pessoas com peso entre 60 e 80 quilos: ", m)
  }
}
