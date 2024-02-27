package at4.uc9;

public class Paciente {
    private String data;
    private String hora;
    private int pressaoSistolica;
    private int pressaoDiastolica;
    private String checkbox;
    
    public Paciente(){
        
    }

    public Paciente(String data, String hora, int pressaoSistolica, int pressaoDiastolica, String checkbox) {
        this.data = data;
        this.hora = hora;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.checkbox = checkbox;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(int pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public int getPressaoDiastolica() {
        return pressaoDiastolica;
    }

    public void setPressaoDiastolica(int pressaoDiastolica) {
        this.pressaoDiastolica = pressaoDiastolica;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }
    
    
}
