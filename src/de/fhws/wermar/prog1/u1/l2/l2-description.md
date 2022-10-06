# L2: Das erste Programm auf der Konsole
Benötigt werden hierfür folgende Schritte:

1. Erstellen eines Files mit der Endung ```.java``` -> wobei hier egal ist ob das File mit Nodepad++ oder vim erstellt wurde. 
   > Der Befehl für die reine Konsole mit vim wäre: 
   > ```shell
   > vim Application.java
   > ```
2. Danach wird die Klasse hinzugefügt, sie muss dem Filenamen exakt entsprechen:
   > ```java 
   > public class Application { 
   > 
   > }
   > ```
3. Nun folgt die Main-Methode, welche die JVM als Einstieg in das Programm nutzt: 
   > ```java 
   > public class Application {
   >    public static void main (String[] args) {
   >    
   >    }
   > }
   >```
4. In der Main-Methode können wir nun unseren Code ausführen -> In diesem Fall eine einfache Ausgabe auf der Konsole: 
   > ```java 
   > public class Application {
   >    public static void main (String[] args) {
   >       System.out.println("Hello World");
   >    }
   > }
   >```
5. Speichern ```shell :wq ``` für vim und dann das File kompilieren
   > ```shell javac Application.java```
   > 
   > Schaut man sich nun das Directory an, sieht man das dieser Befehl ein weiteres File **Application.class**
   > erstellt hat, was dem Bytecode-File unserer Application-Klasse entspricht. 
   > 
6. Ausführen des Programms mit ```shell java Application``` -> Hello World wird auf der Konsole ausgegeben.