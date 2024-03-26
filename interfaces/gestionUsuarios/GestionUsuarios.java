package gestionUsuarios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class GestionUsuarios extends JFrame{
    private JPanel gestionUsuarios;
    private JButton bGestionusuarios;
    private JButton bGestionArena;
    private JButton bGestionMedacStars;
    private JButton bsalir;
    private JButton bLogout;

    public GestionUsuarios() {
        add(gestionUsuarios);
        setTitle("TestUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setLocationRelativeTo(null);
        setVisible(true);


        bGestionMedacStars.addActionListener(new ActionListener() {

            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("has elegido ir a Gestión Medac Stars");
            }
        });
        bGestionArena.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has elegido ir a Gestión de Arenas");
            }
        });
        bsalir.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saliendo del programa...");
                exit(0);
            }
        });
        bLogout.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cerrando la sesión...");
                exit(0);
            }
        });
        bGestionusuarios.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has elegido ir a Gestión de Usuarios");
            }
        });
    }

    public static void main(String[] args){
        new GestionUsuarios();
    }
}
