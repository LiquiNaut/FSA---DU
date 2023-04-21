package sk.posam.fsa.jpa.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "film", schema = "public")
@Access(AccessType.FIELD)
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Long id;

    private String title;
    private String description;
    @Column(name = "release_year")
    private Integer releaseYear;

    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "rental_duration")
    private Integer rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    private Integer length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    private String rating;

    @Column(name = "last_update")
    private Date lastUpdated;

    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "fulltext")
    private String fulltext;

    @OneToOne(mappedBy = "film", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private FilmCategory filmCategory;

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", languageId=" + languageId +
                ", rentalDuration=" + rentalDuration +
                ", rentalRate=" + rentalRate +
                ", length=" + length +
                ", replacementCost=" + replacementCost +
                ", rating='" + rating + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", specialFeatures='" + specialFeatures + '\'' +
                ", fulltext='" + fulltext + '\'' +
                '}';
    }

}
