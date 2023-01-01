public class Ex12_PlayingCat {

    public static boolean isCatPlaying(boolean summer,int temperature ){

        boolean catIsPlaying = false;

        if(summer){
            if( ( temperature >= 25 ) && ( temperature <= 45 )){
                catIsPlaying = true;
            }else{
                catIsPlaying = false;
            }

        } else if (!summer) {
            if( ( temperature >= 25 ) && ( temperature <= 35 )){
                catIsPlaying = true;
            }else{
                catIsPlaying = false;
            }
        }

        return catIsPlaying;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,46));
    }
}
