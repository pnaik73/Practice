
Feature: CommunityPoll

  Scenario: User should be able to vote in community poll
  
Given Browser should be launched
And navigated to correct URL
When User selects good option
And User clicks on vote button
Then He should be able to vote
 