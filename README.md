# Challenge Conversor de Moedas

## Descrição

O **Challenge Conversor de Moedas** é o projeto final do curso de Java - Orientação a Objetos. Ele oferece uma interação textual via console, permitindo ao usuário realizar conversões entre moedas com no mínimo **6 (seis)** opções distintas de conversão disponíveis em um menu.

A taxa de conversão não é estática — é obtida dinamicamente por meio de uma API, garantindo dados precisos e atualizados em tempo real para uma experiência mais eficaz e confiável.

---

## Objetivo

Via console, o usuário escolhe uma opção do menu para a conversão desejada e, em seguida, informa o valor que quer converter. O programa então realiza a conversão utilizando a taxa atual da API e apresenta o resultado.

---

## O que encontrar

- 6 (seis) opções de conversão entre moedas disponíveis no menu.
- Interação simples e direta via console.
- Conversão com taxas dinâmicas atualizadas em tempo real.

---

## Customizável

O usuário pode realizar quantas conversões desejar enquanto o programa estiver em execução, sem a necessidade de reiniciar para novas consultas.

---

## Compilando e Executando o Conversor de Moedas

### Requisitos

- IntelliJ IDEA instalado
- Biblioteca **GSON** baixada e adicionada ao projeto (para manipulação de JSON) [https://mvnrepository.com/artifact/com.google.code.gson/gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)

### Passos para configuração do GSON no IntelliJ

1. Baixe a biblioteca GSON no site oficial ou em repositórios confiáveis.
2. Abra o projeto no IntelliJ.
3. No menu, vá em **File > Project Structure**.
4. Clique em **Modules**.
5. Na aba **Dependencies**, clique no ícone **+**.
6. Escolha **JARs or Directories**.
7. Selecione o arquivo JAR do GSON baixado.
8. Confirme para adicionar a dependência.

### Executando o programa

- Execute a classe principal (`Main`) pelo IntelliJ:
  - Clique em **Run Main**  
  - Ou use o atalho **Ctrl + F5**

---

## Utilizando o programa

Ao executar, você verá um menu como o exemplo abaixo:

 1) Dolár --> Peso Argentino
 2) Peso Argentino --> Dolár
 3) Dólar --> Real Brasileiro
 4) Real Brasileiro --> Dólar
 5) Dólar --> Peso Colombiano
 6) Peso colombiano --> Dólar
 7) Sair""");

Esolha uma opção valida:

Em seguida o usuario poderá passar os valores.
