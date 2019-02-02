public class TestTV {

    public static void main(String[] a){

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(119);
        tv1.setVolume(1);
        tv1.channelUp();
        tv1.channelUp();
        tv1.volumeDown();



        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("TV 1s channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("TV 2s channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
