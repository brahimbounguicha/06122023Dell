#Author: Porservice
Feature: Dell Home Page

  Scenario: Selectionner un produit
    Given admin is on homepage
    When admin mousehover on menu "Ordinateurs et accessoires" and submenu "Ordinateurs portables"
    And admin click on product "Ordinateurs portables XPS"
    Then admin is directed to the page "Ordinateurs portables XPS"
