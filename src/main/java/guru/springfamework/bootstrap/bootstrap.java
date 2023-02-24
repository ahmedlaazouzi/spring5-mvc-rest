package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrap implements CommandLineRunner {
    CategoryRepository categoryRepository;

    public bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category fruits=new Category();
        fruits.setName("Fruits");
        categoryRepository.saveAndFlush(fruits);

        Category dried=new Category();
        dried.setName("Dried");
        categoryRepository.saveAndFlush(dried);

        Category exotic=new Category();
        exotic.setName("Exotic");
        categoryRepository.save(exotic);

        Category nuts=new Category();
        nuts.setName("Nuts");
        categoryRepository.save(nuts);

        Category fresh=new Category();
        fresh.setName("Fresh");
        categoryRepository.save(fresh);

        System.out.println("Data loaded"+categoryRepository.count());



    }
}
