public class CatHouseRunner
{
    public static void main(String[] args)
    {
        // here is some that will run right away, just to play around
        // (make sure to compile both your Cat and Cathouse classes first!)
        Cat daisy = new Cat("Daisy", 3);
        Cat eleanor = new Cat("Eleanor", 8);

        CatHouse cats = new CatHouse(daisy, eleanor, "Max");

        // print CatHouse info
        System.out.println(cats);

        cats.rollCall();

        // HERE IS TEST CODE; UNCOMMENT WHEN YOU NEED IT!
 /*
    // ------- Test set 1 -------
    Cat garfield = new Cat("Garfield", 5);
    Cat crookshanks = new Cat("Crookshanks", 6);

    CatHouse myCats = new CatHouse(garfield, crookshanks, "Mr. Miller");

    // print CatHouse info
    System.out.println(myCats);

    // older cat, Crookshanks, speaks first!
    myCats.rollCall();

    // cat1 then cat2 each says a random thing
    myCats.catNoise();

    System.out.println("----------------------------");

    // ------- Test set 2 -------
    Cat toby = new Cat("Toby", 10);
    Cat ziggy = new Cat("Ziggy", 8);

    CatHouse yourCats = new CatHouse(toby, ziggy, "Alex");

    // print CatHouse info
    System.out.println(yourCats);

    // older cat, Toby, speaks first!
    yourCats.rollCall();

    yourCats.catNoise();

    System.out.println("----------------------------");

    // ------- Test set 3 -------
    Cat katie = new Cat("Katie", 12);
    Cat billy = new Cat("Billy", 12);

    CatHouse neighborsCats = new CatHouse(katie, billy, "Ms. Thompson");

    // print CatHouse info
    System.out.println(neighborsCats);

    // same age, so Billy speaks first because B before K
    neighborsCats.rollCall();

    neighborsCats.catNoise();

    System.out.println("----------------------------");

    // ------- Test set 4 -------
    Cat autumn1 = new Cat("Autumn", 15);
    Cat autumn2 = new Cat("Autumn", 15);

    CatHouse sameCats = new CatHouse(autumn1, autumn2, "ASPCA");

    // print CatHouse info
    System.out.println(sameCats);

    // same age, same name, so autumn1 speaks first...
    // although you can't really tell :p
    sameCats.rollCall();

    sameCats.catNoise();

    */
    }
}