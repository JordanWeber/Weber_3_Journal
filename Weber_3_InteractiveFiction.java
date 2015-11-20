package weber_3_interactivefiction;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author JordanWeber
 */
public class Weber_3_InteractiveFiction {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static Player player = new Player();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        start();
    }
    public static void run() {
        
        //Part 1: Chose class
        player.playerClass = player.setPlayerClass();
        System.out.println("Player class is: "+Player.playerClass);
        
        //Player plays or does not play tutorial
        System.out.print("Would you like to play the tutorial?");
        String tutorialAnswer = sc.nextLine().toLowerCase();
        if(tutorialAnswer.contains("y")){
            tutorial();
        }
        quest1();
        //End tutorial prompt
//        player.displayStats();
        
    }
    public static void start() {
        System.out.print("What is your name?\n>> ");
        Player.name = sc.nextLine();
        System.out.print("Would you like to play a game, "+Player.name+"?\n>> ");
        String answer = sc.nextLine();
        if(answer.contains("y")) {
            run();
        }
    }
    public static void tutorial() {
        System.out.println("Tutorial goes here.");
    }
    public static void quest1() {
        //Quest 1 - Part 1
        System.out.println("You awake in an empty room. There is no sight of people around you.\n"
                + "Do you LEAVE the room to find people or INVESTIGATE the room?");
        String searchAnswer = sc.nextLine().toLowerCase();
        if(searchAnswer.contains("investigate")){
            generateChest();
        } 
    }
    
    
    //Loot methods
    /*
    Low, Mid, and High Tier loot only affects the probability of
    getting better loot, not the actual quality of the loot.
    */
    public static void generateChest() {
        //Determines what level of loot is in the chest, as seen below
        int chestCheck = rand.nextInt(100) + 1;
        if(chestCheck >= 0 && chestCheck < 70){
            generateLowTierLoot();
            System.out.println("Low Tier Loot"+chestCheck);
        } else if (chestCheck >= 70 && chestCheck < 85) {
            generateMidTierLoot();
            System.out.println("Mid Tier Loot"+chestCheck);
        } else if (chestCheck >= 85 && chestCheck <= 100) {
            generateHighTierLoot();
            System.out.println("High Tier Loot"+chestCheck);
        }
    }
    public static void generateLowTierLoot() {
        int lootCheck = rand.nextInt(100) + 1;
        //Determines level of loot player gets
        int lootLevel = 0;
        /*
        Loot Level Values:
        1 = low tier loot
        2 = mid tier loot
        3 = high tier loot
        4 = legendary loot
        */
        if(lootCheck >= 0 && lootCheck < 80) {
            lootLevel = 1;
        } else if(lootCheck >= 80 && lootCheck < 90) {
            lootLevel = 2;
        } else if(lootCheck >= 90 && lootCheck < 97) {
            lootLevel = 3;
        } else if (lootCheck >= 97 && lootCheck <= 100) {
            lootLevel = 4;
        }
        generateLoot(lootLevel);
    }
    public static void generateMidTierLoot() {
        int lootCheck = rand.nextInt(100) + 1;
        //Determines level of loot player gets
        int lootLevel = 0;
        /*
        Loot Level Values:
        1 = low tier loot
        2 = mid tier loot
        3 = high tier loot
        4 = legendary loot
        */
        if(lootCheck >= 0 && lootCheck < 70) {
            lootLevel = 1;
        } else if(lootCheck >= 70 && lootCheck < 80) {
            lootLevel = 2;
        } else if(lootCheck >= 80 && lootCheck < 92) {
            lootLevel = 3;
        } else if (lootCheck >= 92 && lootCheck <= 100) {
            lootLevel = 4;
        }
        generateLoot(lootLevel);
    }
    public static void generateHighTierLoot() {
        int lootCheck = rand.nextInt(100) + 1;
        //Determines level of loot player gets
        int lootLevel = 0;
        /*
        Loot Level Values:
        1 = low tier loot
        2 = mid tier loot
        3 = high tier loot
        4 = legendary loot
        */
        if(lootCheck >= 0 && lootCheck < 50) {
            lootLevel = 1;
        } else if(lootCheck >= 50 && lootCheck < 70) {
            lootLevel = 2;
        } else if(lootCheck >= 70 && lootCheck < 90) {
            lootLevel = 3;
        } else if (lootCheck >= 90 && lootCheck <= 100) {
            lootLevel = 4;
        }
        generateLoot(lootLevel);
    }
    public static void generateLoot(int number) {
        //Determines loot given by chest.
        switch(number) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                
                break;
        }
    }
}
