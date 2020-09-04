public class Empregado
{
    private int tipo;
    private String nome;
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;
   
    public String getNome() {
        return nome;
    }  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public double calculaSalario()
    {
        if(tipo==1)
        {
            return salario;
        }
        else if(tipo==2)
        {
            return salario + salario * comissao;
        }
        else if(tipo ==3)
        {
            return salario+ bonus;
        }
        else
        {
            return 0.;
        }      
    }

}