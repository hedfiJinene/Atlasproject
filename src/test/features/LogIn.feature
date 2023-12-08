@tag
Feature: Connexion Admin Valide
  je veux connecter en tant que Admin Dashboard web

 @tag1
  Scenario: Connexion Valide
    Given Saisir le lien "https://atlas.digitrends.pro/login"
    When Saisir E-mail "nour@gmail.com"
    And Saisir le mot de passe "123456789"
    And Cliquer sur le bouton login
    And Cliquer sur le bouton Dashboard 
    Then Vérifier l'url obtenue "https://atlas.digitrends.pro/dashboard"
