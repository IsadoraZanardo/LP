![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite sua nota\]
      input1 --> input2[\Digite sua freq em %\] 
      input2 --> verification{Nota >=50 \n E \n Freq >= 75%?}
      verification --> |Sim| input4[/Pode votar/]
      verification --> |Não| input5[/Não pode votar/]
      input4 --> finish((Fim))
      input5 --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite n1\]
      input1 --> input2[\Digite n2\] 
      input2 --> input3[Somar n1 + n2]
      input3 --> input4[/Resultado/]
      input4 --> finish((Fim))
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite seu núm\]
      input1 --> input2{Núm >= 0?}
      input2 --> |Sim| input3[/É positivo/]
      input2 --> |Não| input4[/É negativo/]
      input3 --> finish((Fim))
      input4 --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite sua idade\]
      input1 --> input2[\Você tem título?\] 
      input2 --> input3{Idade >=16 \n E \n Tem título?}
      input3 --> |Sim| input4[/Pode votar/]
      input3 --> |Não| input5[/Não pode votar/]
      input4 --> finish((Fim))
      input5 --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite n1\]
      input1 --> input2[\Digite n2\] 
      input2 --> input3{n1 > n2?}
      input3 --> |Sim| input4[/n1 é maior/] 
      input3 --> |Não| input5[/n2 é maior/]
      input4 --> finish((Fim))
      input5 --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.

```mermaid
   flowchart TD
   start((Início)) --> input1[\Digite n1\]
   input1 --> input2[\Digite n2\]
   input2 --> input3[\Digite n3\]
   input3 --> input4{n1 > n2 \n E \n n1 > n3?}
   input4 --> |Sim| input5[/n1 é maior/]
   input4 --> |Não| input6{n2 > n1 \n E \n n2 > n3}
   input6 --> |Sim| input7[/n2 é maior/]
   input6 --> |Sim| input8[/n3 é maior/]
   input5 --> finish
   input7 --> finish((Fim))
   input8 --> finish
  ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite seu núm\]
      input1 --> input2{O núm é zero?}
      input2 --> |Não| input3[Multiplicar num por seus antecessores]
      input2 --> |Sim| start
      input3 --> input4[/Resultado/]
      input4 --> finish((Fim))
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite seu núm\]
      input1 --> input2{O núm é zero?}
      input2 --> |Não| input3{Núm % 2 = 0?}
      input2 --> |Sim| start
      input3 --> |Sim| input5[/Par/]
      input3 --> |Não| input6[/Ímpar/]
      input5 --> finish((Fim))
      input6 --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start((Início)) --> input1[\Digite seu núm\]
      input1 --> input2{O núm é negativo}
      input2 --> |Sim| input4[/Não é primo/]
      input2 --> |Não| input3{O núm é divisível por algum \n número menor que \n ele mesmo e maior que 1?}
      input3 --> |Sim| input4
      input3 --> |Não| input5[/É primo/]
      input5 --> finish((Fim))
      input4 --> finish
   ```