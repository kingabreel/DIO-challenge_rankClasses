import java.util.Scanner;

class CalcRank {
    static String rankClass;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numero de vitorias: ");
        int vit = scanner.nextInt();
        System.out.print("numero de derrotas: ");
        int der = scanner.nextInt();

        calcularClasse(vit, der);

        System.out.println("A classe atual do personagem é " + rankClass + ", com " + vit + " vitorias e " + der + " derrotas.");
    }

    private static void calcularClasse(int vitorias, int derrotas) {
        int vitoriasAbsolutas = vitorias - derrotas;
        if(vitoriasAbsolutas < 0) vitoriasAbsolutas = 0;

        if (vitoriasAbsolutas <= 10){
            rankClass = "Ferro";
        } else if (vitoriasAbsolutas > 10 && vitoriasAbsolutas <= 20){
            rankClass = "Bronze";
        } else if (vitoriasAbsolutas > 20 && vitoriasAbsolutas <= 50){
            rankClass = "Prata";
        } else if (vitoriasAbsolutas > 50 && vitoriasAbsolutas <= 80){
            rankClass = "Ouro";
        } else if (vitoriasAbsolutas > 80 && vitoriasAbsolutas <= 90){
            rankClass = "Diamante";
        } else if (vitoriasAbsolutas > 90 && vitoriasAbsolutas <= 100){
            rankClass = "Lendário";
        } else if (vitoriasAbsolutas > 100){
            rankClass = "Imortal";
        }
    }
} 