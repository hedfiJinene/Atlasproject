@tag
Feature: Ajout d'un role
 je veux ajouter un role en tant qu'admin
Background:
    Given Saisir le lien "https://atlas.digitrends.pro/login"
    When Saisir E-mail "nour@gmail.com"
    And Saisir le mot de passe "123456789"
    And Cliquer sur le bouton login
    And Cliquer sur le bouton Dashboard 
@tag1
  Scenario: Ajouter un role en tant qu'admin
  Given Cliquer sur le menu Roles
  And  Cliquer sur le bouton add role 
  When Remplir le nom de role 
  And Choisir le permission 
  Then Cliquer sur le menu save
  