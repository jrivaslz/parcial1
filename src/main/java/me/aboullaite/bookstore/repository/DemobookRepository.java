package me.aboullaite.bookstore.repository;

import me.aboullaite.bookstore.model.Demobook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemobookRepository
        extends CrudRepository<Demobook, String> {

}