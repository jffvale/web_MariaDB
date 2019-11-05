package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="mercadoria")      //nome da tabela
public class Mercadoria {
    @Id                         //id como chave primária
    private  long id;
    @Column(name="nome")
    private  String nome; 
    @Column(name="marca")
    private  String marca; 
    @Column(name="un_emb")      //pacote, caixa, garrafa, lata, etc.
    private  String un_emb; 
    @Column(name="qtde_unit")   //quantidade na embalagem unitaria.
    private  double qtde_unit;
    @Column(name="qtde_estoque")
    private  int qtde_estoque;   //quantidade de unidades em estoque. 
    @Column(name="un_medida")
    private  String un_medida; 
    @Column(name="preco_unitario")
    private  double preco_unit; 
    public Mercadoria(){}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getUn_emb() {
        return un_emb;
    }
    public void setUn_emb(String un_emb) {
        this.un_emb = un_emb;
    }
    public double getQtde_unit() {
        return qtde_unit;
    }
    public void setQtde_unit(double qtde_unit) {
        this.qtde_unit = qtde_unit;
    }
    public int getQtde_estoque() {
        return qtde_estoque;
    }
    public void setQtde_estoque(int qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }
    public String getUn_medida() {
        return un_medida;
    }
    public void setUn_medida(String un_medida) {
        this.un_medida = un_medida;
    }
    public double getPreco_unit() {
        return preco_unit;
    }
    public void setPreco_unit(double preco_unit) {
        this.preco_unit = preco_unit;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }  
}

