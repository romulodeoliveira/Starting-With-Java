# O que são:

Microsserviços são uma abordagem arquitetônica e organizacional do desenvolvimento de software na qual o software consiste em pequenos serviços independentes que se comunicam usando APIs bem definidas. Esses serviços pertencem a pequenas equipes autossuficientes.

As arquiteturas de microsserviços facilitam a escalabilidade e agilizam o desenvolvimento de aplicativos, habilitando a inovação e acelerando o tempo de introdução de novos recursos no mercado.

# Vantagens

Segundo a Microsoft, na página 56 do PDF que está no repositório:

Por que uma arquitetura de microsserviços? Em resumo, ela oferece agilidade de longo prazo. Os microsserviços permitem melhor facilidade de manutenção em sistemas complexos, grandes e altamente escalonáveis permitindo a criação de aplicativos com base em muitos serviços implantáveis de maneira independente em que cada um tenha ciclos de vida autônomos e granulares.

Como uma vantagem adicional, os microsserviços podem ser aumentados de forma independente. Em vez de ter um único aplicativo monolítico que você deve aumentar como uma unidade, é possível aumentar microsserviços específicos. Desta forma, é possível escalar apenas a área funcional que precisa de mais potência de processamento ou largura de banda de rede para dar suporte à demanda, em vez de aumentar outras áreas do aplicativo que não precisam ser escaladas. Isso significa economias de custo, porque você precisa de menos hardware.

Segundo a Amazon, a arquitetura de microsserviços possui as seguintes vantagens:

## Agilidade

Os microsserviços promovem uma organização de equipes pequenas e independentes que são proprietárias de seus serviços. As equipes atuam dentro de um contexto pequeno e claramente compreendido e têm autonomia para trabalhar de forma mais independente e rápida. O resultado é a aceleração dos ciclos de desenvolvimento. Você obtém benefícios significativos do throughput agregado da organização.

## Escalabilidade flexível

Os microsserviços permitem que cada serviço seja escalado de forma independente para atender à demanda do recurso de aplicativo oferecido por esse serviço. Isso permite que as equipes dimensionem corretamente as necessidades de infraestrutura, meçam com precisão o custo de um recurso e mantenham a disponibilidade quando um serviço experimenta um pico de demanda.

## Fácil implantação

Os microsserviços permitem a integração e a entrega contínuas, o que facilita o teste de novas ideias e sua reversão caso algo não funcione corretamente. O baixo custo de falha permite a experimentação, facilita a atualização do código e acelera o tempo de introdução de novos recursos no mercado.

## Liberdade tecnológica

As arquiteturas de microsserviços não seguem uma abordagem generalista. As equipes são livres para escolher a melhor ferramenta para resolver problemas específicos. O resultado é que as equipes que criam microsserviços podem optar pela melhor ferramenta para cada tarefa.

## Código reutilizável

A divisão do software em módulos pequenos e bem definidos permite que as equipes usem funções para várias finalidades. Um serviço criado para uma determinada função pode ser usado como componente básico para outro recurso. Isso permite que os aplicativos sejam reutilizados, pois os desenvolvedores podem criar recursos sem precisar escrever código.

## Resiliência

A independência do serviço aumenta a resistência a falhas do aplicativo. Em uma arquitetura monolítica, a falha de um único componente poderá causar a falha de todo o aplicativo. Com os microsserviços, os aplicativos lidam com a falha total do serviço degradando a funcionalidade, sem interromper todo o aplicativo.

# Desafios

Segundo a Microsoft, os principais desafios são:

## Desafio #1: como definir os limites de cada microsserviço:

Definir os limites dos microsserviços provavelmente é o primeiro desafio que qualquer pessoa encontra. Cada microsserviço deve ser uma parte do aplicativo e cada microsserviço deve ser autônomo com todos os benefícios e desafios que ele abrange. Mas como identificar esses limites?

## Desafio #2: como criar consultas que recuperam dados de vários microsserviços

Um segundo desafio é como implementar consultas que recuperam dados de vários microsserviços, evitando a comunicação intensa dos aplicativos clientes remotos com os microsserviços. Um exemplo pode ser uma única tela de um aplicativo móvel que precisa mostrar microsserviços de informações do usuário que pertencem ao carrinho de compras, de catálogo e de identidade do usuário. Outro exemplo seria um relatório complexo envolvendo diversas tabelas localizadas em vários microsserviços. A solução certa depende da complexidade das consultas. Mas em qualquer caso, será necessária uma maneira de agregar informações se você desejar melhorar a eficiência nas comunicações do sistema.

## Desafio #3: como obter consistência entre vários microsserviços

Como mencionado anteriormente, os dados pertencentes a cada microsserviço são privados desse microsserviço e só podem ser acessados usando a API desse microsserviço. Portanto, um desafio apresentado é como implementar processos de negócios de ponta a ponta, mantendo a consistência entre vários microsserviços.

## Desafio #4: como projetar a comunicação entre os limites dos microsserviços

A comunicação entre os limites dos microsserviços é realmente um grande desafio. Nesse contexto, a comunicação não se refere a qual protocolo você deve usar (HTTP e REST, AMQP, mensagens e assim por diante). Nesse caso, ela aborda qual estilo de comunicação você deve usar e, principalmente, que nível de acoplamento os microsserviços devem ter. Dependendo do nível de acoplamento, quando ocorrer uma falha, o impacto dessa falha no sistema poderá variar significativamente.

# Princípios

Segundo o blog Medium o comportamento e os padrões de uma arquitetura microservice e seis princípios abaixo, também defendidos por Rag Dhiman[8,9].

1. Alta Coesão

Um dos princípios da arquitetura de microsserviços é a alta coesão, o serviço deve ter um único foco. Ou seja, ter uma única responsabilidade do domínio da aplicação. Este princípio é útil para controlar o tamanho e impedir que o microsserviço se torne um serviço monolítico.

2. Autônomos

Um microserviço deve ser autônomo, ou seja, não deve depender de outros serviços que interajam com ele. Isto implica na mudança de um microserviço dentro de uma aplicação. Ele não deve forçar que outros microsserviços necessitem mudar. O ponto importante desse princípio reflete que cada microserviço deve ter seu próprio banco de dados ou outro serviço de armazenamento.

3. Resiliência

Não importa a velocidade e os custos das soluções, é importante construir sistemas que reajam a falhas inesperadas. Ser capaz de validar os dados recebidos (mesmo que estes estejam corrompidos) e tratar a perda ou falha na comunicação com outro serviço da cadeia, sem quebrar o fluxo da aplicação.

4. Observável

Poder acompanhar o status do sistema e conseguir observar o que está acontecendo em tempo real. Esse tipo de monitoramento precisa ser centralizado para facilitar a busca de informações sobre o status atual do sistema. Como microsserviços é uma arquitetura distribuída, a ideia de centralizar o monitoramento, principalmente os logs, facilita verificação do ciclo completo de toda mensageria trocada. Desde a primeira iteração do usuário até a solução entregue pela aplicação.

5. Automatização

Com a divisão de uma aplicação entre diversos mini blocos há uma necessidade maior de automatizar algumas tarefas para manter este tipo de arquitetura. Como integração contínua e entrega contínua. Esse é um dos aspectos que fazem esse modelo ser abraçado por defensores da cultura DevOps. Pois esta é a ideia principal que move essa cultura.

6. Centrado no domínio do negócio

Um microserviço deve estar focado no domínio do negócio. Assim sendo, deve ser uma função do negócio. Quem conhece o padrão de desenvolvimento DDD sabe que o domínio é o coração de uma aplicação. O conceito base que alicerça este pensamento é o que no DDD chamamos de Bounded Context (ou contextos delimitados). Os contextos delimitados servem para refatorar um grande domínio em pequenos conjuntos de domínios que unidos representam o modelo de negócio de uma aplicação. E é exatamente essa característica um dos pontos fundamentais no modelo de microsserviços.

# Fontes:

Amazon: https://aws.amazon.com/pt/microservices/

RedHat: https://www.redhat.com/pt-br/topics/microservices/what-are-microservices#desafios

Microsoft: https://learn.microsoft.com/pt-br/dotnet/architecture/microservices/architect-microservice-container-applications/distributed-data-management

Medium: https://medium.com/introducao-a-arquitetura-de-microservicos/introdu%C3%A7%C3%A3o-a-microsservi%C3%A7os-25378269e6f9
