package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] str = new ChessPiece[8];
        for (int i = 0; i < 4; i++) {
            str[i] = ChessPiece.PAWN_WHITE;
            str[i + 4] = ChessPiece.ROOK_BLACK;
        }
        for (ChessPiece s : str) {
            System.out.print(s.name + " ");
        }
    }
}