package br.com.amil.dojo;

import org.junit.Test;

import junit.framework.Assert;

public class UrlParserTest {

	@Test
	public void parserUrl() {
		Assert.assertEquals("http", new Url("http://ww.amil.com.br/rede-credenciada").getProtocolo());
		Assert.assertEquals("amil.com.br", new Url("http://www.amil.com.br/rede-credenciada").getDominio());
		Assert.assertEquals("/rede", new Url("http://www.amil.com.br/rede").getPath());
		Assert.assertNull(new Url("http://www.amil.com.br").getPath());
		Assert.assertEquals("/",new Url("http://www.amil.com.br/").getPath());
		Assert.assertEquals("/rede/sp", new Url("http://www.amil.com.br/rede/sp").getPath());

		
	}	
	
}
