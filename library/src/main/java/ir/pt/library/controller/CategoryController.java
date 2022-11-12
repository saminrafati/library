package ir.pt.library.controller;

import ir.pt.library.Service.CategoryService;
import ir.pt.library.model.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping(value = "/add")
    public ResponseEntity addCategory(@RequestBody CategoryDTO category) throws Exception {

        return ResponseEntity.ok().body(categoryService.addCategory(category));
    }

    @GetMapping(value = "/search")
    public ResponseEntity getCategory(@RequestBody CategoryDTO category) throws Exception{
        return ResponseEntity.ok(categoryService.getCategory(category));

    }

    @GetMapping(value = "/select")
    public  ResponseEntity  getListOfCategory(@RequestBody CategoryDTO category) throws Exception{

        return ResponseEntity.ok().body(categoryService.getListOfCategory());

    }

    @PutMapping(value = "/update")
    public ResponseEntity updateCategoery(@RequestBody CategoryDTO category) throws Exception{
        return ResponseEntity.ok().body(categoryService.updateCategory(category));

    }

    @DeleteMapping(value = "/delete")

    public ResponseEntity deleteCategory(@RequestBody CategoryDTO category) throws Exception{

        return ResponseEntity.ok().body(categoryService.deleteCategory(category));

    }

}
