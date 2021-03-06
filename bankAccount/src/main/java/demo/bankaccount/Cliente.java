package demo.bankaccount;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Cliente implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Nome")
   private java.lang.String nome;
   @org.kie.api.definition.type.Label("Sobrenome")
   private java.lang.String sobrenome;
   @org.kie.api.definition.type.Label("RG")
   private java.lang.String rg;
   @org.kie.api.definition.type.Label("Email")
   private java.lang.String email;
   @org.kie.api.definition.type.Label("Telefone")
   private java.lang.String telefone;
   @org.kie.api.definition.type.Label("Renda Mensal")
   private Integer salario;

   @org.kie.api.definition.type.Label("Limite")
   private java.lang.Integer limite;

   @org.kie.api.definition.type.Label("CEP")
   private java.lang.String cep;

   @org.kie.api.definition.type.Label("Numero")
   private java.lang.Integer numero;

   @org.kie.api.definition.type.Label("Complemento")
   private java.lang.String complemento;

   @org.kie.api.definition.type.Label("Rua")
   private java.lang.String rua;

   @org.kie.api.definition.type.Label("Bairro")
   private java.lang.String bairro;

   @org.kie.api.definition.type.Label("Cidade")
   private java.lang.String cidade;

   @org.kie.api.definition.type.Label("Estado")
   private java.lang.String estado;

   @org.kie.api.definition.type.Label(value = "CPF")
   private java.lang.String cpf;

   public Cliente()
   {
   }

   public java.lang.String getNome()
   {
      return this.nome;
   }

   public void setNome(java.lang.String nome)
   {
      this.nome = nome;
   }

   public java.lang.String getSobrenome()
   {
      return this.sobrenome;
   }

   public void setSobrenome(java.lang.String sobrenome)
   {
      this.sobrenome = sobrenome;
   }

   public java.lang.String getRg()
   {
      return this.rg;
   }

   public void setRg(java.lang.String rg)
   {
      this.rg = rg;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.String getTelefone()
   {
      return this.telefone;
   }

   public void setTelefone(java.lang.String telefone)
   {
      this.telefone = telefone;
   }

   public java.lang.Integer getSalario()
   {
      return this.salario;
   }

   public void setSalario(java.lang.Integer salario)
   {
      this.salario = salario;
   }

   public java.lang.Integer getLimite()
   {
      return this.limite;
   }

   public void setLimite(java.lang.Integer limite)
   {
      this.limite = limite;
   }

   public java.lang.String getCep()
   {
      return this.cep;
   }

   public void setCep(java.lang.String cep)
   {
      this.cep = cep;
   }

   public java.lang.Integer getNumero()
   {
      return this.numero;
   }

   public void setNumero(java.lang.Integer numero)
   {
      this.numero = numero;
   }

   public java.lang.String getComplemento()
   {
      return this.complemento;
   }

   public void setComplemento(java.lang.String complemento)
   {
      this.complemento = complemento;
   }

   public java.lang.String getRua()
   {
      return this.rua;
   }

   public void setRua(java.lang.String rua)
   {
      this.rua = rua;
   }

   public java.lang.String getBairro()
   {
      return this.bairro;
   }

   public void setBairro(java.lang.String bairro)
   {
      this.bairro = bairro;
   }

   public java.lang.String getCidade()
   {
      return this.cidade;
   }

   public void setCidade(java.lang.String cidade)
   {
      this.cidade = cidade;
   }

   public java.lang.String getEstado()
   {
      return this.estado;
   }

   public void setEstado(java.lang.String estado)
   {
      this.estado = estado;
   }

   public java.lang.String getCpf()
   {
      return this.cpf;
   }

   public void setCpf(java.lang.String cpf)
   {
      this.cpf = cpf;
   }

   public Cliente(java.lang.String nome, java.lang.String sobrenome,
         java.lang.String rg, java.lang.String email, java.lang.String telefone,
         java.lang.Integer salario, java.lang.Integer limite,
         java.lang.String cep, java.lang.Integer numero,
         java.lang.String complemento, java.lang.String rua,
         java.lang.String bairro, java.lang.String cidade,
         java.lang.String estado, java.lang.String cpf)
   {
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.rg = rg;
      this.email = email;
      this.telefone = telefone;
      this.salario = salario;
      this.limite = limite;
      this.cep = cep;
      this.numero = numero;
      this.complemento = complemento;
      this.rua = rua;
      this.bairro = bairro;
      this.cidade = cidade;
      this.estado = estado;
      this.cpf = cpf;
   }
   
   public String toString() {
        return "Cliente" + this.nome + " limite " + this.limite;
    }

}