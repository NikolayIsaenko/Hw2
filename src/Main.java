public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        friend = friend + 2;
        System.out.println("У меня " +friend + " друзей");

        friend = friend / 7;
        System.out.println(" А осталось " + friend + " друзей");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var weightBoxFighter1 = 78.2;
        var weightBoxFighter2 = 82.7;

        var allWeightBoxFighters = weightBoxFighter1 + weightBoxFighter2;

        System.out.println(allWeightBoxFighters);

        var differenceWeightBoxFighters = weightBoxFighter2 - weightBoxFighter1;
        System.out.println(differenceWeightBoxFighters);

        var differenceWeightBoxFighters1 = weightBoxFighter2 % weightBoxFighter1;
        System.out.println(differenceWeightBoxFighters1);

        var hours = 640;
        hours = 640 / 8;
        System.out.println(" Всего в компании работают - " + hours + " человек");

        var staff = 80;
        staff = staff + 94;
        System.out.println(staff);

        hours = 640 / 174;

        System.out.println(" Если в компании работает - " + staff + " человек, то всего " + hours + " часа работы может быть поделено между сотрудниками ");














    }
}