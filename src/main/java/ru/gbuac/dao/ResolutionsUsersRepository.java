package ru.gbuac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.gbuac.model.ResolutionsUsers;

@Transactional(readOnly = true)
public interface ResolutionsUsersRepository extends JpaRepository<ResolutionsUsers, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM ResolutionsUsers r WHERE r.id=:id")
    int delete(@Param("id") int id);
}
