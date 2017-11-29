/**
 * created by Vitaha
 * skype: dp100991svi
 */

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (true) {
                menu();
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректные данные");
            scanner.close();
        }
    }


    static void menu() throws NumberFormatException {
        System.out.println("Вычислить площадь и периметр:\n1.Круга\n2.Треугольника\n3.Квадрата\n4.Прямоугольника\n5.Выход из программы");
        String x = scanner.nextLine();
        switch (x) {
            case "1":
                System.out.println("Введите радиус круга:");
                String r = scanner.nextLine();
                AbstractFigure circle = new Circle(FiguresType.CIRCLE, r);
                System.out.println(circle.toString());
                break;
            case "2":
                System.out.println("Введите первую из трех сторон треугольника:");
                String l1 = scanner.nextLine();
                System.out.println("Введите вторую из трех сторон треугольника:");
                String l2 = scanner.nextLine();
                System.out.println("Введите третью из трех сторон треугольника:");
                String l3 = scanner.nextLine();
                AbstractFigure triangle = new Triangle(FiguresType.TRIANGLE, l1, l2, l3);
                System.out.println(triangle.toString());
                break;
            case "3":
                System.out.println("Введите сторону квадрата:");
                String s1 = scanner.nextLine();
                AbstractFigure square = new Square(FiguresType.SQUARE, s1);
                System.out.println(square.toString());
                break;
            case "4":
                System.out.println("Введите первую сторону прямоугольника:");
                String rec1 = scanner.nextLine();
                System.out.println("Введите первую сторону прямоугольника:");
                String rec2 = scanner.nextLine();
                AbstractFigure rectangle = new Rectangle(FiguresType.RECTANGLE, rec1, rec2);
                System.out.println(rectangle.toString());
                break;
            case "5":
                System.out.println("Всего доброго!");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Выбор пункта меню неправильный, попробуйте ещё раз");
        }
    }
}

//проверочка
//                List<AbstractFigure> abstractFigures = new ArrayList<AbstractFigure>();
//                abstractFigures.add(new Circle(FiguresType.CIRCLE, "4"));
//                abstractFigures.add(new Square(FiguresType.SQUARE, "4"));
//                abstractFigures.add(new Rectangle(FiguresType.RECTANGLE, "10", "5"));
//                abstractFigures.add(new Triangle(FiguresType.TRIANGLE, "10", "12", "15"));
//
//                for (AbstractFigure abstractFigure : abstractFigures) {
//                System.out.println(abstractFigure.toString());
//                }

//заюзал интерфейс Comparable
//                List<Square> squares = new ArrayList<>();
//                squares.add(new Square(FiguresType.SQUARE, "5"));
//                squares.add(new Square(FiguresType.SQUARE, "8"));
//                squares.add(new Square(FiguresType.SQUARE, "3"));
//                squares.add(new Square(FiguresType.SQUARE, "1"));
//
//                squares.forEach(System.out::println);
//                Collections.sort(squares);
//                System.out.println();
//                squares.forEach(System.out::println);

//сериализация
//                File file = new File("src\\main\\resources\\Square.dat");
//                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
//                Square s = new Square(FiguresType.SQUARE, "10");
//                oos.writeObject(s);
//                oos.flush();
//                } catch (Exception e) {
//                System.out.println(e.getMessage());
//                }
//
//
//                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\resources\\Square.dat"))) {
//                Square s = (Square) ois.readObject();
//                System.out.println(s.toString());
//                } catch (Exception e) {
//                System.out.println(e.getMessage());
//                }

//ещё один вариант сериализации
//                File file = new File("src\\main\\resources\\Square.dat");
//                try (Writer writer = new FileWriter(file)) {
//                Square s = new Square(FiguresType.SQUARE, "10");
//                writer.write(s.toString());
//                writer.flush();
//                } catch (Exception e) {
//                System.out.println(e.getMessage());
//                }

//тест компаратора
//                List<Square> squareList = new ArrayList<>();
//                squareList.add(new Square(FiguresType.SQUARE,"8"));
//                squareList.add(new Square(FiguresType.SQUARE,"1"));
//                squareList.add(new Square(FiguresType.SQUARE,"3"));
//                squareList.add(new Square(FiguresType.SQUARE,"4"));
//                squareList.add(new Square(FiguresType.SQUARE,"6"));
//                squareList.add(new Square(FiguresType.SQUARE,"2"));
//                squareList.add(new Square(FiguresType.SQUARE,"5"));
//                squareList.add(new Square(FiguresType.SQUARE,"9"));
//
//                squareList.forEach(System.out::println);
//                squareList.sort(Square::squareComparator);
//                System.out.println();
//                squareList.forEach(System.out::println);