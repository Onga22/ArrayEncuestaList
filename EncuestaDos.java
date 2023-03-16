import javax.swing.*;
import java.util.ArrayList;


public class EncuestaDos {
    public static void main(String[] args) {

        ArrayList<Integer> encuestados = new ArrayList<>();
        int contK = 0;
        int contP = 0;
        String ingreso = "";

        for (int i = 0; !ingreso.equals("0"); i++) {
            int ingresoDos;
            ingreso= JOptionPane.showInputDialog("A que  candidato votarias estas elecciones: "+" \n "
                    + "Para Kristina presione : (1)"+" \n "+ "Para Milei presione : (2)"+ " \n "+ "Para Larreta ingrese:  (3)."+" \n "
                    +"Para finalizar la encuesta presione el numero ( 0 ) ");
            while (!ingreso.matches("[0123]{1}")) {
                JOptionPane.showMessageDialog(null,"Error ingreo un caracter invalido, vuelva a intentarlo!! ");
                ingreso= JOptionPane.showInputDialog("A que  candidato votarias estas elecciones: "+" \n "
                        + "Para Kristina presione : (1)"+" \n "+ "Para Milei presione : (2)"+ " \n "+ "Para Larreta ingrese:  (3)."+" \n "
                        +"Para finalizar la encuesta presione el numero ( 0 ) ");;
        }       ingresoDos= Integer.parseInt(ingreso);

            switch (ingresoDos){
                    case 1:
                    encuestados.add(ingresoDos);
                    contK++;
                    break;

                    case 2:
                    encuestados.add(ingresoDos);
                    break;

                    case 3:
                    encuestados.add(ingresoDos);
                    contP++;
                    break;

            }

        } JOptionPane.showMessageDialog(null,"Votantes Pro: " +contP +" \n "+
                "Votantes Negro de Mierda: " + contK);




        }}
