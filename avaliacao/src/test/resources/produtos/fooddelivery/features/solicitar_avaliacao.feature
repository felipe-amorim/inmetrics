Feature:
  Story User: Cadastro de novos usuários
  Como futuro cliente do app ifood
  Quero poder cadastrar meus dados no aplicativo
  De modo que possa usufruir do acesso o mesmo para efetuar compra de
  alimentos

  @Cadastro @Intro
  Scenario: Cadastro de novos usuários passando pela introducao
    Given O usuario acessa o aplicativo fooddelivery
    And O usuario passa pela introducao
    When O usuario realiza um cadastro
    Then O usuario confirma o login
    And O usuario encerra o aplicativo


  @Cadastro @SkipIntro
  Scenario: Cadastro de novos usuários pulando a introducao
    Given O usuario acessa o aplicativo fooddelivery
    And O usuario pula a introducao
    When O usuario realiza um cadastro
    Then O usuario confirma o login
    And O usuario encerra o aplicativo



