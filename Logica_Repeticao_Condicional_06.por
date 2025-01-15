programa {
  funcao inicio() {
    real morango, maca, tot, desc, pmg, pm
    inteiro totkg

    escreva("Digite o quilograma de morangos: ")
    leia(morango)
    escreva("Digite o quilograma de maçãs: ")
    leia(maca)
    totkg = morango + maca
    escreva(totkg)
    se (morango <= 5)
    pmg = morango * 2.50
    senao
    se (morango > 5)
    pmg = morango * 2.20
    se (maca <= 5)
    pm = maca * 1.80
    senao
    se (maca > 5)
    pm = maca * 1.50
    se (totkg > 8 ou tot >= 26)
    desc = tot * 0.10
    pm + pmg = tot
    tot = tot - desc
    escreva("\nValor a pagar = ", tot)
    escreva("Valor a pagar = ", tot)
    
    
    
  }
}
