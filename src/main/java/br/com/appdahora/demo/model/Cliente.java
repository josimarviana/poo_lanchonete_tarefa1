package br.com.appdahora.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity //indica que a classe que vai virar uma tabela
public class Cliente extends Pessoa{
    @Id //indica que o atributo é chave da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)
// indica que a chave será gerada incrementalmente
// pelo banco de dados (sequence)
    private Long id;
    public String toString(){
        return this.nome;
    }
}
