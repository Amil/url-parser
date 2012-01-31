package br.com.amil.dojo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

	private String value;
	
	private String protocolo;
	private String dominio;
	
	public Url(String url) {
		this.value = url;
		this.parse();
	}

	private void parse() {
		this.protocolo = value.split(":")[0]; 
		Matcher matcher = Pattern.compile("(.+)://(www\\.)?(.+)/(.+)").matcher(value);
		if (matcher.matches()) {
			dominio = matcher.group(3);
		}
	}
	
	public String getProtocolo() {
		return protocolo;
	}

	public String getDominio() {
		return dominio;
	}

}
