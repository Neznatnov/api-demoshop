package com.neznatnov.specs;

import io.restassured.specification.RequestSpecification;

import static com.neznatnov.helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;

public class RequestSpec {

    public static RequestSpecification requestSpec = with()
            .log().uri()
            .log().body()
            .filter(withCustomTemplates());
}