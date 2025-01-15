programa {
  funcao inicio() {
    inteiro i, v, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0

    para(i = 1; i <= 5; i++){
      escreva("Candidato para o 1 \n(2) Candidato para o 2 \n(3) Candidato para o 3 \n(4) Candidato para o 4 \n(5) Nulo \n(6) Em branco \nDigite seu voto: ")
      leia(v)
      se (v == 1)
      cont1 = cont1 + 1
      senao
      se (v == 2)
      cont2 = cont2 + 1
      senao
      se (v == 3)
      cont3 = cont3 + 1
      se (v == 4)
      cont4 = cont4 + 1
      se (v == 5)
      cont5 = cont5 + 1
      se (v == 6)
      cont6 = cont6 + 1
    }
    escreva("Votos para o candidato 1: ", cont1, "\nVotos para o candidato 2: ", cont2, "\nVotos para o candidato 3: ", cont3, "\nVotos para o candidato 4: ", cont4, "\nVotos nulos: ", cont5, "\nVotos em branco: ", cont6)
  }
}

