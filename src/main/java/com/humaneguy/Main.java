package com.humaneguy;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {
        get("/greeting", (req, res) -> "Hello world! from my Spark REST API");
    }
}