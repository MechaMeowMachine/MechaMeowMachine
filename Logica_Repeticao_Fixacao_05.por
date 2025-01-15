programa {
  funcao inicio() {
    inteiro i, sexo, cont = 0
    real s

    para(i = 1; i <= 5; i++){
      escreva("Digite seu sexo: (1)Feminino (2)Masculino ")
      leia(sexo)
      escreva("Digite seu salário: ")
      leia(s)
      se (sexo == 1 e s <= 1500)
      cont = cont + 1
    }
    escreva("Total de mulheres com o salário de até R$1500,00: ", cont)
  }
}
