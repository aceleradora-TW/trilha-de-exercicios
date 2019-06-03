package com.thoughtworks.aceleradora.logica.dilemaPrisioneiro;

import com.thoughtworks.aceleradora.logica.dilemaPrisioneiro.DilemaDoPrisioneiro.Resposta;
import org.junit.*;

import javax.swing.*;

public class DilemaDoPrisioneiroTeste {

    @Test
    public void testCenario1() {

        Resposta respostaSuspeitoA = Resposta.DELACAO;
        Resposta respostaSuspeitoB = Resposta.DELACAO;

        DilemaDoPrisioneiro dp = new DilemaDoPrisioneiro();
        Assert.assertNotNull(dp);

        int penaSuspeitoA = dp.calculaPena(respostaSuspeitoA, respostaSuspeitoB);
        int penaSuspeitoB = dp.calculaPena(respostaSuspeitoB, respostaSuspeitoA);

        Assert.assertEquals(5, penaSuspeitoA);
        Assert.assertEquals(5, penaSuspeitoB);

    }

    @Test
    public void testCenario2() {

        Resposta respostaSuspeitoA = Resposta.NEGACAO;
        Resposta respostaSuspeitoB = Resposta.DELACAO;

        DilemaDoPrisioneiro dp = new DilemaDoPrisioneiro();
        Assert.assertNotNull(dp);

        int penaSuspeitoA = dp.calculaPena(respostaSuspeitoA, respostaSuspeitoB);
        int penaSuspeitoB = dp.calculaPena(respostaSuspeitoB, respostaSuspeitoA);

        Assert.assertEquals(10, penaSuspeitoA);
        Assert.assertEquals(0, penaSuspeitoB);

    }

    @Test
    public void testCenario3() {

        Resposta respostaSuspeitoA = Resposta.DELACAO;
        Resposta respostaSuspeitoB = Resposta.NEGACAO;

        DilemaDoPrisioneiro dp = new DilemaDoPrisioneiro();
        Assert.assertNotNull(dp);

        int penaSuspeitoA = dp.calculaPena(respostaSuspeitoA, respostaSuspeitoB);
        int penaSuspeitoB = dp.calculaPena(respostaSuspeitoB, respostaSuspeitoA);

        Assert.assertEquals(0, penaSuspeitoA);
        Assert.assertEquals(10, penaSuspeitoB);

    }

    @Test
    public void testCenario4() {

        Resposta respostaSuspeitoA = Resposta.NEGACAO;
        Resposta respostaSuspeitoB = Resposta.NEGACAO;

        DilemaDoPrisioneiro dp = new DilemaDoPrisioneiro();
        Assert.assertNotNull(dp);

        int penaSuspeitoA = dp.calculaPena(respostaSuspeitoA, respostaSuspeitoB);
        int penaSuspeitoB = dp.calculaPena(respostaSuspeitoB, respostaSuspeitoA);

        Assert.assertEquals(1, penaSuspeitoA);
        Assert.assertEquals(1, penaSuspeitoB);

    }

}
