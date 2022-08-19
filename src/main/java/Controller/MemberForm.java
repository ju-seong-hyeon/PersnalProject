package Controller;

import javax.validation.constraints.NotEmpty;

public class MemberForm {
    @NotEmpty(message = "회원 아이디는 필수입니다.")
    private String MemberId;
    @NotEmpty(message = "회원 비밀번호는 필수입니다.")
    private String Memberpw;
    @NotEmpty(message = "회원 이름은 필수입니다.")
    private String MemberName;

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMemberpw() {
        return Memberpw;
    }

    public void setMemberpw(String memberpw) {
        Memberpw = memberpw;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }
}
