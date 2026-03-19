package com.example.engg1420.model;

public class SearchFeature {
    private String searchResult;
    public String userInput;

    public SearchFeature(String result, String input) {
        this.searchResult = result;
        this.userInput = input;
    }

    public void compareText() {
        if (userInput.equals(searchResult)) {
            System.out.println("Search Results:"); //Need to implement actual search options and parameters
        } else {
            System.out.println("No search results found. Please re-enter your prompt");
        }
    }

    public String getSearchResult() {
        return this.searchResult;
    }
}