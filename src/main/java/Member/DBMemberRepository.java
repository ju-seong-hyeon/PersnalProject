package Member;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DBMemberRepository implements MemberRepository{

    @PersistenceContext
    EntityManager em;

    public String save(Member member){
        em.persist(member);
        return member.getMemberId();
    }

    @Override
    public Member findbyid(String MemberId) {
        return em.find(Member.class, MemberId);
    }

    @Override
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }


}
