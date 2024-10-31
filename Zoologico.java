package taller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoologico {
    private List<Animal> animales;
    private Map<String, Integer> conteoPorTipo;

    public Zoologico() {
        animales = new ArrayList<>();
        conteoPorTipo = new HashMap<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        // Incrementar el conteo por tipo
        String tipo = animal.getClass().getSimpleName(); // Obtiene el nombre de la clase
        conteoPorTipo.put(tipo, conteoPorTipo.getOrDefault(tipo, 0) + 1); 
    }

    public void mostrarSonidos() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + ": " + animal.hacerSonido());
        }
    }

    public void mostrarConteoPorTipo() {
        System.out.println("Conteo por tipo de animal:");
        for (Map.Entry<String, Integer> entry : conteoPorTipo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



