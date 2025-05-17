package com.udea.oauthLib.POC.entity;
import java.util.Collection;
import java.util.Collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document
@Data
//@RequiredArgsConstructor
//@NoArgsConstructor
public class User implements UserDetails {
    @Id
    private String id;

    @NonNull
    private String username;

    @NonNull
    private String password;

    public User(){}

    public User(String id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User( String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        // TODO Auto-generated method stub
        this.id = id;

    }

    // Methods required by Spring Security for user details
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }


}
