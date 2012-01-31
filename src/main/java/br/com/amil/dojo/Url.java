package br.com.amil.dojo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

	private static final Pattern URL_PATTERN = Pattern.compile("(.+)://(www\\.)?(.+?)(/.*)");

	private String value;
	
	private String protocolo;
	private String dominio;

	private String path;
	
	public Url(String url) {
		this.value = url;
		this.parse();
	}

	private void parse() {
		Matcher matcher = URL_PATTERN.matcher(value);
		if (matcher.matches()) {
			protocolo = matcher.group(1);
			dominio = matcher.group(3);
			path = matcher.group(4);
		}
	}
	
	public String getProtocolo() {
		return protocolo;
	}

	public String getDominio() {
		return dominio;
	}

	public String getPath() {
		return path;
	}

}
