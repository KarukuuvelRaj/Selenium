Feature: Delete a Lead for Leaftap Application

Scenario: TC02 Positive Flow for Delete Lead feature
Given Open the Browser
And Maximise the Browser
And Set the Timeout
And Enter the URL
And Enter the Username as DemoSalesManager
And Enter the Password as crmsfa
When Click on the Login Button
Then Verify Home Page is displayed
When Click on the CRM/SFA link
And Click on the Leads link
And Select the Lead to Delete
And Click on the Delete Button
Then Verify MyLeads page is displayed
And Close the Browser