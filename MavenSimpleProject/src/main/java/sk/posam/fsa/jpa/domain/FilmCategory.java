package sk.posam.fsa.jpa.domain;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film_category", schema = "public")
@Access(AccessType.FIELD)
public class FilmCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Long filmId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "last_update")
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;


    @OneToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private Film film;


    @Override
    public String toString() {
        return "FilmCategory{" +
                "filmId=" + filmId +
                ", categoryId=" + categoryId +
                ", lastUpdated=" + lastUpdated +
                ", category=" + category +
                '}';
    }
}
