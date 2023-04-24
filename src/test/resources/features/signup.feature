Feature: Client sign up

  Scenario: client sign up succesfully
    Given Pepito wants to have an account
    When he sends required information to get the account
    Then he should be told that the account was created