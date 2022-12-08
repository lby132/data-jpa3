package study.datajpa3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa3.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
