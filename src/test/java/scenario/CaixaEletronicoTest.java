/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario;

/**
 *
 * @author Basilio
 */
import org.jbehave.scenario.Scenario;
import step.SaqueDeClienteComumComSaldoNegativo;
import step.SaqueDeClienteEspecialComSaldoNegativo;

public class CaixaEletronicoTest extends Scenario {

    //Construtor
    public CaixaEletronicoTest() {
    //Cria Steps que irão executar os cenários do arquivo texto.
    addSteps(new SaqueDeClienteEspecialComSaldoNegativo());
    addSteps(new SaqueDeClienteComumComSaldoNegativo());
}
}