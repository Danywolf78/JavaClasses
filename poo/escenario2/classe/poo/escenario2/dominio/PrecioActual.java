package classe.poo.escenario2.dominio;

import java.time.LocalDateTime;

public class PrecioActual {
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(LocalDateTime fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    private double valor;
    private LocalDateTime fechaDeCarga;


}
