package guru.springfamework.api.v1.model;

/**
 * Created by jt on 9/24/17.
 */
public class CategoryDTO {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
