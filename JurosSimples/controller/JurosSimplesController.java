import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author matheusteles 
 * @date 06/05/2024
 */
public class JurosSimplesController
{
    JurosSimplesView jurosView;
    Stage stage;
    JurosSimples juros;
    public TextField textFieldCapital;
    public TextField textFieldTaxa;
    public TextField textFieldTempo;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe JurosSimplesController
     */
    public JurosSimplesController()
    {
        this.stage = new Stage();
        this.jurosView = new JurosSimplesView();
        this.jurosView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.jurosView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double capital = Double.parseDouble(textFieldCapital.getText());
            double taxa = Double.parseDouble(textFieldTaxa.getText());
            double tempo = Double.parseDouble(textFieldTempo.getText());
            JurosSimples juros = new JurosSimples(capital, taxa, tempo);
            this.labelResultado.setText(juros.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldCapital.setText("");
        textFieldTaxa.setText("");
        textFieldTempo.setText("");
        labelResultado.setText("");
    }    
}
