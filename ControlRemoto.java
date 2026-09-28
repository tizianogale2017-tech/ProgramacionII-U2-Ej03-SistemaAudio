package Ejercicio3_sistemaAudio;

public class ControlRemoto {
    private ReproductorAudio reproductor;

    public ControlRemoto(ReproductorAudio reproductor) {
        this.reproductor = reproductor;
    }

    public void reproducir() {
        System.out.println("[Control] Botón PLAY");
        reproductor.play();
    }

    public void pausar() {
        System.out.println("[Control] Botón PAUSA");
        reproductor.pause();
    }

    public void detener() {
        System.out.println("[Control] Botón STOP");
        reproductor.stop();
    }

    public void ajustarVolumen(int nuevoVolumen) {
        System.out.println("[Control] Ajustar volumen a " + nuevoVolumen);
        reproductor.cambiarVolumen(nuevoVolumen);
    }
}
