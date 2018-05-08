package org.rubin55.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface HumanRepository extends CrudRepository<Human, Long> {

    Optional<Human> findByAlias(String alias);
}
