package ir.pt.library.Repo;

import ir.pt.library.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Integer> {
}
