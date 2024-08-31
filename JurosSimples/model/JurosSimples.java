
/**
 * Calcula o juros simples
 * 
 * @author matheusteles
 * @date 06/05/2024
 */
public class JurosSimples
{
    double capital;
    double taxa;
    double tempo;
    
    public JurosSimples() {
        this.capital = 0;
        this.taxa = 0;
        this.tempo = 0;
    }
    
    /**
     * Construtor para objetos da classe JurosSimples
     */
    public JurosSimples(double capital, double taxa, double tempo)
    {
        this.capital = capital;  
        this.taxa = taxa;
        this.tempo = tempo;
    }

    /**
     * Calcula o Juros Simples
     * 
     * @return     o valor do Juros, dado por: J = (C * i * t)/100
     */
    public double calcular()
    {
        if (this.capital <= 0 || this.taxa <= 0 || this.tempo <= 0)
            return 0;
        return (this.capital * this.taxa * this.tempo)/100.0;
    }
       
    public String interpretar(){
        String resultado = "";
        double juros = this.calcular();
        if (juros == 0)
            resultado += "Dados incompletos ou inválidos";
        else 
            resultado += "R$" + juros;
        return resultado;}
    }
    
           
    

