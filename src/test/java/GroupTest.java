import Pojos.GroupPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupTest {
    @Test
    public void testGroup() throws Exception {
        RequestSpecification requestSpecification = RestAssured.given();
        GroupPojo groupPojo = new GroupPojo();
        String groupName = "Test Group";
        groupPojo.setGroupName(groupName);
        requestSpecification.body(groupPojo);
        Response response = requestSpecification.post("/group");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(groupPojo.getGroupName(), groupName);
    }

    @Test
    public void testGroup2(){
        Scanner sc=new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        String a = sc.next();
        list.add(a);
        String b = sc.next();
        list.add(b);
        //System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            Assert.assertEquals(list.get(i),"test");
        }

    }

}
