package Member;

import java.util.List;

public interface MemberService {
    void save(Member member);
    Member findMemberbyId(String memberId);
    List<Member> findMembersAll();
}
