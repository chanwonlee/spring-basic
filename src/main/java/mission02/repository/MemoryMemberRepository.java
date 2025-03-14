package mission02.repository;

import java.util.ArrayList;
import java.util.List;
import mission02.domain.Member;

public class MemoryMemberRepository implements MemberRepository {
    private final List<Member> members;
    private Long SEQUENCE = 0L;

    public MemoryMemberRepository() {
        this.members = new ArrayList<>();
        members.add(new Member(1L, "memberA", 20));
        members.add(new Member(2L, "memberB", 25));
        members.add(new Member(3L, "memberC", 30));
        SEQUENCE = SEQUENCE + 3;
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }

    @Override
    public void join(String name, int age) {
        members.add(new Member(++SEQUENCE, name, age));
    }
}
