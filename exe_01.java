import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int L, C, i, j;
        Scanner leia = new Scanner(System.in);
        System.out.printf("Digite a qtd de linhas: ");
        L = leia.nextInt();
        System.out.printf("Digite a qtd de Colunas: ");
        C = leia.nextInt();
        String esp = " ";
        String borda = "♦";
        for (i = 0; i < L; i++) {
            for (j = 0; j < C; j++) {
                if(i==0 || i == L-1){
                    System.out.printf("%s", borda);
                }else{
                    if(j == 0 || j==C-1){
                        System.out.printf("%s", borda);
                    }
                    else{
                        System.out.printf("%s", esp);
                    }
                }
            }
            System.out.println();
        }
    }
}