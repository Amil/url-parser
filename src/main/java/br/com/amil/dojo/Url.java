package br.com.amil.dojo;

public class Url {

	private String value;
	
	private String protocolo;
	
	public Url(String url) {
		this.value = url;
		this.parse();
	}

	private void parse() {
		this.protocolo = value.split(":")[0]; 
	}
	
	public String getProtocolo() {
		return protocolo;
	}

}