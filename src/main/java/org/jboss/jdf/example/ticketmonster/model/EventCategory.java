package org.jboss.jdf.example.ticketmonster.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Lookup table containing event categories
 *
 * @author Shane Bryzak
 */
@Entity
public class EventCategory implements Serializable {
    private static final long serialVersionUID = 2125778126462925768L;

    @Id
    @GeneratedValue
    private Long id;

    @NotNull @NotEmpty
    private String description;


    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventCategory that = (EventCategory) o;

        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return description;
    }
}
