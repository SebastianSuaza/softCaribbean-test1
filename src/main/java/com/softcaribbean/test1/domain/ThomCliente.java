package com.softcaribbean.test1.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;;

@Entity
@Table(name = "thom_cliente")
public class ThomCliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nmcliente")
	private Long codigo;

	@Column(name = "cdcliente", length = 15)
	private String cliente;

	@Column(name = "dsnombre", length = 120)
	private String nombre;

	@Column(name = "dsdireccion", length = 120)
	private String direccion;

	@Column(name = "dsemail", length = 120)
	private String email;

	@Column(name = "feregistro", columnDefinition = "timestamp")
	private Timestamp fechaRegistro;

	@Column(name = "febaja", columnDefinition = "timestamp")
	private Timestamp fechaBaja;

	@Column(name = "cdusuario", length = 120)
	private String usuario;

	@Column(name = "snactivo", length = 1)
	private String activo;

	@Column(name = "cdtelefono", length = 60)
	private String telefono;

	@Column(name = "dscontacto", length = 120)
	private String contacto;

	@Column(name = "dslogo", length = 50)
	private String logo;

	public ThomCliente() {

	}

	public ThomCliente(Long codigo, String cliente, String nombre, String direccion, String email,
			Timestamp fechaRegistro, Timestamp fechaBaja, String usuario, String activo, String telefono,
			String contacto, String logo) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.fechaRegistro = fechaRegistro;
		this.fechaBaja = fechaBaja;
		this.usuario = usuario;
		this.activo = activo;
		this.telefono = telefono;
		this.contacto = contacto;
		this.logo = logo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Timestamp getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activo == null) ? 0 : activo.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fechaBaja == null) ? 0 : fechaBaja.hashCode());
		result = prime * result + ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ThomCliente)) {
			return false;
		}
		ThomCliente other = (ThomCliente) obj;
		if (activo == null) {
			if (other.activo != null) {
				return false;
			}
		} else if (!activo.equals(other.activo)) {
			return false;
		}
		if (cliente == null) {
			if (other.cliente != null) {
				return false;
			}
		} else if (!cliente.equals(other.cliente)) {
			return false;
		}
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (contacto == null) {
			if (other.contacto != null) {
				return false;
			}
		} else if (!contacto.equals(other.contacto)) {
			return false;
		}
		if (direccion == null) {
			if (other.direccion != null) {
				return false;
			}
		} else if (!direccion.equals(other.direccion)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (fechaBaja == null) {
			if (other.fechaBaja != null) {
				return false;
			}
		} else if (!fechaBaja.equals(other.fechaBaja)) {
			return false;
		}
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null) {
				return false;
			}
		} else if (!fechaRegistro.equals(other.fechaRegistro)) {
			return false;
		}
		if (logo == null) {
			if (other.logo != null) {
				return false;
			}
		} else if (!logo.equals(other.logo)) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		if (telefono == null) {
			if (other.telefono != null) {
				return false;
			}
		} else if (!telefono.equals(other.telefono)) {
			return false;
		}
		if (usuario == null) {
			if (other.usuario != null) {
				return false;
			}
		} else if (!usuario.equals(other.usuario)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ThomCliente [codigo=" + codigo + ", cliente=" + cliente + ", nombre=" + nombre + ", direccion="
				+ direccion + ", email=" + email + ", fechaRegistro=" + fechaRegistro + ", fechaBaja=" + fechaBaja
				+ ", usuario=" + usuario + ", activo=" + activo + ", telefono=" + telefono + ", contacto=" + contacto
				+ ", logo=" + logo + "]";
	}

}
