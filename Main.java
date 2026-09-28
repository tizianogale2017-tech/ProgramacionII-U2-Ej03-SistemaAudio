package Ejercicio3_sistemaAudio;

public class Main {
    public static void main(String[] args) {
        ReproductorAudio reproductor = new ReproductorAudio(30);
        ControlRemoto control = new ControlRemoto(reproductor);

        control.pausar();
        control.reproducir();
        control.ajustarVolumen(70);
        control.ajustarVolumen(150);
        control.pausar();

        System.out.println("Estado final: " + reproductor.getEstado() + " - Volumen: " + reproductor.getVolumenActual());
    }
}
