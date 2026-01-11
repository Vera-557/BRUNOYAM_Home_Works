package HomeWork8.Middle.First;
/*
Создайте свою библиотеку.
Библиотека должна уметь принимать и отдавать материалы. Материалы — это не только книги, но еще газеты, журналы,
научные труды и т.д. Если в библиотеке нет нужной книги, то она должна вывести на консоль сообщение, что на данный
момент книги такой нет. Если книга появилась, то библиотека должна вывести на консоль соответствующее сообщение.
Также библиотека должна показывать, сколько книг имеется в данный момент.
 */

public class MiddleFirst {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавляем материалы в библиотеку
        System.out.println("=== ДОБАВЛЕНИЕ МАТЕРИАЛОВ ===");
        library.addMaterial(new Book("B001", "Мастер и Маргарита", "Михаил Булгаков", 1966));
        library.addMaterial(new Book("B002", "Преступление и наказание", "Федор Достоевский", 1866));
        library.addMaterial(new Magazine("M001", "Наука и жизнь", 5, "Научное издательство"));
        library.addMaterial(new Newspaper("N001", "Ежедневные новости", "Иванов И.И."));
        library.addMaterial(new ResearchPaper("R001", "Искусственный интеллект в медицине",
                "Медицинская информатика", "МГУ", 45));
        library.addMaterial(new Book("B001", "Дубликат", "Тест", 2000)); // Проверка дублирования

        // Показываем статистику
        library.showStatistics();

        // Пытаемся взять материалы
        System.out.println("=== ВЫДАЧА МАТЕРИАЛОВ ===");
        library.takeMaterial("B001"); // Успешно
        library.takeMaterial("B001"); // Уже выдан
        library.takeMaterial("B999"); // Не существует

        // Возвращаем материал
        System.out.println("=== ВОЗВРАТ МАТЕРИАЛОВ ===");
        library.returnMaterial("B001"); // Успешно
        library.returnMaterial("B999"); // Не существует

        // Поиск материалов
        System.out.println("=== ПОИСК МАТЕРИАЛОВ ===");
        System.out.println("Поиск по названию 'наука':");
        Material[] searchResults = library.searchByTitle("наука");
        for (Material material : searchResults) {
            System.out.println("  Найдено: " + material);
        }

        System.out.println("\nПоиск по типу 'Книга':");
        Material[] books = library.searchByType("Книга");
        for (Material material : books) {
            System.out.println("  Найдено: " + material);
        }
        // Финальная статистика
        library.showStatistics();
    }
}



