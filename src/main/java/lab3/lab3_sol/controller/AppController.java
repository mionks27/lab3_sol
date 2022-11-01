package lab3.lab3_sol.controller;

import lab3.lab3_sol.beans.Player;
import lab3.lab3_sol.beans.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {

    public void registrarNuevoEquipo(ArrayList<Team> teams){
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();
        System.out.print(" Nombreeeeee : ");
        team.setNombre(scanner.nextLine());
        boolean condicion = buscarEquipoXNombre(teams, team);
        if (condicion) {
            System.out.println("\"Error, ya existe el nombre\"");
            return;
        }
        System.out.print(" Paissssssss : ");
        team.setPais(scanner.nextLine());
        System.out.print(" Iniciales : ");
        team.setIniciales(scanner.nextLine());
        if (team.getIniciales().length() > 3){
            System.out.println("\"Error, el inicial no puede tener mas de 3 caracteres\"");
            return;
        }
        System.out.print(" Estadio : ");
        team.setEstadio(scanner.nextLine());
        System.out.print(" Técnico : ");
        team.setTecnico(scanner.nextLine());
        System.out.print(" Presupuesto : ");
        team.setPresupuesto(Float.parseFloat(scanner.nextLine()));
        teams.add(team);
    }

    public void registrarNuevoJugador(ArrayList<Player> players){
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.print(" Nombre : ");
        player.setNombre(scanner.nextLine());
        System.out.print(" posicion : ");
        player.setPosicion(scanner.nextLine());
        System.out.print(" Numero de Camiseta : ");
        player.setNum_camiseta(Integer.parseInt(scanner.nextLine()));
        System.out.print(" Edad : ");
        player.setEdad(scanner.nextLine());
        System.out.print(" DNI : ");
        player.setDni(scanner.nextLine());
        boolean condicion = buscarJugadorXDni(players, player);
        if (condicion) {
            System.out.println("\"Error, ya existe el dni\"");
            return;
        }
        System.out.print(" Salario : ");
        player.setSalario(Float.parseFloat(scanner.nextLine()));
        players.add(player);
    }

    public void listarEquipos(ArrayList<Team> teams){
        for (Team team: teams){
            System.out.println("Nombre : " + team.getNombre() +
                    "| Pais : " + team.getPais() +
                    "| Iniciales : " + team.getIniciales() +
                    "| Estadio : " + team.getEstadio() +
                    "| Técnico : " + team.getTecnico() +
                    "| Presupuesto : S/." +  team.getPresupuesto());
        }
    }

    public void listarJugadoresXSalario(ArrayList<Player> players){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Salario mayor a : ");
        float salary = Float.parseFloat(scanner.nextLine());
        for (Player player: players){
            if (player.getSalario() > salary){
                System.out.println("Nombre : " + player.getNombre() +
                        "| Posición : " + player.getPosicion() +
                        "| Numero de Camiseta : " + player.getNum_camiseta() +
                        "| Edad : " + player.getEdad() +
                        "| DNI : " + player.getDni() +
                        "| Salario : S/." +  player.getSalario());
            }
        }
    }

    public boolean buscarEquipoXNombre(ArrayList<Team> teams, Team team){
        boolean condicion = false;
        for (Team team1: teams){
            if (team1.getNombre().equalsIgnoreCase(team.getNombre())) {
                condicion = true;
                break;
            }
        }
        return condicion;
    }

    public boolean buscarJugadorXDni(ArrayList<Player> players, Player player){
        boolean condicion = false;
        for (Player player1: players){
            if (player1.getDni().equalsIgnoreCase(player.getDni())) {
                condicion = true;
                break;
            }
        }
        return condicion;
    }

}
