public class ServerNameGenerator {

    public static String getRandom(String[] array1, String[] array2, int random1, int random2){
        System.out.println("here is your server name\n" + array1[random1] + " " +  array2[random2]);
        return array1[random1] + " " +  array2[random2];
    }

    public static void main(String[] args){

        String[] nouns = {"virus", "pollution", "teaching", "woman", "breath",
                "art", "message", "activity", "foundation", "singer"};
        String[] adjectives = {"various", "helpful", "impossible", "environmental",
                "cultural", "substantial", "mental", "financial", "important", "basic"};

        int random1 = (int)Math.floor(Math.random() * 10);
        int random2 = (int)Math.floor(Math.random() * 10);

        getRandom(adjectives, nouns, random1, random2);


    }

}
