package net.khoroshev.sbs.repository;

import net.khoroshev.sbs.domain.Dictionary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface DictionaryRepository extends CrudRepository<Dictionary, Long> {

        @Query(value = "SELECT * " +
                "FROM DICTIONARY " +
                "WHERE THENAME = :THENAME ", nativeQuery = true)
        Dictionary findByName(@Param("THENAME") String name);


}
