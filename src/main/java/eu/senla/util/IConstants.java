package eu.senla.util;

import java.time.LocalDate;
import java.time.Month;

public final class IConstants {
    //data for login page
    public static String URL ="https://opensource-demo.orangehrmlive.com/";
    public static String URL_PAGE ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    public static String LOGIN_ADMIN = "Admin";
    public static String PASSWORD_ADMIN ="admin123";
    public static String LOGIN_UNREGISTERED = "Username";
    public static String PASSWORD_UNREGISTERED = "12345";

    //data for page add new user
    public static String EMPLOYEE_NAME = "Melan Peiris";
    public static String NONEXISTENT_EMPLOYEE_NAME = "Georgia Green";
    public static String USERNAME = "Angelinas";
    public static String USER_PASSWORD ="Ang12345";

    //data for page add new job
    public static String JOB_TITLE = "AQA engineer";
    public static String DESCRIPTION = "software testing";
    public static String LINK_SPECIFICATION="\\src\\main\\resources\\img\\maxresdefault.jpg";
    public static String NOTE = "Same text";

    //data for page add new candidate
    public static String FIRST_NAME = "Rich";
    public static String MIDDLE_NAME = "Richi";
    public static String LAST_NAME = "Smith";
    public static String EMAIL = "123654@yandex.ru";
    public static String CONTACT = "+123-45-6789123";
    public static String LINK_RESUME ="\\src\\main\\resources\\file\\file.txt";
    public static String KEY_WORD = "same text";
    public static String COMMENT = "same text";
    public static String DATE = "2021-08-29";

    //data for add assign leave page
    //LocalDate date = LocalDate.now();
    public static String FROM_DATA = String.valueOf(LocalDate.now());
    public static String TO_DATA = String.valueOf(LocalDate.of(2021, 9,30));

}
