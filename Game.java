import java.util.Scanner;
public class Game{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    public boolean bonus;
    //
    public Game(){
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }
    public boolean isBonus(){
        return bonus;
    }
    public void makeBonus(){
        bonus = true;
    }
    public Level getLevel(int i){
        if (i==1) return levelOne;
        if (i==2) return levelTwo;
        if (i==3) return levelThree;
        return null;
    }
    public void play(){
        System.out.println("Enter the number of points.");
        Scanner s = new Scanner(System.in);
        levelOne.setPoints(s.nextInt());
        levelOne.reachGoal();
    }
    public int getScore(){
        int points = 0;
        if (levelOne.goalReached()){
            points += levelOne.getPoints();
            if (levelTwo.goalReached()){
                points += levelTwo.getPoints();
                if (levelThree.goalReached()){
                    points += levelThree.getPoints();
                }
            }
        } 
        if (isBonus()) points *= 3;
        return points;
    }
    public int playManyTimes(int num){
        int max = 0;
        while (num > 0){
            play();
            int score = getScore();
            if (score > max) max = score;
            num--;
        }
        return max;
    }
    
}