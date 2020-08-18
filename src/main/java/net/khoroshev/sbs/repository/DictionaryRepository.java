package net.khoroshev.sbs.repository;

import net.khoroshev.sbs.domain.Dictionary;
import org.springframework.data.repository.CrudRepository;

public interface DictionaryRepository extends CrudRepository<Long, Dictionary> {
}
