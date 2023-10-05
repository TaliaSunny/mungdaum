package com.company.mungdaum.member;

public class MemberVO {

    private String id;
    private String password;

    // getter, setter
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    // »ý¼ºÀÚ
    public MemberVO() {

    }

    // to String
    @Override
    public String toString() {
        return "MemberVO [id=" + id + ", password=" + password + "]";
    }

} 