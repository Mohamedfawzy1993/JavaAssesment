package com.java.assesement;

import com.java.assesement.country.ApiClient;
import com.java.assesement.country.Country;
import com.java.assesement.stringparse.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Country country = ApiClient.getCountryInfo();
        System.out.println(country);
        String txtToParse = "IssueField{id=customfield_10122, name=Sprint, type=null, value=[\"com.atlassian.greenhopper.service.sprint.Sprint@745edae5[id=441,rapidViewId=2,state=ACTIVE,name=Week 39 - 2023,startDate=2023-09-25T00:00:00.000Z,endDate=2023-10-01T23:59:00.000Z,completeDate=<null>,activatedDate=2023-09-24T17:57:06.391 Z,sequence=440,goal=,autoStartStop=false,synced=false]\"]};";
        System.out.println(Parser.parseString(txtToParse));
    }
}
