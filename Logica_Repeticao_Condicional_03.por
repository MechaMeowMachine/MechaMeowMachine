programa {
  funcao inicio() {
    real peso, altura, imc

    escreva("Digite seu peso: ")
    leia(peso)
    escreva("Digite sua altura: ")
    leia(altura)
    imc = peso/(altura*altura)
    escreva(imc)
    se (imc <= 18.4)
    escreva("Abaixo do peso")
    senao
    se (imc >= 18.5 e imc <= 24.9)
    escreva("Peso normal")
    senao
    se (imc >= 25 e imc <= 29.9)
    escreva("Sobrepeso")
    senao
    se (imc >= 30 e imc <= 34.9)
    escreva("Obesidade Grau I")
    senao 
    se (imc >= 35 <= 39.9)
    escreva("Obesidade Grau II")
    senao
    se (imc >= 40)
    escreva("Obesidade Grau III (ou Mórbida)")
  }
}

