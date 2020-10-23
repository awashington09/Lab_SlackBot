package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

public class Quotes {


    private String author;
    private String quote;

    public  Quotes(JSONObject json) {
        // TODO: parse a user from the incoming json
        if (json.get("author") != null) {
            this.author = (String) json.get("author");
        }
        if (json.get("quote") != null) {
            this.quote = (String) json.get("quote");
        }
    }
        public String getAuthor () {
            return author;
        }

        public String getQuote () {
            return quote;
        }


    }

