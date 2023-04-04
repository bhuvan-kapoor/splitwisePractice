package Pojos;

import org.json.JSONString;

import java.util.List;

public class AddMemberPojo {
    private List<JSONString> addMember;

    public void setAddMember(List addMember) {
        this.addMember = addMember;
    }

    public List<JSONString> getAddMember() {
        return  addMember;
    }
}
