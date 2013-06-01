CalculadoraSalarial
===================

Calculadora de Salario com base no tipo de contratação

Esse código foi criado para poder ser usado em refatorações

ou estudos de como evoluir um codigo ruim para um mais  limpo,

robusto e que possa crescer sustentavelmente

==============CENARIOS======================================

#CENARIO 1

Para calcular o salario de uma pessoa física

Como calculadora

Quero calcular o salario liquido de uma PF com base no seu salario bruto


#CENARIO 2

Para calcular o salario de uma pessoa jurídica

Como calculadora

Quero calcular o salario liquido com base no valor hora da PJ

==================OBSERVAÇÕES====================================

 - > TABELA PARA BASE DE CALCULO DO INSS
 
#------------------------------|--------------|
#                              |              |
#Faixa salarial                | Alíquota     |
#                              |              |
#------------------------------|--------------|
#                              |              |
#até R$ 1.174,86               |   8,00%      | 
#                              |              |
#de R$ 1.174,87 até 1.958,10   |   9,00%      |
#                              |              |
#de R$ 1.958,11 até 3.916,20   |   11,00%     |
#                              |              |
#------------------------------|--------------|

 - > TABELA PARA BASE DE IMPOSTO DE RENDA

#-------------------------------|-----------------|
#                               |                 |
#Base de Cálculo (R$)           |   Alíquota (%)  |
#                               |                 |
#-------------------------------|-----------------|
#                               |                 |       
#Até 1.710,78                   |      ISENTO     | 
#                               |                 |                     
#De 1.710,79 até 2.563,91       |       7,5       |
#                               |                 |                   
#De 2.563,92 até 3.418,59       |       15        |
#                               |                 | 
#De 3.418,60 até 4.271,59       |       22,5      |
#                               |                 | 
#Acima de 4.271,59              |       27,5      |
#                               |                 | 
#-------------------------------------------------|

 - > PERCENTUAL DE DESCONTO PARA PESSOA JURIDICA É 5%