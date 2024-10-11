package co.edu.uco.ubico.generales.aplicaton.secondaryports.entity;

import co.edu.uco.ubico.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;
@Entity
@Table(name = "country")
public final class CountryEntity {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "state")
    private StateEntity state;

    public CountryEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public CountryEntity(final UUID id, final String name, final StateEntity state) {
        setId(id);
        setName(name);

    }



    static public CountryEntity create() {
        return new CountryEntity();
    }

    static public CountryEntity create(final UUID id, final String name) {
    return new CountryEntity(id, name);
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

    public void setName(final String name) {
        this.name = TextHelper.getDefault(name);

    }


    public StateEntity getState() {
        return state;
    }

    public void setState(final StateEntity state) {
        this.state = state;
    }
}


