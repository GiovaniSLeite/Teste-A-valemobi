# Teste-A-valemobi

## 1 ­ Criar um objeto que represente os dados da tabela tb_customer_account​ acima

Foi criada a classe Customer_account a fim de modelar o objeto disposto na tabela.
A classe Customer_account implementa a interface Comparable (a fim de estabelecer uma ordem entre seus objetos) e dispõe dos seguintes atributos:
id, cpf_cnpj, name, is_active e vl_total, conforme as colunas da tabela.

Além disso, dispõe de métodos que dão acesso a estes atributos (getId, getCpf_cnpj,getName, is_active e getVl_total, respectivamente) mais o método compareTo, exigido pela interface Comparable, que estabele a ordem dos objetos baseada no valor de vl_total, como é exigido pelo enunciado e os métodos toString e toArrayString que organizam os dados do objeto em uma string e um vetor de strings, respectivamente, para melhor visualização.


Foi também criada uma classe Tabela para organizar os dados da mesma, essa dispõe de uma lista de objetos do tipo Customer_account em seus atributos. Além disso, essa classe carrega os metodos: inserir, calcular_media, imprimir_tabela, ordenar_tabela e quantidade_itens. Foi também criada a classe Teste_execucao. Essa dispõe de dois métodos, main e testar. O primeiro deles organiza uma série de testes, modificando o conjunto de dados a fim de testar diferentes comportamentos do programa criado. A classe testar organiza a execução dos métodos das outras classes na ordem esperada pelo enunciado.

## 2 ­ Criar um programa que percorra uma lista de objetos do tipo criado acima e calcule a média do campo vl_total​ apenas para os itens que este valor seja maior que 560 e o campo id_customer​ esteja entre 1500 e 2700

A função calcular_media percorre todos os objetos dispostos na tabela completa, seleciona os que atendem aos requisitos exigidos, vale ressaltar que para fins do exercício 1500 e 2700 foram considerados não pertencentes ao intervalo estipulado, e faz a soma dos campos vl_total desses. Por fim, retorna a média do vl_total entre os objetos selecionados.

## 3 ­ Exibir a média final.
O retorno da função calcular_media é impresso durante a execucao do teste, codigo presente na classe Teste_execucao.

## 4 ­ Imprima cada um dos objetos selecionados para o cálculo da média.
Os objetos selecionados são guardados em uma tabela e posteriormente impressos. 

## 5 ­ Ordene pelo campo vlTotal os objetos selecionados para o cálculo da média
A partir da classe Collections, parte da biblioteca do java, é utilizado o método sort, que baseado na função compareTo ordena os valores presentes em uma lista, para ordenar a lista dos objetos selecionados presente na tabela e posteriormente imprimi-la.

Detalhes da implementação e explicações acerca das decisões estão comentadas junto do código.