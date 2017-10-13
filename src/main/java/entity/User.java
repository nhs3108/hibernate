package entity;


import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "\"user\"")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class User implements java.io.Serializable {
    private static final long serialVersionUID = -3885948600652210064L;

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id", unique = true, nullable = false)
    private String userId;

    @Column(name = "user_name", length = 64)
    private String userName;

    @Column(name = "email", length = 256)
    private String email;

    @Column(name = "infos")
    private String infos;

    public User() {
    }

    public User(String userName, String email, String infos) {
        this.userName = userName;
        this.email = email;
        this.infos = infos;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }
}
