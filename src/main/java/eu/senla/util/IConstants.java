package eu.senla.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

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
    public static String USERNAME = "Angel.MPG";
    public static String USER_PASSWORD ="Ang12345";

    //data for page add new job
    public static String JOB_TITLE = "Same Job";
    public static String DESCRIPTION = "software testing";
    public static String LINK_SPECIFICATION=".\\src\\main\\resources\\img\\maxresdefault.jpg";
    public static String NOTE = "Same text";

    //data for page add new candidate
    public static String FIRST_NAME = "Rich";
    public static String MIDDLE_NAME = "Richi";
    public static String LAST_NAME = "Smith";
    public static String EMAIL = "123654@yandex.ru";
    public static String CONTACT = "+123-45-6789123";
    public static String LINK_RESUME =".\\src\\main\\resources\\file\\file.txt";
    public static String KEY_WORD = "same text";
    public static String COMMENT = "same text";
    public static String DATE = "2021-08-29";

    //data for add assign leave page
    public static String FROM_DATA = String.valueOf(LocalDate.now());
    public static String TO_DATA = String.valueOf(LocalDate.of(2021, 9,30));

    //data for dashboard page
    public static List<String> DATA_TABLE = Arrays.asList("Assign Leave",
            "Leave List","Timesheets",
            "Apply Leave","My Leave","My Timesheet");
    public static List<String> TABLE_LEGEND = Arrays.asList("Not assigned to Subunits",
            "Administration","Client Services", "Engineering","Finance",
            "Human Resources","Sales & Marketing");
    public static List<String>TABLE_PAGE = Arrays.asList("Employee Distribution by Subunit",
            "Legend","Pending Leave Requests");
    //data for Employee List page
    public static String FIRST_NAME_PIM ="Nina";
    public static String LAST_NAME_PIM ="Patel";

}
