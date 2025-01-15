""" Esse código fornece uma representação estruturada e formatada das informações relacionas ao Campeonato Brasileiro de Futebol 2023"""

# Lista de times
t = '', 'Botafogo', 'Palmeiras', 'Red Bull Bragantino', 'Grêmio', 'Atlético-MG', 'Flamengo', 'Athletico-PR', 'Fluminense', 'Fortaleza', 'São Paulo', 'Internacional', 'Cuiabá', 'Corinthians', 'Santos', 'Bahia', 'Vasco', 'Cruzeiro', 'Goiás', 'Coritiba', 'América-MG'

# Linha de caracteres '-' repetida para criar uma linha separadora
print('-='*60)

# Cabeçalho de Campeonato Brasileiro de Futebol 2023 e os 20 primeiros colocados
print('Campeonato Brasileiro de Futebol 2023'
      '\n20 primeiros colocados:'
      '\n1- Botafogo'
      '\n2- Palmeiras'
      '\n3- Red Bull Bragantino'
      '\n4- Grêmio'
      '\n5- Atlético-MG'
      '\n6- Flamengo'
      '\n7- Athletico-PR'
      '\n8- Fluminense'
      '\n9- Fortaleza'
      '\n10- São Paulo'
      '\n11- Internacional'
      '\n12- Cuiabá'
      '\n13- Corinthians'
      '\n14- Santos'
      '\n15- Bahia'
      '\n16- Vasco'
      '\n17- Cruzeiro'
      '\n18- Goiás'
      '\n19- Coritiba'
      '\n20- América-MG')
print('-='*60)

# Imprime os cinco primeiros colocados usando slicing
print(f'Cinco primeiros colocados: {t[1:6]}')
print('-'*60)

# Imprime os últimos 4 colocados usando slicing
print(f'Últimos 4 colocados: {t[-4:]}')
print('-'*60)

# Imprime os times em ordem alfabética usando a função sorted
print(f'Times em ordem alfabética:'
      f'{sorted(t)}')
print('-'*60)

# Imprime a posição do time do Corinthians na lista
print(f'O time do Corinthians se encontra na posição {t.index("Corinthians")}')
