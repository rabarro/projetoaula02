package com.springsource.petclinic.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;
import com.springsource.petclinic.reference.PetType;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "PET_SEQ", finders = { "findPetsByNameAndWeigth", "findPetsByOwner", "findPetsBySendRemindersAndWeigthLessThan", "findPetsByTypeAndNameLike" })
public class Pet {

    /**
     */
    @NotNull
    private boolean sendReminders;

    /**
     */
    @Size(min = 1)
    private String name;

    /**
     */
    @NotNull
    private float weigth;

    /**
     */
    @ManyToOne
    private Owner owner;

    /**
     */
    @NotNull
    @Enumerated
    private PetType type;
}
