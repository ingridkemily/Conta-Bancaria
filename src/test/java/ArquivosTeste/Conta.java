/**
 * Classe para testes de saque em uma conta bancária.
 * Utiliza Cucumber para testes comportamentais.
 *
 * @author Ingrid Kemily
 * @version 1.0
 * @since 27-11-2023
 */
package ArquivosTeste;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

    // Atributos
    private Integer saldo;
    private boolean isEspecial, allowed;

    /**
     * Configura cliente especial com saldo inicial.
     *
     * @param int1 Saldo inicial.
     */
    @Given("Um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        isEspecial = true;
        saldo = int1;
    }

    /**
     * Simula solicitação de saque.
     *
     * @param int1 Valor do saque.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
        allowed = true;
    }

    /**
     * Efetua saque se permitido, atualiza saldo.
     *
     * @param int1 Novo saldo.
     */
    @Then("deve efetuar o saque e atualiza o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualiza_o_saldo_da_conta_para_reais(Integer int1) {
        if (allowed) {
            saldo -= int1;
        } else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }

    /**
     * Exibe mensagem de espera por mais ações.
     */
    @Then("check more outcomes")
    public void check_more_outcomes() {
        System.out.println("Esperando mais ações");
    }

    /**
     * Configura cliente comum com saldo inicial.
     *
     * @param int1 Saldo inicial.
     */
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
        isEspecial = false;
        saldo = int1;
    }

    /**
     * Simula solicitação de saque para cliente comum.
     *
     * @param int1 Valor do saque.
     */
    @When("solicitar um saque de {int} reais")
    public void solicitar_um_saque_de_reais(Integer int1) {
        allowed = false;
    }

    /**
     * Verifica se saque não permitido, exibe mensagem de saldo insuficiente.
     */
    @Then("n�o deve efetuar o saque e deve retornanar a mensagem saldo insuficiente")
    public void n_o_deve_efetuar_o_saque_e_deve_retornanar_a_mensagem_saldo_insuficiente() {
        if (!allowed) {
            System.out.println("Saldo insuficiente");
        }
    }
}
