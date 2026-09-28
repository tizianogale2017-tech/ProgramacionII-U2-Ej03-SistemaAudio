package Ejercicio3_sistemaAudio;

public class ReproductorAudio {
    private int volumenActual;
    private String estado;

    public ReproductorAudio(int volumenInicial) {
        if (volumenInicial < 0 || volumenInicial > 100) {
            throw new IllegalArgumentException("El volumen debe estar entre 0 y 100.");
        }
        this.volumenActual = volumenInicial;
        this.estado = "DETENIDO";
    }

    public void play() {
        if (estado.equals("REPRODUCIENDO")) {
            System.out.println("[Reproductor] Ya se está reproduciendo.");
            return;
        }
        estado = "REPRODUCIENDO";
        System.out.println("[Reproductor] Reproduciendo (volumen " + volumenActual + ").");
    }

    public void pause() {
        if (!estado.equals("REPRODUCIENDO")) {
            System.out.println("[Reproductor] No se puede pausar: no hay nada reproduciéndose.");
            return;
        }
        estado = "PAUSADO";
        System.out.println("[Reproductor] En pausa.");
    }

    public void stop() {
        estado = "DETENIDO";
        System.out.println("[Reproductor] Detenido.");
    }

    public void cambiarVolumen(int nuevoVolumen) {
        if (nuevoVolumen < 0 || nuevoVolumen > 100) {
            System.out.println("[Reproductor] Volumen " + nuevoVolumen + " rechazado: debe estar entre 0 y 100.");
            return;
        }
        volumenActual = nuevoVolumen;
        System.out.println("[Reproductor] Volumen ajustado a " + volumenActual + ".");
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public String getEstado() {
        return estado;
    }
}
