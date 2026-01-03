package HomeWork8.Middle.First;
/*
Создайте свою библиотеку.
Библиотека должна уметь принимать и отдавать материалы. Материалы — это не только книги, но еще газеты, журналы,
научные труды и т.д. Если в библиотеке нет нужной книги, то она должна вывести на консоль сообщение, что на данный
момент книги такой нет. Если книга появилась, то библиотека должна вывести на консоль соответствующее сообщение.
Также библиотека должна показывать, сколько книг имеется в данный момент.
 */
 class Library {
    private Material[] materials;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Library() {
        materials = new Material[INITIAL_CAPACITY];
        size = 0;
    }

    // Вспомогательный метод для расширения массива при необходимости
    private void ensureCapacity() {
        if (size >= materials.length) {
            Material[] newArray = new Material[materials.length * 2];
            System.arraycopy(materials, 0, newArray, 0, size);
            materials = newArray;
        }
    }

    // Добавить материал в библиотеку
    public void addMaterial(Material material) {
        // Проверяем, нет ли уже материала с таким ID
        for (int i = 0; i < size; i++) {
            if (materials[i].getId().equals(material.getId())) {
                System.out.println("✗ Материал с ID '" + material.getId() + "' уже существует");
                return;
            }
        }

        ensureCapacity();
        materials[size] = material;
        size++;
        System.out.println("✓ Материал добавлен: " + material.getTitle());
    }

    // Найти материал по ID
    private Material findMaterialById(String materialId) {
        for (int i = 0; i < size; i++) {
            if (materials[i].getId().equals(materialId)) {
                return materials[i];
            }
        }
        return null;
    }

    // Взять материал из библиотеки
    public boolean takeMaterial(String materialId) {
        Material material = findMaterialById(materialId);

        if (material == null) {
            System.out.println("✗ На данный момент материала с ID '" + materialId + "' нет в библиотеке");
            return false;
        }

        if (!material.isAvailable()) {
            System.out.println("✗ Материал '" + material.getTitle() + "' уже выдан");
            return false;
        }

        material.setAvailable(false);
        System.out.println("✓ Материал выдан: " + material.getTitle());
        return true;
    }

    // Вернуть материал в библиотеку
    public boolean returnMaterial(String materialId) {
        Material material = findMaterialById(materialId);

        if (material == null) {
            System.out.println("✗ Материал с ID '" + materialId + "' не принадлежит этой библиотеке");
            return false;
        }

        if (material.isAvailable()) {
            System.out.println("✗ Материал '" + material.getTitle() + "' уже находится в библиотеке");
            return false;
        }

        material.setAvailable(true);
        System.out.println("✓ Материал возвращен: " + material.getTitle());
        return true;
    }

    // Поиск материала по названию
    public Material[] searchByTitle(String title) {
        int count = 0;
        // Сначала подсчитываем количество совпадений
        for (int i = 0; i < size; i++) {
            if (materials[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                count++;
            }
        }

        // Создаем массив нужного размера
        Material[] found = new Material[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (materials[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                found[index++] = materials[i];
            }
        }

        return found;
    }

    // Поиск материала по типу
    public Material[] searchByType(String type) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (materials[i].getType().equalsIgnoreCase(type)) {
                count++;
            }
        }

        Material[] found = new Material[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (materials[i].getType().equalsIgnoreCase(type)) {
                found[index++] = materials[i];
            }
        }

        return found;
    }

    // Получить количество материалов
    public int getTotalMaterialsCount() {
        return size;
    }

    // Получить количество доступных материалов
    public int getAvailableMaterialsCount() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (materials[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    // Получить количество выданных материалов
    public int getBorrowedMaterialsCount() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!materials[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    // Показать статистику
    public void showStatistics() {
        int availableCount = getAvailableMaterialsCount();
        int borrowedCount = getBorrowedMaterialsCount();

        // Считаем материалы по типам
        int books = 0, magazines = 0, newspapers = 0, papers = 0;

        for (int i = 0; i < size; i++) {
            String type = materials[i].getType();
            switch (type) {
                case "Книга": books++; break;
                case "Журнал": magazines++; break;
                case "Газета": newspapers++; break;
                case "Научный труд": papers++; break;
            }
        }

        System.out.println("\n=== СТАТИСТИКА БИБЛИОТЕКИ ===");
        System.out.println("Всего материалов: " + size);
        System.out.println("Доступно для выдачи: " + availableCount);
        System.out.println("Выдано: " + borrowedCount);
        System.out.println("\nПо типам материалов:");
        if (books > 0) System.out.println("  Книги: " + books);
        if (magazines > 0) System.out.println("  Журналы: " + magazines);
        if (newspapers > 0) System.out.println("  Газеты: " + newspapers);
        if (papers > 0) System.out.println("  Научные труды: " + papers);
        System.out.println("===========================\n");
    }



}
