package com.nal.java8;

/**
 * Created by nishant on 26/12/19.
 */
public class RAObjectValidationTest {

//    Predicate<Integer> con1 = i -> i==0;
//    Predicate<Integer> con2 = i -> i==1;
//    Predicate<Integer> con3 = i -> i==2;
//
//    public void testOr() {
//        List<Integer> asdas = IntStream.range(1, 10).boxed().filter(con1.or(con2).or(con3)).collect(toList());
//        System.out.println("asdas = " + asdas);
//    }
//
//    public void validationUsingGSONJavaObject() {
//        //Path Validation
//        RestAssured.baseURI = "https://reqres.in";
//        RestAssured.basePath = "/api";
//        RequestSpecification requestSpecification = RestAssured.given().contentType(ContentType.JSON);
//        requestSpecification = requestSpecification.queryParam("page", "1"); //for get calls
////        requestSpecification = requestSpecification.pathParam("page", "1"); //for get & post calls
////        requestSpecification = requestSpecification.formParam("page", "1"); //for post calls
//        requestSpecification.log().all();
//        Response response = requestSpecification.get("/users");
//
//        Assert.assertEquals(response.statusCode(), HttpStatus.SC_OK);
//        response.then().log().all();
//
////        Users users = response.as(Users.class, ObjectMapperType.JACKSON_2);
//        GSONUsers users = response.as(GSONUsers.class, ObjectMapperType.GSON);
//
//        long responseTime = response.getTimeIn(TimeUnit.MILLISECONDS);
//        System.out.println("Response Time: " + responseTime);
//        Assert.assertTrue(responseTime < 5000, "Response time is not within the limit");
//        //Hard Assert
//        System.out.println((int)users.getTotalPages());
//
//        System.out.println(users.getData().stream().filter(datum -> datum.getId() == 1).findAny().get().getEmail());
//        System.out.println(users.getData().stream().filter(datum -> datum.getId() > 5).map(datum -> datum.getFirstName()).findAny().get());
//        System.out.println(users.getData().stream().filter(datum -> datum.getId() > 2 && datum.getLastName().equals("Morris")).map(datum -> datum.getFirstName()).findAny().get());
//        System.out.println(users.getData().get(0).getFirstName());
//        System.out.println(users.getData().get(users.getData().size() - 1).getFirstName());
//        System.out.println(users.getData().get(users.getData().size() - 2).getFirstName());
//
//        System.out.println(users.getData().stream().map(s -> s.getEmail()).collect(toList()));
//        System.out.println(users.getData().stream().filter(s -> s.getId() == 1 || s.getId() == 3).map(s -> s.getFirstName()).collect(toList()));
//        System.out.println(users.getData().stream().filter(s -> s.getId() <= 2).map(s -> s.getFirstName()).collect(toList()));
//        System.out.println(users.getData().stream().filter(s -> s.getId() > 1 && s.getId() <= 4).map(s -> s.getFirstName()).collect(toList()));
//        System.out.println(users.getData().stream().filter(s -> s.getFirstName().equals("Janet") || s.getFirstName().equals("Eve")).map(s -> s.getEmail()).collect(toList()));
//
//        String name = "Janet"; //use of param
//        System.out.println(users.getData().stream().filter(s -> s.getFirstName().equals(name)).map(s -> s.getEmail()).collect(toList()));
//        System.out.println(users.getData().size());
//
//        System.out.println(users.getData().stream().max(Comparator.comparing(GSONDatum::getId)).map(s -> s.getFirstName()).get());
//        System.out.println(users.getData().stream().min(Comparator.comparing(GSONDatum::getId)).map(s -> s.getFirstName()).get());
//        System.out.println(users.getData().stream().filter(s -> s.getLastName().equals("Wong")).map(s -> s.getEmail()).findAny().get());
//        System.out.println(users.getData().stream().filter(s -> s.getLastName().equals("Wong") || s.getLastName().equals("Weaver")).map(s -> s.getEmail()).collect(Collectors.toList()));
//        System.out.println(users.getData().stream().filter(s -> s.getLastName().equals("Wong") || s.getLastName().equals("Weaver"))
//                                                    .filter(s -> s.getFirstName().equals("Janet")).map(s -> s.getEmail()).collect(Collectors.toList()));
//        System.out.println(users.getData().stream().filter(s -> s.getId() == 1).findFirst().get().getLastName().length());
//        System.out.println(users.getData().stream().mapToInt(s -> s.getId()).sum());
////        System.out.println(users.getData().stream().map(s -> s.getId()).reduce(0, Integer::sum));
////        System.out.println(users.getData().stream().map(s -> s.getId()).reduce(0, (a, b) -> a + b));
////        System.out.println(users.getData().stream().map(s -> s.getId()).collect(Collectors.summingInt(Integer::intValue)));
//        System.out.println(users.getData().stream().mapToInt(s -> s.getLastName().length()).sum());
//
//        System.out.println("Done");
//
//
//        Assert.assertEquals((int)users.getPerPage(), 6);
//        Assert.assertEquals((int)users.getTotal(), 12);
//
////        Soft Assert
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals((int)users.getTotalPages(), 2, "total_pages is not equal");
//        softAssert.assertEquals((int)users.getPerPage(), 6, "per_page is not equal");
//        softAssert.assertEquals((int)users.getTotal(), 12, "total is not equal");
//        softAssert.assertAll();
//        System.out.println("Done");
//    }
//
//    @Test
//    public void validationUsingJacksonJavaObject() {
//        //Path Validation
//        RestAssured.baseURI = "https://reqres.in";
//        RestAssured.basePath = "/api";
//        RequestSpecification requestSpecification = RestAssured.given().contentType(ContentType.JSON);
//        requestSpecification = requestSpecification.queryParam("page", "1");
//        requestSpecification.log().all();
//        Response response = requestSpecification.get("/users");
//
//        Users users = response.as(Users.class, ObjectMapperType.JACKSON_2);
//
//        Assert.assertEquals((int)users.getTotalPages(), 2);
//        Assert.assertEquals((int)users.getPerPage(), 6);
//        Assert.assertEquals((int)users.getTotal(), 12);
//
//    }
}
