package com.yeqifu.bravo1988.baseenhance;

/**
 * @author: yeqifu
 * @date: 2023/2/14 11:51
 */
public class Couple {
    private Integer familyId;
    private String userName;

    public Couple(Integer familyId, String userName) {
        this.familyId = familyId;
        this.userName = userName;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
