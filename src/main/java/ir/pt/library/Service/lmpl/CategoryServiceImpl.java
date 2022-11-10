package ir.pt.library.Service.lmpl;

import ir.pt.library.Repo.CategoryRepo;
import ir.pt.library.Service.CategoryService;
import ir.pt.library.entity.Category;
import ir.pt.library.model.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    List<CategoryDTO> categoryList=new ArrayList<>();
    @Autowired
    private CategoryRepo categoryRepo;


    @Override
    public CategoryDTO addCategory(CategoryDTO category) {
       Category entityCategory= new Category( category.getName());
       categoryRepo.save(entityCategory);
       CategoryDTO categoryDTO = new CategoryDTO(entityCategory.getId(), entityCategory.getName());
        return categoryDTO;
    }

    @Override
    public CategoryDTO getCategory(CategoryDTO category) {
        category.setName("A");

        return category;
    }

    @Override
    public List<CategoryDTO> getListOfCategory() {
        List<CategoryDTO> categoryList = new ArrayList<>();
        CategoryDTO category = new CategoryDTO();
        for (int i = 0; i < categoryList.size(); i++) {
            category.setId(1);
            category.setName("history");
            categoryList.add(category);
        }
        return categoryList;
    }

    @Override
    public Boolean updateCategory(CategoryDTO category) {
        category.setId(category.getId()+10);
        return true;
    }

    @Override
    public Boolean deleteCategory(CategoryDTO category) {
        categoryList.remove(category);
        return true;
    }
}
