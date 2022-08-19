package Member;

import java.util.List;

public interface MemberRepository {
    String save(Member member);
    Member findbyid(String MemberId);
    List<Member> findAll();
}
