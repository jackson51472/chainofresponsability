# Chain of Responsibility - Loja de Reparo de Aparelhos

## Descrição
Este projeto utiliza o padrão de projeto **Chain of Responsibility** (Cadeia de Responsabilidade) para resolver problemas em uma loja de reparo de aparelhos eletrônicos. O objetivo é encaminhar cada problema para o funcionário mais adequado, com base na complexidade do reparo necessário.

## Cenário
Na loja de reparo, existem diferentes funcionários responsáveis por lidar com problemas, dependendo da dificuldade. A cadeia de responsabilidade é estruturada da seguinte forma:

1. **TipoProblemaNivelZero**: Se o aparelho não tem conserto, ele é imediatamente recusado.
2. **TipoProblemaNivelUm**: Problemas simples, como uma configuração básica ou troca de bateria, são resolvidos pelo **FuncionarioAtendente**.
3. **TipoProblemaNivelDois**: Problemas mais técnicos, como o mau funcionamento de hardware, são encaminhados para o **FuncionarioEstagiario**.
4. **TipoProblemaNivelTres**: Problemas complexos, como a substituição de peças internas, são enviados para o **FuncionarioTecnico**.

### Funcionamento

- **FuncionarioAtendente**: É o primeiro a avaliar o problema. Se ele for simples (TipoProblemaNivelUm), ele resolve. Caso contrário, passa para o próximo na cadeia.
- **FuncionarioEstagiario**: Recebe problemas mais técnicos (TipoProblemaNivelDois) se o atendente não puder resolver. Caso ele também não possa resolver, encaminha o problema para o técnico.
- **FuncionarioTecnico**: Lida com os problemas mais complexos (TipoProblemaNivelTres). Se nenhum outro funcionário conseguir resolver, ele assume a responsabilidade.
- **TipoProblemaNivelZero**: Indica que o aparelho não tem conserto, encerrando a cadeia de atendimento.

## Benefícios do Padrão Chain of Responsibility
- **Desacoplamento**: Cada funcionário é responsável por apenas um nível de problema. Isso evita que todos os problemas sejam tratados por uma única pessoa.
- **Extensibilidade**: Novos níveis de funcionários ou tipos de problemas podem ser adicionados facilmente, sem modificar o fluxo existente.
- **Flexibilidade**: Permite alterar a ordem dos manipuladores, o que facilita a reorganização da cadeia conforme a necessidade.

## Conclusão
O padrão **Chain of Responsibility** aplicado à loja de reparo de aparelhos eletrônicos garante que os problemas sejam encaminhados ao funcionário mais adequado, otimizando o processo de atendimento e reparo. A hierarquia de responsabilidade faz com que problemas simples sejam resolvidos rapidamente, enquanto problemas mais complexos são tratados por especialistas.
