package net.javaguides.sms.entity;

import javax.persistence.Column;
import org.hibernate.validator.constraints.Email;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@SuppressWarnings("deprecation")
@Entity
@Table(name="students")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty
    @Column(name = "first_name",nullable = false)
    private String firstName;
    
    @NotEmpty
    @Column(name = "last_name")
    private String lastName;
    
    @NotEmpty
    @javax.validation.constraints.Email
    @Column(name="email")
    private String email;
    
    public Student()
    {
        
    }
    
    public Student(Long id, String firstName, String lastName, String email)
    {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public Student( String firstName, String lastName, String email)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }


}
