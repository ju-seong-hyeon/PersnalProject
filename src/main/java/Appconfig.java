import Member.DBMemberRepository;
import Member.MemberRepository;
import Member.MemberService;
import Member.MemberServiceImpl;

public class Appconfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    public MemberRepository memberRepository(){
        return new DBMemberRepository();
    }
}