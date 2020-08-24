package net.khoroshev.sbs.repository;

import net.khoroshev.sbs.domain.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {

        @Query(value = "SELECT * " +
                "FROM DICTIONARY " +
                "WHERE THENAME = :THENAME ", nativeQuery = true)
        List<Dictionary> findByName(@Param("THENAME") String name);

        @Modifying
        @Transactional
        @Query(value = "insert into DICTIONARY (THENAME, RHYMP) values (:name, :rhymp)", nativeQuery = true)
        void addNewUserAndRhymp(@Param("name") String name, @Param("rhymp") String rhymp);

}
