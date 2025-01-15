programa {
  funcao inicio() {
    inteiro qntM, qntm, qntA, media
    
    escreva("Digite a quantidade atual: ")
    leia(qntA)
    escreva("Digite a quantidade máxima: ")
    leia(qntM)
    escreva("Digite a quantidade miníma: ")
    leia(qntm)
    media = (qntM+qntm)/2
    escreva(media)
    se (qntA >= media)
    escreva("\nNão efetuar compra")
    senao
    escreva("\nEfetuar compra")
  }
}
