package com.example.bookprj.Repository;

import com.example.bookprj.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository <Book,Integer> {

}
