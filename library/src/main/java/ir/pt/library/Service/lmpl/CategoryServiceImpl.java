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
        Category entityCategory= categoryRepo.findById(category.getId()).get();
        return new CategoryDTO(entityCategory.getId(), entityCategory.getName());
    }

    @Override
    public List<CategoryDTO> getListOfCategory() {
        List<Category> categories= (List) categoryRepo.findAll();
        List<CategoryDTO> categoryDTOS= new ArrayList<>();
        for (Category entityCategory : categories){
            categoryDTOS.add(new CategoryDTO(entityCategory.getId(), entityCategory.getName()));
        }
        return categoryDTOS;
    }

    @Override
    public Boolean updateCategory(CategoryDTO category) {

        return true;
    }

    @Override
    public Boolean deleteCategory(CategoryDTO category) {
        categoryRepo.deleteById(category.getId());
        return true;
    }
}
