programa
{
inclua biblioteca Util --> s
  funcao inicio()
  {
      inteiro computador, palpite, i, cont1 = 0, cont2 = 0
      
    para(i = 1; i <= 3; i++){
     computador = s.sorteia(1, 10)
     escreva("\nAdivinhe o número sorteado pelo computador: ")
     leia(palpite)
     se (computador == palpite)
       escreva("\nVocê acertou!!!")
     senao
       escreva("\nVocê errou!!! O número sorteado foi " + computador)
     se (computador != palpite)
     cont1 = cont1 + 1
     senao
     cont2 = cont2 + 1
    }
    se (cont1 == 3)
    escreva("\nO computador ganhou todas as vezes :3")
    senao
    se (cont2 == 3)
    escreva("\nCONGRATULATIONS! Você venceu todas as vezes :3")
    escreva("\nComputador = ", cont1, " Jogador = ", cont2)
  }
} 
