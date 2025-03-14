package mission02.service;

import java.util.List;
import mission02.domain.Member;

public interface MemberService {

    List<Member> getMembers();

    Member getMemberById(Long id);

    void addMember(String name, int age);
}
