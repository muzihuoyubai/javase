// package club.banyuan;
//
// public class StringDemo {
//
//   public static void main(String[] args) {
//     /**
//      * 获取一个String对象
//      */
//     String str = new String("newString");
//     str = "newString";
//     // 适用于所有基本数据类型
//     str = String.valueOf(123);
//
//     String strDemo = "abcdef";
//     // 求字符串长度
//     System.out.printf("%s.length() = %d\n", strDemo, strDemo.length()); // 6
//
//     // 求字符串某一位置字符
//     System.out.printf("%s.charAt(2) = %c\n", strDemo, strDemo.charAt(2)); // c
//
//     // 分割字符串，从传入的位置分割字符串
//     System.out.printf("%s.subString(2) = %s\n", strDemo, strDemo.substring(2)); // cdef
//     //该方法从beginIndex位置起，从当前字符串中取出到endIndex-1位置的字符作为一个新的字符串返回
//     System.out.printf("%s.subString(2,4) = %s\n", strDemo, strDemo.substring(2, 4)); // cdef
//
//     4、字符串比较
//     1)public int compareTo (String
//     anotherString)//该方法是对字符串内容按字典顺序进行大小比较，通过返回的整数值指明当前字符串与参数字符串的大小关系。若当前对象比参数大则返回正整数，反之返回负整数，相等返回0。
//     2)public int compareToIgnore (String anotherString)//与compareTo方法相似，但忽略大小写。
//     3)public boolean equals (Object anotherObject)//比较当前字符串和参数字符串，在两个字符串相等的时候返回true，否则返回false。
//     4)public boolean equalsIgnoreCase (String anotherString)//与equals方法相似，但忽略大小写。
//
//     1 String str1 = new String("abc");
//     2 String str2 = new String("ABC");
//     3 int a = str1.compareTo(str2);//a>0
//     4 int b = str1.compareToIgnoreCase(str2);//b=0
//     5 boolean c = str1.equals(str2);//c=false
//     6 boolean d = str1.equalsIgnoreCase(str2);//d=true
//
//     6、字符串中单个字符查找
//     1)public int indexOf ( int ch/String str)//用于查找当前字符串中字符或子串，返回字符或子串在当前字符串中从左边起首次出现的位置，若没有出现则返回-1。
//     2)public int indexOf ( int ch/String str, int fromIndex)//改方法与第一种类似，区别在于该方法从fromIndex位置向后查找。
//     3)public int lastIndexOf ( int ch/String str)//该方法与第一种类似，区别在于该方法从字符串的末尾位置向前查找。
//     4)public int lastIndexOf ( int ch/String str,
//     int fromIndex)//该方法与第二种方法类似，区别于该方法从fromIndex位置向前查找。
//
//     复制代码
//     1 String str = "I am a good student";
//     2 int a = str.indexOf('a');//a = 2
//     3 int b = str.indexOf("good");//b = 7
//     4 int c = str.indexOf("w", 2);//c = -1
//     5 int d = str.lastIndexOf("a");//d = 5
//     6 int e = str.lastIndexOf("a", 3);//e = 2
//     复制代码
//
//     7、字符串中字符的大小写转换
//     1)public String toLowerCase ()//返回将当前字符串中所有字符转换成小写后的新串
//     2)public String toUpperCase ()//返回将当前字符串中所有字符转换成大写后的新串
//
//     1 String str = new String("asDF");
//     2 String str1 = str.toLowerCase();//str1 = "asdf"
//     3 String str2 = str.toUpperCase();//str2 = "ASDF"
//
//     8、字符串中字符的替换
//     1)public String replace ( char oldChar,
//     char newChar)//用字符newChar替换当前字符串中所有的oldChar字符，并返回一个新的字符串。
//     2)public String replaceFirst (String regex, String
//     replacement)//该方法用字符replacement的内容替换当前字符串中遇到的第一个和字符串regex相匹配的子串，应将新的字符串返回。
//     3)public String replaceAll (String regex, String
//     replacement)//该方法用字符replacement的内容替换当前字符串中遇到的所有和字符串regex相匹配的子串，应将新的字符串返回。
//
//     1 String str = "asdzxcasd";
//     2 String str1 = str.replace('a', 'g');//str1 = "gsdzxcgsd"
//     3 String str2 = str.replace("asd", "fgh");//str2 = "fghzxcfgh"
//     4 String str3 = str.replaceFirst("asd", "fgh");//str3 = "fghzxcasd"
//     5 String str4 = str.replaceAll("asd", "fgh");//str4 = "fghzxcfgh"
//
//     9、其他类方法
//     1)String trim ()//截去字符串两端的空格，但对于中间的空格不处理。
//
//     1 String str = " a sd ";
//     2 String str1 = str.trim();
//     3 int a = str.length();//a = 6
//     4 int b = str1.length();//b = 4
//
//     2)boolean statWith (String prefix)或boolean endWith (String
//     suffix)//用来比较当前字符串的起始字符或子字符串prefix和终止字符或子字符串suffix是否和当前字符串相同，重载方法中同时还可以指定比较的开始位置offset。
//
//     1 String str = "asdfgh";
//     2 boolean a = str.statWith("as");//a = true
//     3 boolean b = str.endWith("gh");//b = true
//
//     4)contains(String str)//判断参数s是否被包含在字符串中，并返回一个布尔类型的值。
//
//     1 String str = "student";
//     2 str.contains("stu");//true
//     3 str.contains("ok");//false
//
//     5)String[] split (String str)//将str作为分隔符进行字符串分解，分解后的字字符串在字符串数组中返回。
//
//     1 String str = "asd!qwe|zxc#";
//     2 String[] str1 = str.split("!|#");//str1[0] = "asd";str1[1] = "qwe";str1[2] = "zxc";
//
//   }
//
// }
