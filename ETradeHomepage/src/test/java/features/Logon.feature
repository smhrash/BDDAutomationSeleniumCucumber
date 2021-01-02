@logonPage

Feature: Check Logon functionality

  Scenario Outline:
    Given user is in homepage
    When User clicks on logon
    Then user enters username "<userName>"
    And user enters password "<password>"
    And user see the page title

    Examples:
      | userName  | password    |
      | Skmhra    | Tim12357#   |
      | Skmhrsga  | lkTim12357# |
      | Skjdmhra  | ouTim12357# |
      | Sklhmhra  | ytTim12357# |
      | Skkhtmhra | Tuim172357# |