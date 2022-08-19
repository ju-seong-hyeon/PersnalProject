package Member;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public void save(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
    }
    private void validateDuplicateMember(Member member){
        Member findMembers = memberRepository.findbyid(member.getMemberId());
        if (findMembers != null) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    @Override
    public Member findMemberbyId(String memberId) {
        Member member = new Member();
        member = memberRepository.findbyid(memberId);
        return member;
    }

    @Override
    public List<Member> findMembersAll() {
        List<Member> allMember = new ArrayList<>();
        allMember = memberRepository.findAll();
        return allMember;
    }

}
