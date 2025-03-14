package mission02.service;

import java.util.List;
import java.util.Objects;
import mission02.domain.Member;
import mission02.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired // 생성자가 한개 있으면 생략 가능
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> getMembers() {
        return memberRepository.getMembers();
    }

    @Override
    public Member getMemberById(final Long id) {
        List<Member> members = memberRepository.getMembers();
        return members.stream()
                .filter(m -> Objects.equals(m.id(), id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void addMember(final String name, final int age) {
        memberRepository.join(name, age);
    }
}
