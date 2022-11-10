package ir.pt.library.Repo;


import ir.pt.library.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Integer> {
}

