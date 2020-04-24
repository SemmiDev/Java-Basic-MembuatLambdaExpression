package lambdaapp1;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class CaraMembuatLambdaEpression1 {

    public static void main(String[] args) {
        // contoh 1
        
       
//        Predicate<String> predicate = (value) -> { 
//            return value != null;
//        };

        // kalau isi nya hanya satu baris maka, kita bisa tidak menggunakan kurung kurawal dan tanpa return, kalau kita menggunakan return maka otomatis akan di return null
        Predicate<String> predicate = (value) -> value != null;
        
        // contoh 2
//        Function<String,String> function = (value)-> { // sengaja menghapus tipe data String dari value karena otomatis java sudah tau itu tipe string di dalamnya
//            return value.toUpperCase();
//        };

        Function<String,String> function = (value)-> value.toUpperCase();
        
        // contoh 3
//        Consumer<String> consumer = (value) -> {
//            System.out.println(value);
//        };
        Consumer<String> consumer = (value) -> System.out.println(value);
        
        // contoh 4
        Supplier<String> suplier = () -> "SamDev";
        };
        
        // contoh 5
        BiPredicate<String, String> biPredicate = (value1, value2) -> value1.equals(value2);    
}
