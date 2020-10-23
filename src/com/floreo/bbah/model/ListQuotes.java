package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListQuotes {


    List<Quotes> quotesList;
    public ListQuotes(JSONObject json){
        if (json.get("quoteList") != null) {
            JSONArray membersArray = (JSONArray) json.get("quoteList");
            this.quotesList = new ArrayList<>();
            for (int i = 0; i < membersArray.size(); i++) {
                this.quotesList.add((Quotes) membersArray.get(i));
            }
        }

    }
    public List<Quotes> getQuotesList() {
        return quotesList;
    }
}
