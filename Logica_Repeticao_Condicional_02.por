programa {
  funcao inicio() {

    inteiro codigo

    escreva("Digite o código do produto: ")
    leia(codigo)
    se (codigo == 1)
    escreva("Alimento não-perecível")
    senao
    se (codigo >= 2 e codigo <= 4)
    escreva("Alimento perecível")
    senao
    se (codigo == 5 ou codigo == 6)
    escreva("Vestuário")
    senao
    se (codigo == 7)
    escreva("Higiene pessoal")
    
  }
}
