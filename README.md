CalculadoraSalarial
===================

Calculadora de Salario com base no tipo de contrata��o

Esse c�digo foi criado para poder ser usado em refatora��es

ou estudos de como evoluir um codigo ruim para um mais  limpo,

robusto e que possa crescer sustentavelmente

==============CENARIOS======================================

#CENARIO 1

Para calcular o salario de uma pessoa f�sica

Como calculadora

Quero calcular o salario liquido de uma PF com base no seu salario bruto


#CENARIO 2

Para calcular o salario de uma pessoa jur�dica

Como calculadora

Quero calcular o salario liquido com base no valor hora da PJ

==================OBSERVA��ES====================================

 - > TABELA PARA BASE DE CALCULO DO INSS
 
#------------------------------|--------------|
#                              |              |
#Faixa salarial                | Al�quota     |
#                              |              |
#------------------------------|--------------|
#                              |              |
#at� R$ 1.174,86               |   8,00%      | 
#                              |              |
#de R$ 1.174,87 at� 1.958,10   |   9,00%      |
#                              |              |
#de R$ 1.958,11 at� 3.916,20   |   11,00%     |
#                              |              |
#------------------------------|--------------|

 - > TABELA PARA BASE DE IMPOSTO DE RENDA

#-------------------------------|-----------------|
#                               |                 |
#Base de C�lculo (R$)           |   Al�quota (%)  |
#                               |                 |
#-------------------------------|-----------------|
#                               |                 |       
#At� 1.710,78                   |      ISENTO     | 
#                               |                 |                     
#De 1.710,79 at� 2.563,91       |       7,5       |
#                               |                 |                   
#De 2.563,92 at� 3.418,59       |       15        |
#                               |                 | 
#De 3.418,60 at� 4.271,59       |       22,5      |
#                               |                 | 
#Acima de 4.271,59              |       27,5      |
#                               |                 | 
#-------------------------------------------------|

 - > PERCENTUAL DE DESCONTO PARA PESSOA JURIDICA � 5%