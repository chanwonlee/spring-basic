package mission02.repository;

import java.util.List;
import mission02.domain.Member;

// 예시용 class 구현하지는 않음
public class MysqlMemberRepository implements MemberRepository {

    @Override
    public List<Member> getMembers() {
        return List.of();
    }

    @Override
    public void join(String name, int age) {

    }
}
