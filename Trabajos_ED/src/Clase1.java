import java.util.ArrayList;
import java.util.List;

public class Clase1 {
    public static void main(String[] args) {
        // 1. Creación de una lista de tareas
        List<String> TareasPorHacer = new ArrayList<>();

        // Agregar tareas a la lista
        TareasPorHacer.add("Cocinar");
        TareasPorHacer.add("Entrenar");
        TareasPorHacer.add("Estudiar");
        TareasPorHacer.add("Trabajar");
        TareasPorHacer.add("Lavar ropa");

        // Imprimir la lista de tareas
        System.out.println("Lista de tareas inicial:");
        imprimirTareas(TareasPorHacer);

        // Buscar una tarea específica
        String tareaBuscada = "Trabajar";
        buscarTarea(TareasPorHacer, tareaBuscada);

        // Agregar una tarea si no está en la lista
        String nuevaTarea = "Tender la cama ";
        agregarTareaSiNoExiste(TareasPorHacer, nuevaTarea);
        System.out.println("Lista de tareas después de agregar:");
        imprimirTareas(TareasPorHacer);

        // Eliminar una tarea específica
        String tareaAEliminar = "Entrenar";
        eliminarTarea(TareasPorHacer, tareaAEliminar);
        System.out.println("Lista de tareas después de eliminar:");
        imprimirTareas(TareasPorHacer);
    }

    // Función para imprimir todos los elementos de la lista de tareas
    public static void imprimirTareas(List<String> tareas) {
        for (String tarea : tareas) {
            System.out.println(tarea);
        }
    }

    // Función para buscar una tarea en la lista
    public static void buscarTarea(List<String> tareas, String tareaBuscada) {
        boolean encontrado = false;
        for (String tarea : tareas) {
            if (tarea.equals(tareaBuscada)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("La tarea '" + tareaBuscada + "' fue encontrada en la lista.");
        } else {
            System.out.println("La tarea '" + tareaBuscada + "' no fue encontrada en la lista.");
        }
    }

    // Función para agregar una tarea a la lista si no existe
    public static void agregarTareaSiNoExiste(List<String> tareas, String nuevaTarea) {
        if (!tareas.contains(nuevaTarea)) {
            tareas.add(nuevaTarea);
            System.out.println("La tarea " + nuevaTarea + " ha sido agregada a la lista.");
        } else {
            System.out.println("La tarea " + nuevaTarea + " ya está en la lista.");
        }
    }

    // Función para eliminar una tarea
    public static void eliminarTarea(List<String> tareas, String tareaAEliminar) {
        if (tareas.remove(tareaAEliminar)) {
            System.out.println("La tarea '" + tareaAEliminar + "' ha sido eliminada de la lista.");
        } else {
            System.out.println("La tarea '" + tareaAEliminar + "' no estaba en la lista.");
        }
    }
}

