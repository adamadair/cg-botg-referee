import com.codingame.gameengine.runner.MultiplayerGameRunner;

public class Main {
    public static void main(String[] args) {

        MultiplayerGameRunner gameRunner = new MultiplayerGameRunner();
        //gameRunner.setSeed(1337L); // if you want a custom game seed.
        //gameRunner.setLeagueLevel(1); // defaults to the top league

        // ++++++++++++++++++++++++++++++++++++++++++++++++++//
        //                                                   //
        //    Comment on or off the bots you want to use     //
        //                                                   //
        // ++++++++++++++++++++++++++++++++++++++++++++++++++//

        //WAIT BOTS
        gameRunner.addAgent(SimpleWaitBot.class);
        gameRunner.addAgent(SimpleWaitBot.class);

        // Example of running another language than Java. It would be the same arguments in front of the path used in a console.

        // C# (mono is needed on a mac)
        //gameRunner.addAgent("mono /Users/myuser/Projects/BotG/CG.BotG/bin/Debug/CG.BotG.exe");

        gameRunner.start();
    }
}
