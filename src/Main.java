public class Main {
   /* 9. Число-палиндром
    Дано целое число x, вернуть, true если x это палиндром, и false в противном случае.

    Пример 1:
    Ввод: x = 121
    Вывод: true
    Пояснение: 121 читается как 121 слева направо и справа налево.

    Пример 2:
    Ввод: x = -121
    Вывод: false
    Пояснение: Слева направо читается как -121. Справа налево становится 121-. Поэтому это не палиндром.

    Пример 3:
    Ввод: x = 10
    Вывод: false
    Пояснение: Читает 01 справа налево. Следовательно, это не палиндром.*/
    public static boolean isPalindrome(int x) {
        String numberString = Integer.toString(x);
        char[] array = numberString.toCharArray();
        boolean flag = true;
        for(int i=0;i<array.length/2+1;i++){
            if(array[i]!=array[array.length-1-i]){
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));;
    }
}