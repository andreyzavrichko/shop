package com.example.shop.api.spec;

import com.example.shop.api.TestBaseApi;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;

import static com.example.shop.api.helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.http.ContentType.JSON;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.Matchers.lessThanOrEqualTo;


public class Specifications extends TestBaseApi {

    public static RequestSpecification requestSpec(String url) {
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(JSON)
                .addFilter(withCustomTemplates()) //---> Добавление красивого шаблона для отчетов
                .build();
    }

    public static ResponseSpecification responseSpecOK200() {
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)//---> Уровень логирования
                .expectContentType(JSON)//---> Ожидаемый Content Type
                .expectStatusCode(HttpStatus.SC_OK)//---> Ожидаемый Status Code
                .expectResponseTime(lessThanOrEqualTo(3L), SECONDS)//---> Ожидаемое время ответа максимум 3 секунды
                .build();
    }

    public static ResponseSpecification responseSpecOK200WithoutJson() {
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)//---> Уровень логирования
                .expectStatusCode(HttpStatus.SC_OK)//---> Ожидаемый Status Code
                .expectResponseTime(lessThanOrEqualTo(3L), SECONDS)//---> Ожидаемое время ответа максимум 3 секунды
                .build();
    }

    public static ResponseSpecification responseSpecOK204() {
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)//---> Уровень логирования
                .expectStatusCode(HttpStatus.SC_NO_CONTENT)//---> Ожидаемый Status Code
                .expectResponseTime(lessThanOrEqualTo(3L), SECONDS)//---> Ожидаемое время ответа максимум 3 секунды
                .build();
    }


    public static void installRequestSpecification(RequestSpecification requestSpec) {
        RestAssured.requestSpecification = requestSpec;
    }

    public static void installResponseSpecification(ResponseSpecification responseSpec) {
        RestAssured.responseSpecification = responseSpec;
    }


}
