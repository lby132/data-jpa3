package study.datajpa3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa3.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
