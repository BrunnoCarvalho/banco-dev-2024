package me.dio.banco_dev_2024.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/* A anotação @MappedSuperclass em JPA (Java Persistence API) é usada para indicar
que uma classe é uma superclasse que não será mapeada diretamente para uma tabela no banco de dados,
mas cujos atributos podem ser herdados por classes de entidade que serão mapeadas para tabelas */
@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
