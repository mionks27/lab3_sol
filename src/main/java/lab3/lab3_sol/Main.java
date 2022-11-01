package lab3.lab3_sol;

import lab3.lab3_sol.beans.Player;
import lab3.lab3_sol.beans.Team;
import lab3.lab3_sol.controller.AppController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AppController appController = new AppController();
        ArrayList<Team> teams = new ArrayList<Team>();
        ArrayList<Player> players = new ArrayList<Player>();
        boolean estado = true;
        while (estado) {
            switch (Main.menuPricipal()) {
                case "1":
                    System.out.println("\n Registrar Nuevo Equipo");
                    System.out.println("---------------------------------------------");
                    appController.registrarNuevoEquipo(teams);
                    break;
                case "2":
                    System.out.println("\n Registrar Nuevo Jugador");
                    System.out.println("---------------------------------------------");
                    appController.registrarNuevoJugador(players);
                    break;
                case "3":
                    System.out.println("\n Lista de jugadores x salario");
                    System.out.println("---------------------------------------------");
                    appController.listarJugadoresXSalario(players);
                    break;
                case "4":
                    System.out.println("\n Lista de Equipos");
                    System.out.println("---------------------------------------------");
                    appController.listarEquipos(teams);
                    break;
                case "9":
                    estado = false;
                    System.out.println(" --- Cerrando Programa --- ");
                    break;
                default:
                    System.out.println("\nIngrese una opción valida\n");
                    break;
            }
        }
    }

    public static String menuPricipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|            Menú                           |");
        System.out.println("| 1 <- Registrar Nuevo Equipo               |");
        System.out.println("| 2 <- Registrar Nuevo Jugador              |");
        System.out.println("| 3 <- Lista de jugadores x salario         |");
        System.out.println("| 4 <- Lista de Equipos                     |");
        System.out.println("| 9 <- Salir                                |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Ingrese opción : ");
        return scanner.nextLine();

    }

}
