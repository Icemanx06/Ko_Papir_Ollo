
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import sun.security.pkcs11.wrapper.Constants;


public class Game {
    static Map<String,Integer> map = new TreeMap<>();
    static int counter = 0;
    private Person playerA;
    private Person playerB;
    private List<Round> rounds;
    static{
    map.put("Kamen",1);
    map.put("Nuzky",2);
    map.put("Papir",3);
    
    map.put("Rock",1);
    map.put("Scissors",2);
    map.put("Paper",3);
    
    map.put("Pierre",1);
    map.put("Ciseaux",2);
    map.put("Feuille",3);
    
    map.put("Stein",1);
    map.put("Schere",2);
    map.put("Papier",3);
    
    map.put("Ko",1);
    map.put("Koe",1);
    map.put("Ollo",2);
    map.put("Olloo",2);
    map.put("Papir",3);
    
    map.put("Sasso",1);
    map.put("Roccia", 1);
    map.put("Forbice",2);
    map.put("Carta",3);
    map.put("Rete",3);
    
    map.put("Guu",1);
    map.put("Choki",2);
    map.put("Paa",3);
    
    map.put("Kamien",1);
    map.put("Nozyce",2);
    map.put("Papier",3);
    
    map.put("Piedra",1);
    map.put("Tijera",2);
    map.put("Papel",3);
            }
    public Game(Person playerA, Person playerB, List<Round> rounds) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.rounds = rounds;
        counter++;
        for (Round round : rounds) {
          if (map.get(round.getSymbolA()) == 1 && map.get(round.getSymbolB())== 2){
              playerA.addPoint();
          }
        else if (map.get(round.getSymbolA()) == 1 && map.get(round.getSymbolB())== 3){
          playerB.addPoint();
        }
        else if (map.get(round.getSymbolA()) == 2 && map.get(round.getSymbolB())== 3){
            playerA.addPoint();
        }
        else if (map.get(round.getSymbolA()) == 2 && map.get(round.getSymbolB())== 1){
          playerB.addPoint();
        }
        else if (map.get(round.getSymbolA()) == 3 && map.get(round.getSymbolB())== 1){
            playerA.addPoint();
        }
        else if (map.get(round.getSymbolA()) == 3 && map.get(round.getSymbolB())== 2){
            playerB.addPoint();
        }
         
            
        }
            
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.NEWLINE);
        sb.append("Game #").append(counter).append(":");
        sb.append(Constants.NEWLINE);
        sb.append(this.playerA.getName()).append(" ").append(this.playerA.getPoints()).append(" point");
        sb.append(Constants.NEWLINE);
        sb.append(this.playerB.getName()).append(" ").append(this.playerB.getPoints()).append(" point");
        sb.append(Constants.NEWLINE);
        if (playerA.getPoints() == playerB.getPoints())
        {
            sb.append("Tied Game");
        }
        else
        {
            sb.append("Winner ");
            if (playerA.getPoints() > playerB.getPoints())
            {
                sb.append(this.playerA.getName());
            }
            else
            {
                sb.append(this.playerB.getName());
            }
        }
        
                
        return sb.toString();
    }
    
}
