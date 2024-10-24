Descrição Geral Este projeto é um sistema de carros que simulam funcionalidades como aceleração, frenagem recursos adicionais turbo e ar-condicionado, usando conceitos de herança, interface, polimorfismo em Java. Estrutura do Projeto O projeto compõe-se das seguintes classes e interfaces:

Car base classe que define o procedimento global de qualquer carro, tal como aceleração, frenagem e verificação do estado (se está parada). Civic uma subclasse de Car, representando um carro do tipo Civic, herdando todas as funcionalidades básicas da classe Car. Ferrari uma subclasse de Car que implementa as interfaces Esportivo, CarroLuxo. Isto adiciona funcionalidade "turbo" e controlar ar condicionado. Esportivo Interface que define métodos para ligar e desligar o turbo. CarroLuxo Interface que define métodos para ligar e desligar o ar-condicionado, seu comportamento base é retornar o nível do ar. CarroTeste Classe com o método main, usado para testar como os carros se comportam. Funcionalidades Aceleração e Frenagem: A classe Carro fornece métodos para acelerar e frear. A aceleração aumenta a velocidade do carro, a frenagem diminui-a de겐douro sem@RequestParam garantir que torne-se negativa. Cada carro tem uma velocidade máxima definida na hora de ser criado. Por exemplo, o Civic tem uma velocidade máxima de 212 km/h, enquanto a Ferrari 350 km/h. Herança e Polimorfismo: A classe Civic herda de Car e usa diretamente os métodos definidos pela classe base. A classe Ferrari herda de Car e implementa as interfaces Esportivo e CarroLuxo, fornecendo como beneficios adicionais recursos para ligar/desligar o "Turbo,turbo e ar condicionado. A Turbo e Ar-Condicionado:

Um Ferrari pode ligar o turbo, que aumenta a aceleração. Se desligar o turbo, reduzindo a potência. O turbo dá mais potência (50 unidades) do que o modo de produção (20 unidades). O ar condicionado podem ser ligado ou desligado, embora a funcionalidade do ar não é apresentar neste exemplo, apenas a estrutura foi implementada. Classes e Interfaces Classe Carro Esta é a classe base que define os atributos e métodos principais: Atributos: VELOCIDADE_MAXIMA: A velocidade máxima do carro. Definido no construtor. estaParado: Indica se o carro está em repouso. acelerar e frear: Taxas de aceleração e frenagem. velocidade: A velocidade atual do carro. Métodos: acelerar(): Aumenta a velocidade do carro até o limite da velocidade máxima. frear(): Reduz a velocidade do carro e para completamente se necessário. estoParado(): Verifica se o carro está em repouso. toString(): Exibe o estado atual do carro. Classe Civic É uma sub-Classe de Carro que herda todos os métodos da classe base. Ela é configurada para ter uma velocidade máxima de 212 kmh. Classe Ferrari Estende Carro e implementa as interfaces Esportivo e CarroLuxo, adicionando funcionalidades adicionais: Turbo: Pode ser se estiver ligado ou desligado, alterando a aceleração do carro. Ar condicionado: Pode ser ligado ou desligado sem funcionar, mas apenas a estrutura foi implementado. Interface Esportivo Define dois métodos: ligarTurbo (): ativa o modo turbo. desligarTurbo: desliga o turbo modo. Interface CarroLuxo Define dois métodos: ligarAr(): Liga o ar condicionado. desligarAr: desliga o ar condicionado e. Também tem um método padrão que retorna o nível de ar (sempre 1 neste exemplo). Testes com a Classe CarroTeste A classe CarroTestes contém o método main que executa a simulação com dois tipos de automóveis:

Se cria um objeto do tipo Civic e ele é acelerado várias vezes, com a velocidade sendo exibida após cada aceleração. Quando um objeto do tipo Ferrari é criado, aplica-se um evento para testar o comportamento com o turbo acoplado ou desconectado. Exemplo deSaída

Previously Generated

Words: 601

Characters: 3989

Mode: Creative

Equivale a um sistema de carros que aceleram, travam, mais eo 'turbo' dos recursos May ar-condicionado não só muitadezseja, em Java. A Estrutura do Projeto O projeto consiste nas classes e interfaces as deseguinte:

Carro: Esta classe é a classe base Dos de todos os automóveis. Fornece métodos de aceleração, frenagem "e estado de verificação (se o carro está parado ou rodando). Civic: subclasse de Carro, que representa um tipo específico Carros Civic. A classe herda todas as funções básicas da classe Carro. Ferrari: subclasse de Carro, que implementa as interfaces Esportivo e CarroLuxo"k, acrescentando "turbo" e ar-condicionadoeste tipo de recursos. Esportivo: 1nterface que define como iniciar e fechar o turbo. CarroLuxo: 1nterface que define como ligar e desligar o ar-condicionado--com um comportamento dentropadrões que retorna o nível de ar. CarroTeste: Classe com método do ponto de entrada principal, usada para testar o Comportamento dos carros. Funcionalidades Aceleração e Frenagem: A classe Carro possuimétodos para acelerar e frear. Lincrença eles aumentam a velocidade do carro e a frenagem a mais reduz, mas eles são condiciosabelleto de modo que nunca nelambastos ensan. Cada carro tem uma velocidade máxima definida no momento do seunascimento. Por exemplo, o Civic tem uma velocidade máxima de 212 km/h, enquanto que a Ferrari atingi350 km/h.notícia: Herança e Polimorfismo: A classe Civic herda de Carro e usa diretamente os métodos definidos pela classe base. A classe Ferrari herda de Carro e implementa as interfaces Esportivo e CarroLuxo, oferecendo assimfuncionalidades adicionais tal como ligar ou desligar o turbue-envando o ar-condicionado Turbo * Ar-Condicionado

A Ferrari pode ligar ou desligar o turbo para conseguir mais aceleração, ou desligar o turbo de volta para a potência normal.Em turbo, é adicionado mais 50 força do que é normal ser matado (20 fichas). 2017-04-02T05A_Can alsoWhether or not the air conditioning is switched on is less important. The purpose is to illustrate how to use our example's structure to build a real application from delphi form design and a little Delphi code.Gases que Lurk na classe de estruturaClasses e InterfacesClasse CarroEsta é a classe base que define os atributos principais:Atributos:VELOCIDADE_MAXIMA - A velocidade máxima do carro (definida no construtor).estaParado: Indica se o carro está parado.Métodos acelerar (acelerar () ou alien ();): aceleração e taxas de freio.velocidade - a velocidade atual do carro.Atual: Métodos acelerar ()-Aumenta a velocidade do carro até que a velocidade máxima seja atingida.frear (): Reduz a velocidade do carro e pára completamente se necessário.estaParado (): Retorna true se o carro estiver parado, de outro modo deverá retornar false.toString (): Uma string que descreve o estado actual do carro.Classe CivicEsta é uma classe menos que Carro que herda o comportamento do classe mãe. Ele é configurado com uma velocidade máxima de 212 km/h.Classe FerrariExtende Carro e implementa as interfaces Esportivo e CarroLuxo, adicionando funcionalidades adicionais:Turbo - Pode ligar ou desligar o turbo, o que alterará a aceleração do carro.Ar - Pode-se ligar ou desligar o ar condicionado, embora o impacto não seja feito on.Interface EsportivoDefinir dois métodos:ligarTurbo (): Activar turbo.mododeDigite desligarTurbo: turbo off.Interface CarroLuxoDefinir dois métodos:ligarAr (): Ligar o ar condicionado.desligarAr (): Desligar o ar condicionado.Tem também um método default que retorna o nível do ar; (normalmente um aqui). Classe de Teste de CarrosTestes A classe CarroTeste contém o principal método que executa a simulação com dois tipos de carros:

Para empregar um objeto com o tipo Ode novo criado, em seguida se acelera várias vezes--a cada aceleração é mostrada a velocidadeROC. Um exemplo do tipo Ferrari é criado e é testado para ver se seu comportamento com a turbina turbo em funcionamento ou desligada é o mesmo