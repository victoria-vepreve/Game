public class Main{
    public static void main(String[] args){
        //Part A
        //Test Case 1
        Game one = new Game();
        one.getLevel(1).reachGoal();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reachGoal();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reachGoal();
        one.getLevel(3).setPoints(500);
        one.makeBonus();
        System.out.println(one.getScore());

        //Test Case 2
        Game two = new Game();
        two.getLevel(1).reachGoal();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reachGoal();
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());

        //Test Case 3
        Game three = new Game();
        three.getLevel(1).reachGoal();
        three.getLevel(1).setPoints(200);
        three.getLevel(2).setPoints(100);
        three.getLevel(3).reachGoal();
        three.getLevel(3).setPoints(500);
        three.makeBonus();
        System.out.println(three.getScore());

        //Test Case 4
        Game four = new Game();
        four.getLevel(1).setPoints(100);
        four.getLevel(2).reachGoal();
        four.getLevel(2).setPoints(200);
        four.getLevel(3).reachGoal();
        four.getLevel(3).setPoints(500);
        System.out.println(four.getScore());

        //Part B
        //Test Case 1
        Game five = new Game();
        System.out.println(five.playManyTimes(4));
        
    }
}