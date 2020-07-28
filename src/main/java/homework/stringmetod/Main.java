package homework.stringmetod;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = "Java";
        String str3 = "C#";
        String str4 = "j";
        String str5 = "J";
        String str6 = "JAVA";
        String str7 = "";
        String str8 = "    Java    ";

        //по индексу возвращает символ
        char x = str1.charAt(0);
        System.out.println(x);

        //возвращает число в кодировке Unicode указанного символа
        int q = str1.codePointAt(1);
        System.out.println(q);

        boolean st = str1.startsWith("Ja");
        System.out.println(st);

        int w = str1.compareTo(str3);
        System.out.println(w); //C находится раньше J

        int e1 = str4.compareTo(str5); // сначала идут буквы верхнего регистра
        int e2 = str4.compareToIgnoreCase(str5); //без учета верхнего рнгистра
        System.out.println(e1);
        System.out.println(e2);

        String r = str1.concat(str3);
        System.out.println(r);

        boolean y1 = str1.equals(str2);
        boolean y2 = str1.equalsIgnoreCase(str6);
        System.out.println(y1);
        System.out.println(y2);

        int u = str1.hashCode();
        System.out.println(u);

        int i1 = str1.indexOf(65);
        int i2 = str6.indexOf(65);  //есть ли в строке буква A (65). Если есть 1, нет -1
        int i3 = str1.indexOf("v"); //возвращает индекс символа в строке
        System.out.println(i1);
        System.out.println(i2); //A (65) есть в строке
        System.out.println(i3);

        boolean o = str7.isEmpty(); //true если пустая строка
        System.out.println(o);

        int p = str1.length();
        System.out.println(p);

        String[] a = str1.split("a");
        for(String i : a)
            System.out.print(i + " ");

        String s1 = str1.substring(0, 2);
        String s2 = str1.substring(1, 4);
        System.out.println("\n" + s1);
        System.out.println(s2);

        char[] d = str1.toCharArray();
        for(char f : d)
            System.out.print(f + " ");

        String g = str6.toLowerCase();
        System.out.println("\n" + g);

        String h = str8.trim();
        System.out.println(str8);
        System.out.println(h);

        int k = 27;
        String n = String.valueOf(k);
        System.out.println(n);

        char[] v = {'b', 'a', 'g', 'h'};
        String m = String.copyValueOf(v);
        System.out.println(m);

        String c = str1.replace("a", "v");
        System.out.println(c);

        StringBuilder stringBuilder = new StringBuilder();
        int qw = stringBuilder.capacity();
        System.out.println(qw);

        stringBuilder.ensureCapacity(20);
        int qe = stringBuilder.capacity();
        System.out.println(qe);

        StringBuilder strb = new StringBuilder("Java"); // продолжаем работать с этим же объектом в отличии от String
        strb.append(" opa");
        System.out.println(strb);

        strb.setLength(15);
        System.out.println(strb.capacity());

        strb.insert(1, "K");
        System.out.println(strb);

        strb.delete(6, 9);
        System.out.println(strb);

        strb.deleteCharAt(1);
        System.out.println(strb);

        strb.reverse();
        System.out.println(strb);

    }
}
