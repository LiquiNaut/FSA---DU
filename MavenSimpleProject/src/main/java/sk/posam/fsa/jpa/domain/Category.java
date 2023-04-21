package sk.posam.fsa.jpa.domain;
import java.util.List;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "category", schema = "public")
@Access(AccessType.FIELD)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    private String name;

    @Column(name = "last_update")
    private Date lastUpdated;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FilmCategory> filmCategories;


}