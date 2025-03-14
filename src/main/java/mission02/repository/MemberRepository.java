package mission02.repository;

import java.util.List;
import mission02.domain.Member;

public interface MemberRepository {

    List<Member> getMembers();

    void join(String name, int age);
}
