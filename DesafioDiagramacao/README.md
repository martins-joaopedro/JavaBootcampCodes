## STBC - Santander Bootcamp 2024 ☕♨️.

### Sobre o Repositório:
Desafio de Código sobre Diagramação e conceitos de Programação Orientada a Objetos, como Classes, Interfaces e suas particularidades.

```mermaid

classDiagram

class AparelhoTelefonico {
    <<interface>>

    +ligar()
    +atender()
    +iniciarCorreioVoz()
}

class ReprodutorMusical {
    <<interface>>

    +tocar(String musica)
    +pausar(String musica)
    +selecionarMusica(String musica)
}

class Navegador {
    <<interface>>

    +exibirPagina()
    +adicionarNovaAba()
    +atualizarPagina()
}

class Iphone {
    -String linha
}

Navegador <|-- Iphone
ReprodutorMusical <|-- Iphone
AparelhoTelefonico <|-- Iphone

```