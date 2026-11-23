# Bonusaufgabe

Erstelle die Klasse Vector2D, welche die double-Attribute u und v besitzt, welche die Komponenten eines Vektors sind.

Implementiere getter, setter und geeignete Konstruktoren.

Implementiere die Methode length, welche die Länge des Vektors zurückgibt.

Implementiere die Methode normalise, welche den Vektor auf die Einheitslänge normalisiert (Hinweis: Division durch Länge, tue nichts für den Nullvektor)

Implementiere die Methdoe equals(Vector2D other), welche zwei Vektoren bis auf eine Toleranz von 1e-8 vergleicht.

Implementiere die Methode isParallel(Vector2D other), welche prüft, ob die beiden Vektoren parallel sind. Nutze die gleiche Toleranz wie equals.

# Bonus-Bonusaufgabe

Implementiere die Klasse StraightLine, welche eine Gerade darstellt, nutze für interne Darstellung einen Point und einen Vector2D.

Biete einen Konstruktur mit Point+Vector2D sowie einen Konstruktor mit Point, Point an. Die interne Darstellung bleibt in beiden Fällen Point+Vector2D.

SCHWER! Implementiere die Methode equals, welche überprüft, ob zwei Geraden gleich sind (Hinweis: Vektoren müssen übereinstimmen und dann Gleichungssystem lösen bzw. daraus Formel herleiten)
