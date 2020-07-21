#language:pt

@lojaVirtual
Funcionalidade: Loja Virtual
  Busca livro


  @validarLivro
  Cenario: Validar Livro
   Dado que estou na pagina loja virtual
   Quando realizo a busca do livro "Fortaleza Digital"
   Entao valido o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital" 
   E o preco sendo "R$519,90"
	 Quando clico no livro pesquisado
	 Entao confirmo o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital" e o preco sendo "R$519,90" 
	 
  
