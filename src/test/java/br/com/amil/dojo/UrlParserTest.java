package br.com.amil.dojo;

import org.junit.Test;

import junit.framework.Assert;

public class UrlParserTest {

	@Test
	public void parserUrl() {
		Assert.assertEquals("http", new Url("http://ww.amil.com.br/rede-credenciada").getProtocolo());
	}
	
}
