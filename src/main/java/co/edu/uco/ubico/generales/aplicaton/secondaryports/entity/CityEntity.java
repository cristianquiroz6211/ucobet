package co.edu.uco.ubico.generales.aplicaton.secondaryports.entity;

import co.edu.uco.ubico.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "city")
public final class CityEntity {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "State")
    private static StateEntity state;

    public CityEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setState(StateEntity.create());
    }

    public  CityEntity(final UUID id, final String name, final StateEntity state) {
        setId(id);
        setName(name);
        setState(state);
    }
    static final CountryEntity create() {
        return new CountryEntity();
    }

    public static  final CountryEntity create(final UUID id, final String name, final StateEntity state) {
        return new CountryEntity(id, name, state);
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
        this.state = ObjectHelper.getDefault(state, StateEntity.create());
    }



}
