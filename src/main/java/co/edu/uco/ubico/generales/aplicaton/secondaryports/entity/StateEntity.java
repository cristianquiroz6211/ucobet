package co.edu.uco.ubico.generales.aplicaton.secondaryports.entity;

import co.edu.uco.ubico.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "state")
public final class  StateEntity {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "country")
    private CountryEntity country;

    StateEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setCountry(CountryEntity.create());

    }
    public StateEntity(final UUID id, final String name, final CountryEntity country) {
        setId(id);
        setName(name);
        setCountry(country);
    }
    public static final StateEntity create() {
        return new StateEntity();
    }

    public final StateEntity create(final UUID id, final String name, final CountryEntity country) {
        return new StateEntity(id, name, country);
    }

    public UUID getId() {
        return id;
    }

    public void setId( final UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public String getName() {
        return name;
    }

    public void setName( final String name) {
        this.name = TextHelper.getDefault(name);
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(final CountryEntity country) {
        this.country = ObjectHelper.getDefault(country, CountryEntity.create());
    }
}
