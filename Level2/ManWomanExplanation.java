public static class Woman { // это класс Woman
    public int age; // это поля класса woman. Поле age класса int
    public int height; // поле height класса int
    public Man husband; // поле husband класса Man
}


public static void main(String[] args) {
    Woman woman = new Woman(); // ты создал новый объект класса Woman
    // и положил его в переменную под названием woman
    // чтобы обратиться к полю конкретного созданного объекта
    // надо через точку написать имя переменной и название поля
    // переменная.поле

    // Например
    woman.age = 25; // это означает, что в поле age женщины woman лежит число 25
    // точно также можно обратиться к полю husband
    // но чтобы туда положить объект класса Man, нужно его сначала создать
    Man man = new Man(); // создан новый объект класса Man и помещен в переменную man
    woman.husband = man; // содержимое переменной man кладем в поле husband объекта woman
}
