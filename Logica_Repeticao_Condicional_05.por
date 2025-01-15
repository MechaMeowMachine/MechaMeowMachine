programa {
  funcao inicio() {
    real n1, n2, soma

    escreva("Digite um valor: ")
    leia(n1)
    escreva("Digite outro valor")
    leia(n2)
    soma = n1 + n2
    se (n1 + n2 >= 0 e n1+n2 <= 20)
    escreva("O número se encontra entre 0 e 20")
    senao
    se (n1+n2 >= 20 e n1+n2 <= 40)
    escreva("O número se encontra entre 20 e 40")
    senao
    se (n1+n2 >= 40 e n1+n2 <= 60)
    escreva("O número se encontra entre 40 e 60")
    senao
    se (n1+n2 > 60)
    escreva("O número está acima de 60")
	
  }
}
