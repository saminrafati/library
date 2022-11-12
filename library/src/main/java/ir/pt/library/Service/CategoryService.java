package ir.pt.library.Service;


import ir.pt.library.model.CategoryDTO;

import java.util.List;


public interface CategoryService {

    CategoryDTO addCategory(CategoryDTO category);
    CategoryDTO getCategory(CategoryDTO category);
    List<CategoryDTO> getListOfCategory();
    Boolean updateCategory(CategoryDTO category);
    Boolean deleteCategory(CategoryDTO category);
}
