package br.com.springsecurity.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
	//A entidade Role define qual ou quais as permissões que o usuário possui...
	
	private static final long serialVersionUID = 7207094919265145768L;

	private Long id;
	private String description;

	@Id
	@Column(name = "role_id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "role_description", unique = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@Transient
	public String getAuthority() {
		return description;
	}

}
