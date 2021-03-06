package persistence.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {
	
	@Id
	@SequenceGenerator(name="SEQ_USUARIO", initialValue=1,
	allocationSize=1, sequenceName="seq_usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
	@Column(name="id_Usuario")
	private int id;
	 
	private String nome;
	private String email;
	private String login;
	private String senha;
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
