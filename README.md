## Teste de Saque em Conta Bancária

Este projeto contém uma classe Java chamada `Conta` para testar saques em uma conta bancária usando Cucumber para testes comportamentais.

### Classe Conta

A classe `Conta` tem atributos como `saldo`, indicando o saldo atual, e métodos Cucumber para definir comportamentos em cenários específicos.

### Execução dos Testes

Os testes são executados pela classe `Runner`, usando o arquivo de feature `arquivos_teste.feature`.

### Keywords Summary

- BDD
- Cucumber
- Teste de Software

### Cenários de Exemplo

#### Cliente Especial Faz Saque com Saldo Negativo

**Scenario:** Cliente especial faz saque com saldo negativo  
**Given** Cliente especial com saldo de -200 reais  
**When** Solicitado saque de 100 reais  
**Then** Deve efetuar saque, atualizando saldo para -300 reais  
**And** check more outcomes

#### Cliente Comum com Saldo Negativo

**Scenario Outline:** Cliente comum com saldo negativo  
**Given** Cliente comum com saldo de -200 reais  
**When** Solicitar saque de 200 reais  
**Then** Não deve efetuar saque, exibindo mensagem de saldo insuficiente

**Examples:**  
| Tipo     | Saldo | Resultado |
|----------|-------|-----------|
| especial | -300  | Verdadeiro|
| comum    | -300  | Falso     |


### Print Screen
![1](https://github.com/ingridkemily/Conta-Bancaria/assets/81453161/c46a7c87-e0f5-44ee-846b-2d5ff7da4fbe)
![2](https://github.com/ingridkemily/Conta-Bancaria/assets/81453161/25fcce02-19de-4336-b9a5-6a8bb13b98cd)
![3](https://github.com/ingridkemily/Conta-Bancaria/assets/81453161/dabff710-e527-4f61-a95b-6a27c2c6d543)
![4](https://github.com/ingridkemily/Conta-Bancaria/assets/81453161/efb461c3-50ab-41cb-8d36-cbaf0afa1376)
![5](https://github.com/ingridkemily/Conta-Bancaria/assets/81453161/914f6452-3a7f-4c7a-9b34-d7b62988a907)




