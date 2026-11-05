// JAVA 25
// Ein neues Zeitalter 🎉🎉🎉

final String YELLOW_STAR = "\u001B[33m*\u001B[0m";
final String GREEN_STAR = "\u001B[32m*\u001B[0m";

void main() {
    String input = IO.readln("Bitte geben Sie die Höhe des Baums ein: ");
    int size = Integer.parseInt(input);
    drawTriangle(size);
}

void drawTriangle(int size) {
    for (int i = 1; i <= size; i++) {
        // Einrückung
        IO.print(" ".repeat((size - i) / 2));

        for (int j = 0; j < i; j++) {
            if (i == 1) { // nur erste Zeile
                IO.print(YELLOW_STAR);
            } else {
                IO.print(GREEN_STAR);
            }
        }
        IO.println();
    }
}
