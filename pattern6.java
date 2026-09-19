public class pattern6 {
    public static void main(String args[]){
        int track=1;
        for(int i=1;i<=5;i++){
            track=1;
            for(int j=5;j>=i;j--){
                System.out.print(track);
                track++;
            }
            System.out.println();
        }
    }
}
