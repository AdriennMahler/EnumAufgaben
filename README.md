#Aufgabe 'Enums - Hunderassen'

Btte definieren Sie eine Enum-Klasse 'Hunderasse' mit drei Konstanten
DACKEL, COLLIE und DOGGE.

Jede Hunderasse soll eine readonly-Property 'maxGroesse' bekommen:
0.5 für DACKEL, 1.0 für COLLIE und 1.5 für DOGGE.

Geben Sie alle statischen Konstanten der Klasse 'Hunderasse' aus.
Die Ausgaben sollen folgendermaßen aussehen:
Dackel, max. Größe: 0.5
Collie, max. Größe: 1.0
Dogge, max. Größe: 1.5


Aufgabe 'Enums - OS'

Gegeben ist folgende enum-Klasse:
    public enum OS {
        UNIX, WINDOWS, MAC
    }
Und die main-Methode:
    System.out.println("*** statische Methode values:");
    OS[] allValues = OS.values();

    for (OS os : allValues) {
        System.out.println(os);
    }

    System.out.println("** toString:");
    OS var1 =  OS.MAC;
    System.out.println(var1); // MAC
Erzeugen Sie eine 'normale' Klasse MyOS, die die enum-Klasse OS nachbildet.
Erzeugen Sie einen neue main-Methode, in der Ihre neue Klasse getestet wird
(genauso wie die vorgebene main-Methode die enum-Klasse OS testet).
