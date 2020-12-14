$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FF01_ClickOnCarousel.feature");
formatter.feature({
  "line": 2,
  "name": "Click on carousel",
  "description": "",
  "id": "click-on-carousel",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "PWC webstie click on carousel",
  "description": "",
  "id": "click-on-carousel;pwc-webstie-click-on-carousel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am viewing the \u0027Home\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am presented with a carousel displaying 3 featured articles",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicking the \u0027Next\u0027 button on the carousel will load the next 3 featured articles",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Clicking the \u0027Previous\u0027 button on the carousel will load the previous 3 featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "SD01_ClickOnCarouselFF.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 11848193100,
  "status": "passed"
});
formatter.match({
  "location": "SD01_ClickOnCarouselFF.i_am_viewing_the_Home_page()"
});
formatter.result({
  "duration": 151268400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 42
    }
  ],
  "location": "SD01_ClickOnCarouselFF.i_am_presented_with_a_carousel_displaying_featured_articles(int)"
});
formatter.result({
  "duration": 125631800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 62
    }
  ],
  "location": "SD01_ClickOnCarouselFF.clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles(int)"
});
formatter.result({
  "duration": 101269700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 70
    }
  ],
  "location": "SD01_ClickOnCarouselFF.clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles(int)"
});
formatter.result({
  "duration": 123451400,
  "status": "passed"
});
formatter.uri("FF02_ContactUsVerify.feature");
formatter.feature({
  "line": 2,
  "name": "Contact Us",
  "description": "",
  "id": "contact-us",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Contact Us page",
  "description": "",
  "id": "contact-us;verify-contact-us-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select \u0027Contact us\u0027 from the hamburger menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am taken to the \u0027Contact us\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I am presented with the below options for contacts",
  "keyword": "And "
});
formatter.match({
  "location": "SD01_ClickOnCarouselFF.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 9495603600,
  "status": "passed"
});
formatter.match({
  "location": "SD02_ContactUSVerify.i_select_Contact_us_from_the_hamburger_menu()"
});
formatter.result({
  "duration": 93956700,
  "status": "passed"
});
formatter.match({
  "location": "SD02_ContactUSVerify.i_am_taken_to_the_Contact_us_page()"
});
formatter.result({
  "duration": 970611700,
  "status": "passed"
});
formatter.match({
  "location": "SD02_ContactUSVerify.i_am_presented_with_the_below_options_for_contacts()"
});
formatter.result({
  "duration": 203099100,
  "status": "passed"
});
formatter.uri("FF03_SearchFunctionality.feature");
formatter.feature({
  "line": 2,
  "name": "Search Functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search Functionality Verify",
  "description": "",
  "id": "search-functionality;search-functionality-verify",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestRun"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the \u0027Magnifying glass\u0027 icon to perform a search",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter the text \u0027Single page applications\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I submit the search",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I am presented with at least 1 search result",
  "keyword": "And "
});
formatter.match({
  "location": "SD01_ClickOnCarouselFF.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 9213889800,
  "status": "passed"
});
formatter.match({
  "location": "SD03_SearchFunctionality.i_click_on_the_Magnifying_glass_icon_to_perform_a_search()"
});
formatter.result({
  "duration": 202703200,
  "status": "passed"
});
formatter.match({
  "location": "SD03_SearchFunctionality.i_enter_the_text_Single_page_applications()"
});
formatter.result({
  "duration": 253995000,
  "status": "passed"
});
formatter.match({
  "location": "SD03_SearchFunctionality.i_submit_the_search()"
});
formatter.result({
  "duration": 1699501300,
  "status": "passed"
});
formatter.match({
  "location": "SD03_SearchFunctionality.i_am_taken_to_the_search_results_page()"
});
formatter.result({
  "duration": 53283600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "SD03_SearchFunctionality.i_am_presented_with_at_least_search_result(int)"
});
formatter.result({
  "duration": 23220000,
  "status": "passed"
});
});