import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Задача 1: Четное или нечетное число

//        System.out.println("Введите число:");
//        int a = in.nextInt();
//        if (a%2==0)
//            System.out.printf("Число %d четное!\n",a);
//        else
//            System.out.printf("Число %d не четное!\n",a);
//        in.close();


        //Задача 2: Минимальное из трех чисел

//        int first = in.nextInt();
//        int second = in.nextInt();
//        int third = in.nextInt();
//        if(first<=second && first<=third)
//            System.out.println(first);
//        else if(second<=first && second<=third)
//            System.out.println(second);
//        else System.out.println(third);
//        in.close();

        //Задача 3: Таблица умножения

//        for(int i=1;i<11;i++)
//            System.out.printf("%d*5=%d \n",i,i*5);


        //Задача 4: Сумма чисел от 1 до N
//        System.out.println("Введите конечное число. Введенное число не входит в сумму");
//        int end = in.nextInt();
//        int result = 0;
//        for(int i=1;i<end;i++)
//             result+=i;
//        System.out.println(result);
//        in.close();

        //Задача 5: Число Фибоначчи
//        System.out.println("Введите число.");
//        int end = in.nextInt();
//        int result = 0;
//        int a = 0;
//        int b=1;
//        for(int i=2;i<=end;i++) {
//            result=a+b;
//            a=b;
//            b=result;
//        }        System.out.println(result);
//        in.close();

        //Задача 6: Проверка простого числа

//        System.out.println("Введите число.");
//        int num = in.nextInt();
//        boolean ItsSimple = true;
//        if(num<=1) ItsSimple=false;
//        for(int i=2;i<num;i++) {
//            if (num % i == 0) {
//                ItsSimple = false;
//                break;
//            }
//        }
//        System.out.println(ItsSimple? "Число простое":"Данное число не является простым!\n");

        //Задача 7: Обратный порядок чисел

//        System.out.println("Введите число.");
//        int num = in.nextInt();
//            for (int i=num;i>=1;i--)
//                System.out.println(i);
//            for(int i=num;i<=1;i++)
//                System.out.println(i);

        //Задача 8: Сумма четных чисел
//        System.out.println("Введите первое число.");
//        int start = in.nextInt();
//        System.out.println("Введите конечное число.");
//        int end = in.nextInt();
//        int sum=0;
//
//        for (int i=start;i<=end;i++)
//            if (i%2==0)
//                sum+=i;
//
//        System.out.println(sum);

        //Задача 9: Реверс строки

//        System.out.println("Введите строку");
//        String input = in.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//        System.out.println("Обратная строка: " + reversed);
//        in.close();

        //Задача 10: Количество цифр в числе
//        System.out.println("Введите число");
//        int num = in.nextInt();
//        int count = 1;
//        while (num>9){
//            count++;
//            num=num/10;}
//        System.out.println(count);

        //Задача 11: Факториал числа
//        System.out.println("Введите число");
//        int num = in.nextInt();
//        int count = 1;
//        for(int i=1;i<=num;i++)
//            count=count*i;
//        System.out.println(count);

        //Задача 12: Сумма цифр числа

//        System.out.println("Введите число");
//        int num = in.nextInt();
//        int sum = 0;
//        int del=0;
//        while (num>9)
//        {
//            del=num%10;
//            num=num/10;
//            sum=sum+del;
//        }
//        sum=sum+num;
//        System.out.println(sum);

        //Задача 13: Палиндром
//        System.out.println("Введите строку");
//        String str = in.nextLine().toLowerCase();
//        boolean palinrom = true;
//            for(int i=0;i<str.length();i++)
//            {
//                    if(str.charAt(i)!=str.charAt(str.length()-1-i))
//                {
//                    palinrom=false;
//                    break;
//                }
//            }
//
//        System.out.println(palinrom? "Данное слово является палиндромом":"Данное слово НЕ является палиндромом");
//
//        in.close();

        //Задача 14: Найти максимальное число в массиве
//        System.out.println("Введите количество чисел, среди которых необходимо найти максимальное!");
//        int end = in.nextInt();
//        if(end<=0)
//            System.out.println("Число должно быть больше 0");
//        else
//        {
//            int[] nums = new int[end];
//            for(int i=0;i<end;i++){
//                System.out.println("Введите число");
//                nums[i] = in.nextInt();
//            }
//            System.out.println(Arrays.stream(nums).max().getAsInt());
//        }

        //Задача 15: Сумма всех элементов массива
//        System.out.println("Введите количество чисел, сумму которых необходимо найти!");
//        int end = in.nextInt();
//        if(end<=0)
//            System.out.println("Число должно быть больше 0");
//        else//сумму можно либо вычислить встроенной функцией или суммировать каждый введенный элемент
//        {
//            int sum = 0;
//            int[] nums = new int[end];
//            for(int i=0;i<end;i++){
//                System.out.println("Введите число");
//                int num= in.nextInt();
//                nums[i] = num;
//                sum=sum+num;
//            }
//            System.out.println(sum+"или"+ Arrays.stream(nums).sum());
//        }

        //Задача 16: Количество положительных и отрицательных чисел
//        System.out.println("Введите количество рассматриваеммых чисел!");
//        int end = in.nextInt();
//        if(end<=0)
//            System.out.println("Число должно быть больше 0");
//        else
//        {
//            int sumPlus = 0;
//            int sumMinus = 0;
//            int[] nums = new int[end];
//            for(int i=0;i<end;i++){
//                System.out.println("Введите число");
//                int num= in.nextInt();
//                nums[i] = num;
//                if(num>=0)
//                    sumPlus++;
//                if (num<0)
//                    sumMinus++;
//            }
//            System.out.printf("Количество положительных чисел: %d\n",sumPlus);
//            System.out.printf("Количество отрицательных чисел: %d\n",sumMinus);

            //Задача 17: Простые числа в диапазоне
//            System.out.println("Введите число");
//            int num1 = in.nextInt();
//            System.out.println("Введите число");
//            int num2 = in.nextInt();
//            int start,end;
//            if (num1<=num2)
//            {
//                start = num1;
//                end = num2;
//            }
//            else
//            {
//                start = num2;
//                end = num1;
//            }
//            for (int i = start; i<=end;i++)
//            {
//                boolean IsSimple = true;
//
//                for (int j= 2; j<end;j++)
//                {
//                    if ((i%j==0 || i<=0) && i!=j)
//                    {
//                        IsSimple=false;
//                        break;
//                    }
//                }
//                if (IsSimple)
//                    System.out.println(i);
//            }


            //Задача 18: Подсчет гласных и согласных в строке
//        char[] Glas ={'a','e','i','o','u','а','о','у','э','и','ы','е'};//русские и англ. гласные
//        int sumGlas=0;
//        int sumSogl=0;
//        boolean Stop=false;
//        System.out.println("Введите строку без пробелов.");
//        String str = in.nextLine();
//        for (int i=0;i<=str.length()-1;i++)
//        {
//            if(!Character.isLetter(str.charAt(i)))
//            {
//                Stop = true;
//                System.out.println("Строка не должна содержать пробелов или чисел");
//                break;
//            }
//            else
//            {
//                char letter = str.charAt(i);
//                for(int j = 0; j<=Glas.length-1;j++)
//                {
//                    if(letter==Glas[j])
//                        sumGlas++;
//                }
//            }
//        }
//        sumSogl = str.length()-sumGlas;
//        if(!Stop)
//        {
//            System.out.printf("Количество согласных в строке: %d\n",sumSogl);
//            System.out.printf("Количество гласных в строке: %d\n",sumGlas);
//        }

            //Задача 19: Перестановка слов в строке
//        System.out.println("Введите слова, разделенные пробелом");
//        String text = in.nextLine();
//        String[] words = text.split(" ");
//        for (int i =words.length-1; i>=0;i--)
//            System.out.print(words[i]+" ");

            //Задача 20: Число Армстронга
        System.out.println("Введите число");
        int num = in.nextInt();
        int isrealnum=num;
        int sum = 0;
        int degree = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10; // Получаем последнюю цифру
            sum += (int)Math.pow(digit, degree);
            num /= 10; // Убираем последнюю цифру
        }
        if (sum==isrealnum)
            System.out.println("Данное число является числом Амстронга");
        else
            System.out.println("Данное число НЕ является числом Амстронга");

    }


    }