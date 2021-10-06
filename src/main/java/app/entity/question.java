package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela QUESTION
* @generated
*/
@Entity
@Table(name = "\"QUESTION\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.question")
public class question implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;

    /**
    * @generated
    */
    @Column(name = "alternativa1", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa1;

    /**
    * @generated
    */
    @Column(name = "alternativa2", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa2;

    /**
    * @generated
    */
    @Column(name = "alternativa3", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa3;

    /**
    * @generated
    */
    @Column(name = "alternativa4", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa4;

    /**
    * @generated
    */
    @Column(name = "alternativa5", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa5;

    /**
    * @generated
    */
    @Column(name = "alternativa6", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa6;

    /**
    * @generated
    */
    @Column(name = "alternativa7", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa7;

    /**
    * @generated
    */
    @Column(name = "alternativa8", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa8;

    /**
    * @generated
    */
    @Column(name = "alternativa9", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa9;

    /**
    * @generated
    */
    @Column(name = "alternativa10", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String alternativa10;

    /**
    * @generated
    */
    @Column(name = "resposta", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resposta;

    /**
    * @generated
    */
    @Column(name = "qtdalternativas", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdalternativas;

    /**
    * Construtor
    * @generated
    */
    public question(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public question setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    
    public java.lang.String getDescricao(){
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public question setDescricao(java.lang.String descricao){
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém alternativa1
    * return alternativa1
    * @generated
    */
    
    public java.lang.String getAlternativa1(){
        return this.alternativa1;
    }

    /**
    * Define alternativa1
    * @param alternativa1 alternativa1
    * @generated
    */
    public question setAlternativa1(java.lang.String alternativa1){
        this.alternativa1 = alternativa1;
        return this;
    }
    /**
    * Obtém alternativa2
    * return alternativa2
    * @generated
    */
    
    public java.lang.String getAlternativa2(){
        return this.alternativa2;
    }

    /**
    * Define alternativa2
    * @param alternativa2 alternativa2
    * @generated
    */
    public question setAlternativa2(java.lang.String alternativa2){
        this.alternativa2 = alternativa2;
        return this;
    }
    /**
    * Obtém alternativa3
    * return alternativa3
    * @generated
    */
    
    public java.lang.String getAlternativa3(){
        return this.alternativa3;
    }

    /**
    * Define alternativa3
    * @param alternativa3 alternativa3
    * @generated
    */
    public question setAlternativa3(java.lang.String alternativa3){
        this.alternativa3 = alternativa3;
        return this;
    }
    /**
    * Obtém alternativa4
    * return alternativa4
    * @generated
    */
    
    public java.lang.String getAlternativa4(){
        return this.alternativa4;
    }

    /**
    * Define alternativa4
    * @param alternativa4 alternativa4
    * @generated
    */
    public question setAlternativa4(java.lang.String alternativa4){
        this.alternativa4 = alternativa4;
        return this;
    }
    /**
    * Obtém alternativa5
    * return alternativa5
    * @generated
    */
    
    public java.lang.String getAlternativa5(){
        return this.alternativa5;
    }

    /**
    * Define alternativa5
    * @param alternativa5 alternativa5
    * @generated
    */
    public question setAlternativa5(java.lang.String alternativa5){
        this.alternativa5 = alternativa5;
        return this;
    }
    /**
    * Obtém alternativa6
    * return alternativa6
    * @generated
    */
    
    public java.lang.String getAlternativa6(){
        return this.alternativa6;
    }

    /**
    * Define alternativa6
    * @param alternativa6 alternativa6
    * @generated
    */
    public question setAlternativa6(java.lang.String alternativa6){
        this.alternativa6 = alternativa6;
        return this;
    }
    /**
    * Obtém alternativa7
    * return alternativa7
    * @generated
    */
    
    public java.lang.String getAlternativa7(){
        return this.alternativa7;
    }

    /**
    * Define alternativa7
    * @param alternativa7 alternativa7
    * @generated
    */
    public question setAlternativa7(java.lang.String alternativa7){
        this.alternativa7 = alternativa7;
        return this;
    }
    /**
    * Obtém alternativa8
    * return alternativa8
    * @generated
    */
    
    public java.lang.String getAlternativa8(){
        return this.alternativa8;
    }

    /**
    * Define alternativa8
    * @param alternativa8 alternativa8
    * @generated
    */
    public question setAlternativa8(java.lang.String alternativa8){
        this.alternativa8 = alternativa8;
        return this;
    }
    /**
    * Obtém alternativa9
    * return alternativa9
    * @generated
    */
    
    public java.lang.String getAlternativa9(){
        return this.alternativa9;
    }

    /**
    * Define alternativa9
    * @param alternativa9 alternativa9
    * @generated
    */
    public question setAlternativa9(java.lang.String alternativa9){
        this.alternativa9 = alternativa9;
        return this;
    }
    /**
    * Obtém alternativa10
    * return alternativa10
    * @generated
    */
    
    public java.lang.String getAlternativa10(){
        return this.alternativa10;
    }

    /**
    * Define alternativa10
    * @param alternativa10 alternativa10
    * @generated
    */
    public question setAlternativa10(java.lang.String alternativa10){
        this.alternativa10 = alternativa10;
        return this;
    }
    /**
    * Obtém resposta
    * return resposta
    * @generated
    */
    
    public java.lang.String getResposta(){
        return this.resposta;
    }

    /**
    * Define resposta
    * @param resposta resposta
    * @generated
    */
    public question setResposta(java.lang.String resposta){
        this.resposta = resposta;
        return this;
    }
    /**
    * Obtém qtdalternativas
    * return qtdalternativas
    * @generated
    */
    
    public java.lang.Integer getQtdalternativas(){
        return this.qtdalternativas;
    }

    /**
    * Define qtdalternativas
    * @param qtdalternativas qtdalternativas
    * @generated
    */
    public question setQtdalternativas(java.lang.Integer qtdalternativas){
        this.qtdalternativas = qtdalternativas;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
question object = (question)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}