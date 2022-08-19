package Member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String MemberId;
    private String MemberName;
    private String MemberPw;
    public Member(){
    }
    public Member(String memberId, String memberName, String memberPw) {
        this.MemberId = memberId;
        this.MemberName = memberName;
        this.MemberPw = memberPw;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMembername() {
        return MemberName;
    }

    public void setMembername(String memberName) {
        MemberName = memberName;
    }

    public String getMemberPw() {
        return MemberPw;
    }

    public void setMemberPw(String memberPw) {
        MemberPw = memberPw;
    }
}
