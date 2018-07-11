Feature: Wishlist
  As a user of Giftrete, I want to be able to add items to my wishlish
  So that I can place order on the items later


  Scenerio: Create wishlist for myself
    Given that I am logged in to giftrete site
    And I click on wishlist
    And select myself
    And fill in the form
    When I click on save
    Then a wishlist should be created for me

  Scenario: Create wishlist for a friend
    Given that I am logged in to giftrete site
    And I click on wishlist
    And select a friend
    And fill in the form
    When I click on save
    Then a wishlist should be created for a friend