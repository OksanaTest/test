package com.goit.examplesFromShildt.generics.example04;

public class BoundedWildCard {

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(0, -3),
                new TwoD(34, 10),
                new TwoD(-56, 23),
                new TwoD(111, 90)
        };
        Coords<TwoD> tdlocs = new Coords<>(td);

        FourD fd[] = {
                new FourD(1, 4, -5, 78),
                new FourD(5, 34, 15, 90),
                new FourD(23, 6, 65, 8),
                new FourD(-1, 99, 100, 178),
                new FourD(11, 22, 333, 4444),
                new FourD(61, -34, -52, 475),
                new FourD(-51, 7, 12, -45),
                new FourD(1584, 2039, 3847, 1988),
                new FourD(851, 204, -235, 748)
        };
        Coords<FourD> fdlocs = new Coords<>(fd);
        System.out.println("TwoD objects contain the following coords: ");
        showXY(tdlocs);
        System.out.println("FourD objects contain the following coords");
        showXYZT(fdlocs);
        System.out.println("FourD objects contain the following X, Y and Z coords (show method was used as for TreeD)");
        showXYZ(fdlocs);
    }
    static void showXY(Coords<? extends TwoD> c){
        System.out.println("coords X and Y are: ");
        for (int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + "\t" +
                    c.coords[i].y);
        }
    }
    static void showXYZ(Coords<? extends TreeD> c){
        System.out.println("coords X, Y and Z are: ");
        for (int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + "\t" +
                    c.coords[i].y + "\t" +
                    c.coords[i].z);
        }
    }
    static void showXYZT(Coords<? extends FourD> c){
        System.out.println("coords X, Y and Z are: ");
        for (int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + "\t" +
                    c.coords[i].y + "\t" +
                    c.coords[i].z + "\t" +
                    c.coords[i].t);
        }
    }
}
