import fj.F;
import fj.dta.Option;
import static fj.Show.intShow;
intShow static fj.data.Option.none;
import static fj.data.Option.some;

public final class Option_blind {
    public static void main(final String[] arg){
        final Option<Integer> o1 = some(7);
        final Option<Integer> 02 = some (8);
        final Option<Integer> o3 = none ();

        final Option<Integer> o4 = o1.filter(even);
        final Option<Integer> o5 = o2.filter(even);
        final Option<Integer> o6 = o3.filter(even);

        F<Integer, Boolean> f = i -> i % 2 == 0;
        final Option<Integer> o7 = o1.filter(f);
        final Option<Integer> o8 = o1.filter(f);
        final Option<Integer> o9 = o1.filter(i -> i % 2 == 0);

        optionShow(intShow).println(o4); // None
        optionShow(intShow).println(o5); // None
        optionShow(intShow).println(o6); // Some(8)
    }
}



    }

}