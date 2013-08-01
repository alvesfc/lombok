package br.com.lombok.test.util;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.lombok.i18n.I18nUtil;

/**
 * Classe responsável em conter os testes de sucesso para os métodos utilitários
 * da classe {@link I18nUtil} para o idioma Espanhol
 * 
 * @author Marcos Alves
 * @version 1.0
 * 
 */
public class I18nUtilSpanishTest {

	private I18nUtil i18nUtil;
	private LocaleEnum locale;

	@Before
	public void initialize() {
		this.locale = LocaleEnum.SPANISH;
		this.i18nUtil = I18nUtil.getInstance();
	}

	@Test
	public void shouldDateFormatter() {
		String result = "19-feb-1985";
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(1985, 1, 19);
		Date d = gc.getTime();

		DateFormat df = i18nUtil.getDateFormatter(locale);

		Assert.assertEquals(df.format(d), result);

	}

	@Test
	public void shouldTimeFormatter() {
		String result = "12:05:30";
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(1985, 1, 19, 12, 05, 30);
		Date d = gc.getTime();
		DateFormat df = i18nUtil.getTimeFormatter(locale);

		Assert.assertEquals(df.format(d), result);
	}

	@Test
	public void shouldNumberFormatter() {
		String result = "3,00 €";

		NumberFormat nf = i18nUtil.getCurrencyFormatter(locale);
		Assert.assertEquals(nf.format(3), result);
	}

	@Test
	public void shouldPercentFormatter() {
		String result = "2.000%";

		NumberFormat nf = i18nUtil.getPercentFormatter(locale);

		Assert.assertEquals(nf.format(20), result);
	}

}
