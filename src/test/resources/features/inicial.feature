#language:pt

@tag
Funcionalidade: Title of your feature
  I want to use this template for my feature file


  @tag1
  Cenario: Title of your scenario
    Dado I want to write a step with precondition
    E some other precondition
    Quando I complete action
    E some other action
    E yet another action
    Entao I validate the outcomes
    E check more outcomes

  @tag2
  Esquema do Cenario: Title of your scenario outline
    Dado I want to write a step with <name>
    Quando I check for the <value> in step
    Entao I verify the <status> in step

    Exemplos: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
