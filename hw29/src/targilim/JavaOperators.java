package targilim;

public class JavaOperators {
    static void findFruit(String fruitStr){
        switch (fruitStr){
            case "banana":
                System.out.println(fruitStr);
                break;
            case "apple":
                System.out.println(fruitStr);
                break;
            case "cucumber":
                System.out.println(fruitStr);
                break;
            case "peach":
                System.out.println(fruitStr);
                break;
            default:
                System.out.println("Sorry, can’t find a fruit with that name");
        }
    }
}
