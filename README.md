# Teste-A-valemobi

1 ­ Criar um objeto que represente os dados da tabela tb_customer_account​ acima

Foi criada a classe Customer_account a fim de modelar o objeto disposto na tabela.
A classe Customer_account implementa a interface Comparable (a fim de estabelecer uma ordem entre seus objetos) e dispõe dos seguintes atributos:
id, cpf_cnpj, name, is_active e vl_total, conforme as colunas da tabela.

Além disso, dispõe de métodos que dão acesso a estes atributos (getId, getCpf_cnpj,getName, is_active e getVl_total, respectivamente) mais o método compareTo, exigido pela interface Comparable, que estabele a ordem dos objetos baseada no valor de vl_total, como é exigido pelo enunciado e o método toArrayString que retorna um arranjo com cada um dos valores dos atributos do objeto em questão, utilizado para a impressão formatada.

A classe Main organiza os métodos que exercem as outras funções exigidas pelo enunciado.

2 ­ Criar um programa que percorra uma lista de objetos do tipo criado acima e calcule a média do campo vl_total​ apenas para os itens que este valor seja maior que 560 e o campo id_customer​ esteja entre 1500 e 2700

A função media percorre todos os objetos dispostos na tabela em questão, seleciona os que atendem aos requisitos exigidos e faz a soma dos campos vl_total desses. Por fim, retorna a média do vl_total entre os objetos selecionados.

3 ­ Exibir a média final.
O retorno da função media é impresso dentro da função principal, main.

4 ­ Imprima cada um dos objetos selecionados para o cálculo da média.
Os objetos selecionados são guardados em uma lista durante o cálculo da média e posteriormente impressos. 

5 ­ Ordene pelo campo vlTotal os objetos selecionados para o cálculo da média
A partir da classe Collections, parte da biblioteca do java, utilizamos o método sort, que baseado na função compareTo ordena os valores presentes em uma lista, para ordenar a lista dos objetos selecionados e posteriormente imprimimos a mesma.

Detalhes da implementação e explicações acerca das decisões estão comentadas junto do código.