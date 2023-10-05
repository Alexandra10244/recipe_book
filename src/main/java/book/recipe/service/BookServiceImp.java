package book.recipe.service;

import book.recipe.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImp implements BookService{

    private List<Book> recipesList = new ArrayList<>();
    @Override
    public Book createRecipe(Book recipe) {
        recipesList.add(recipe);
        System.out.println("New recipe was created");
        return recipe;
    }

    @Override
    public List<Book> getAllRecipes() {
        return recipesList;
    }
}
