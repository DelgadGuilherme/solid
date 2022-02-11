package Ocp;

public class Pessoa {
    private Genero genero;

    public Pessoa(String nomeGenero) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Ocp." + nomeGenero);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            this.genero = null;
        }
        if (!(objeto instanceof Genero)) {
            this.genero = null;
        }
        this.genero = (Genero) objeto;
    }

    public void exibir() {
        this.genero.exibir();
    }

}
