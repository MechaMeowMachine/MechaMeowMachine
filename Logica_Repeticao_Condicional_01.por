programa
{
  
  funcao inicio()
  {
    inteiro codigo
       real preco

    escreva("Digite o código do produto: ")
    leia(codigo)
    escreva("Digite o preço do produto: ")
    leia(preco)
    se (codigo == 1)
      escreva("Produto do SUL - Preço = " + preco)
    senao
    se (codigo == 2)
      escreva("Produto do NORTE - Preço = " + preco)
    senao
    se (codigo == 3)
      escreva("Produto do LESTE - Preço = " + preco)
    senao
    se (codigo == 4)
      escreva("Produto do OESTE - Preço = " + preco)
    senao
    se (codigo == 5 ou codigo == 6)
      escreva("Produto do NORDESTE - Preço = " + preco)
    senao
    se (codigo == 7 ou codigo == 8 ou codigo == 9)
      escreva("Produto do SUDESTE - Preço = " + preco)
    senao
    se (codigo >= 10 e codigo <= 20) 
      escreva("Produto do CENTRO-OESTE - Preço = " + preco)
    senao
    se (codigo >= 25 e codigo <= 30) 
      escreva("Produto do NOROESTE - Preço = " + preco)
    senao
         escreva("Produto Importado - Preço = " + preco)

  }
}

