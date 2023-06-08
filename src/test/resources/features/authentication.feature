Feature: Authetication

  @sociops @admin @forgotsend
    Scenario: admin forgot send
    Given Admin call api for forgot send with payload
    Then Verify status code 200

  @sociops @admin @forgotverify
  Scenario: admin forgot verify
    Given Admin call api for forgot verify with payload
    Then Verify status code 200

  @sociops @admin @changepassword
  Scenario: admin change password
    Given Admin call api for change password with payload
    Then Verify status code 200
