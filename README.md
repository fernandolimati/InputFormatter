# InputFormatter
/*
 ************************************************************
 ************************************************************
 ****** CRIADO POR: 	FERNANDO DE LIMA SANTOS		*********
 ****** EMAIL:	 		FLIMAENG@GMAIL.COM			*********
 ****** DATA:  			15/09/2017					*********
 ************************************************************
 ************************************************************
 * 
 * MANUAL DE USO DA BIBLIOTECA
 * 
 * 1- Uso passando uma MASK padrão para formatação dos dados
 * 2- Apenas caracteres validos passados e/ou quantidade maxima de caracteres
 * 
 * 1 tipo:
 * Pode instanciar o objto por padrao e setar os campos como abaixo:
 * obj.setMask(mask); mask = string com a forma de mask aonde # são os caracteres e pode se usar qualquer outro para ser algum delimitador ou algo default
 * obj.setCaracteresValidos(caracteresValidos); recebe uma String com todos os caracteres que serao aceitos
 * obj.setInputText(texto); ira receber o texto a ser formatado
 * obj.formatStringMask(); formata a string quanto a mask passada
 * obj.getOutputText(); retorna uma string com o texto formatado
 * 
 * ou faz instancia do objeto passando por parametro os dados exemplo:
 * InputFormatter obj = new InputFormatter(String inputText,String mask,String caracteresValidos);
 * depois so chamar o formatStringMask();
 * 
 * 
 * 
 * 2 tipo:
 * Pode instanciar o objeto por padrao e setar os campos como abaixo:
 * obj.setInputText(texto); recebe uma string com o texto a ser formatado
 * obj.setCaracteresValidos(caract); recebe uma string com os caracteres que serao validos
 * obj.setQtdCaracteres(qtd); recebe um int com a quantidade maxima de caracteres (se nao for setado fica sem limite)
 * obj.formatString(); formata a string conforme a qtd de caracteres e os caracteres validos
 * obj.getOutputText(); pega o texto formatado;
 * 
 * 
 * 
 * */
