programa
{
inclua biblioteca Util --> s
  funcao inicio()
  {
      inteiro computador, palpite
      
     computador = s.sorteia(1, 10)
     escreva("Adivinhe o número sorteado pelo computador: ")
     leia(palpite)
     se (computador == palpite) 
       escreva("\nVocê acertou!!!")
     senao
       escreva("\nVocê errou!!! O número sorteado foi " + computador)
  
  }
} 
