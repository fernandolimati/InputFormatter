import java.util.ArrayList;

/*
 ************************************************************
 ************************************************************
 ****** CRIADO POR: 	FERNANDO DE LIMA SANTOS		*********
 ****** EMAIL:	 		FLIMAENG@GMAIL.COM			*********
 ****** DATA:  			15/09/2017					*********
 ************************************************************
 ************************************************************/

public class InputFormatter {
	
	String inputText;
	String outputText;
	ArrayList<String> caracteresValidos = new ArrayList<String>();
	ArrayList<String> mask = new ArrayList<String>();
	ArrayList<String> outputStringMasked = new ArrayList<String>();
	int qtdCaracteres;
	
	InputFormatter(){
		inputText = "";
		outputText = "";
		qtdCaracteres = 0;
	}
	
	InputFormatter(String inputText,int qtdCaracteres,String caracteresValidos){
		this.inputText = inputText;
		for(int i=0;i<caracteresValidos.length();i++) this.caracteresValidos.add(Character.toString(caracteresValidos.charAt(i)));
		this.outputText = "";
		this.qtdCaracteres = qtdCaracteres;
	}
	
	InputFormatter(String inputText,String mask,String caracteresValidos){
		this.inputText = inputText;
		setCaracteresValidos(caracteresValidos);
		this.outputText = "";
		setMask(mask);
		qtdCaracteres = 0;
	}
	
	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public int getQtdCaracteres() {
		return qtdCaracteres;
	}

	public void setQtdCaracteres(int qtdCaracteres) {
		this.qtdCaracteres = qtdCaracteres;
	}
	
	public void setCaracteresValidos(String caracteresValidos) {
		for(int i=0;i<caracteresValidos.length();i++) this.caracteresValidos.add(Character.toString(caracteresValidos.charAt(i)));
	}
	
	public void setMask(String mask) {
		for(int i=0;i<mask.length();i++) this.mask.add(Character.toString(mask.charAt(i)));
	}
	
	public String getOutputText() {
		return outputText;
	}
	
	public void formatString() {
		outputText = "";
		if(this.qtdCaracteres == 0) {
			for(int i=0;i<inputText.length();i++) {
				if(caracteresValidos.contains(Character.toString(inputText.charAt(i))))
					outputText += Character.toString(inputText.charAt(i));
			}
		}else {
			for(int i=0;i<=this.qtdCaracteres;i++) {
				if(caracteresValidos.contains(Character.toString(inputText.charAt(i))))
					outputText += Character.toString(inputText.charAt(i));
			}
		}
		
	}
	
	public void formatStringMask() {
		outputStringMasked = mask;
		formatString();
		for(int i=0;i<outputText.length();i++) {
			boolean foundString = false;
			for(int j=0;j<outputStringMasked.size();j++) {
				if(outputStringMasked.get(j).equals("#") && !foundString) {
					outputStringMasked.set(j, Character.toString(outputText.charAt(i)));
					foundString = true;
				}
			}
			
		}
		
		if(outputStringMasked.contains("#")) {
			for(int i=0;i<outputStringMasked.size();i++) {
				if(outputStringMasked.get(i).equals("#")) {
					for(int j=i;j<outputStringMasked.size();j++) {
						outputStringMasked.set(j, "");
					}
				}
			}
		}
		outputText = "";
		for(int i=0;i<outputStringMasked.size();i++) outputText += outputStringMasked.get(i);

		
	}

}
