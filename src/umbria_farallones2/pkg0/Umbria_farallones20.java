/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umbria_farallones2.pkg0;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN CAMILO
 */
public class Umbria_farallones20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Inicio
        JOptionPane.showMessageDialog(null, "Estamos en el edificio tecnologico, nuestro objetivo es llegar a farallones lo mas rapido posible");

        //p1
        String[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "Quieres ir al baño antes de partir?",
                "Estamos en umbria",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (x == 0) {

            JOptionPane.showMessageDialog(null, "Ingresar al baño de Umbria");

            //verificar si ya acabo en el baño
            int confirm = 0;

            do {
                confirm = JOptionPane.showOptionDialog(null, "ya acabaste?",
                        "Estamos en umbria",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            } while (confirm != 0);

            JOptionPane.showMessageDialog(null, "Salir de umbría y caminar hasta la zona de comidas de Bristo");

        } else {

            JOptionPane.showMessageDialog(null, "Salir de umbría y caminar hasta la zona de comidas de Bristo");

        }

        //P2, estamos en bristo
        JOptionPane.showMessageDialog(null, "Llegamos a bristo");
        int p2 = JOptionPane.showOptionDialog(null, "Tienes alguna necesidad?",
                "Estamos en bristo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (p2 == 0) {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            boolean comp = false;
            do {
                Object[] possibleValues = {"Baño", "Hambre", "Ninguna"};
                Object selectedValue = JOptionPane.showInputDialog(null,
                        "Que necesidad tienes", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues, possibleValues[0]);

                if (selectedValue.equals("Baño")) {
                    String[] ga = {"Muchas", "Pocas"};
                    int ganas = JOptionPane.showOptionDialog(null, "Que tantas ganas tienes de ir?",
                            "Estamos en bristo",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ga, ga[0]);

                    if (ganas == 0) {

                        JOptionPane.showMessageDialog(null, "Caminar al baño en la parte de atrás del lago del Lago");

                        int abierto = JOptionPane.showOptionDialog(null, "El baño esta abierto?",
                                "Estamos en bristo",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                        if (abierto == 0) {

                            JOptionPane.showMessageDialog(null, "ir al baño");

                        } else {

                            JOptionPane.showMessageDialog(null, "Caminar al baño en la parte de al frente del lago");
                            int abierto2 = JOptionPane.showOptionDialog(null, "El baño esta abierto?",
                                    "Estamos en bristo",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                            if (abierto2 == 0) {

                                JOptionPane.showMessageDialog(null, "ir al baño");

                            } else {

                                JOptionPane.showMessageDialog(null, "Aguante hasta el siguiente baño en el camino");
                            }

                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "Hay mas baños en el camino");

                    }

                } else if (selectedValue.equals("Hambre")) {

                    int abierto3 = JOptionPane.showOptionDialog(null, "Brito esta abierto?",
                            "Estamos en bristo",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                    if (abierto3 == 0) {

                        String[] ga = {"Muchas", "Pocas"};
                        int ganas2 = JOptionPane.showOptionDialog(null, "¿Que tanta hambre tengo?",
                                "Estamos en bristo",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ga, ga[0]);

                        if (ganas2 == 0) {

                            JOptionPane.showMessageDialog(null, "Ir a comer a bristo");

                        } else {
                            JOptionPane.showMessageDialog(null, "Hay mas cafeteria en el camino");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Hay mas cafeteria en el camino");
                    }

                } else {
                    comp = true;
                }
            } while (comp != true);

            JOptionPane.showMessageDialog(null, "Caminar Hacia la zona entre edificios, en la parte de atrás de los edificios");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        } else {

            JOptionPane.showMessageDialog(null, "Caminar Hacia la zona entre edificios, en la parte de atrás de los edificios");

        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     

//zona entre edificios
        JOptionPane.showMessageDialog(null, "Llegamos a la zona entre edificios");
        int p3 = JOptionPane.showOptionDialog(null, "Tienes alguna necesidad antes de seguir?",
                "Estamos en la zona entre edificios",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (p3 == 0) {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            boolean comp = false;
            do {
                Object[] possibleValues = {"Baño", "Imprimir", "Ninguna"};
                Object selectedValue = JOptionPane.showInputDialog(null,
                        "Que necesidad tienes", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues, possibleValues[0]);

                if (selectedValue.equals("Baño")) {
                    String[] ga = {"Muchas", "Pocas"};
                    int ganas = JOptionPane.showOptionDialog(null, "Que tantas ganas tienes de ir?",
                            "Estamos en la zona entre edificios",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ga, ga[0]);

                    if (ganas == 0) {

                        JOptionPane.showMessageDialog(null, "Entrar al cedro por la parte de Atrás y atravesar lo hacia la parte de al frente donde están la fotocopiadora y los baños");

                        int abierto = JOptionPane.showOptionDialog(null, "El baño esta abierto?",
                                "Estamos en la zona entre edificios",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                        if (abierto == 0) {

                            JOptionPane.showMessageDialog(null, "ir al baño");

                        } else {

                            JOptionPane.showMessageDialog(null, "Aguante hasta el siguiente baño en el camino");

                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "Hay mas baños en el camino");

                    }

                } else if (selectedValue.equals("Imprimir")) {
                    String[] ga = {"Mucho", "Poco"};
                    int abierto4 = JOptionPane.showOptionDialog(null, "Que tan urgente es que imprima?",
                            "Estamos en la zona entre edificios",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ga, ga[0]);

                    if (abierto4 == 0) {

                        JOptionPane.showMessageDialog(null, "Entrar al cedro por la parte de Atrás y atravesar lo hacia la parte de al frente donde están la fotocopiadora y los baños");

                        //revisar si la fotocopiadora esta abierta
                        int abiertoFot = JOptionPane.showOptionDialog(null, "La fotocopiadora esta abierta?",
                                "Estamos en la zona entre edificios",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                        if (abiertoFot == 0) {
                            JOptionPane.showMessageDialog(null, "Imprimir");
                        } else {
                            JOptionPane.showMessageDialog(null, "Hay mas impresoras en el camino");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Hay mas impresoras en el camino");
                    }

                } else {
                    comp = true;

                }
            } while (comp != true);

            JOptionPane.showMessageDialog(null, "Diriguirse a afuera de la biblioteca");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        } else {

            JOptionPane.showMessageDialog(null, "Diriguirse a afuera de la biblioteca");

        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     

        JOptionPane.showMessageDialog(null, "LLegamos a afuera de la biblioteca");

    }

}
