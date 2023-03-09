package singleton;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User extends ObjectWithID
{
    @Column(name = "Login")
    public String Login;

    @Column(name = "Password")
    public String Password;

    @Column(name = "EMail")
    public String EMail;

    @Column(name = "IsAdmin")
    public boolean IsAdmin;

    @Column(name = "Height")
    public double Height;
}