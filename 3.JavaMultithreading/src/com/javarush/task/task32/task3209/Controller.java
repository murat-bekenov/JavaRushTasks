package com.javarush.task.task32.task3209;

/*
* 1.1. Объяви класс Controller и класс View.
* Класс View должен быть унаследован от JFrame и реализовывать интерфейс ActionListener.

1.2. Добавь в класс Controller поля,
отвечающие за представление View view и модель HTMLDocument document.
Здесь и далее, классы, которые мы не объявляли,
но используем в коде скорее всего все находятся в библиотеке swing.
Например, класс HTMLDocument реализован в пакете javax.swing.text.html.

1.3. Добавь в класс Controller поле, которое будет отвечать за файл,
который сейчас открыт в нашем редакторе (текущий файл) File currentFile.

1.4. Добавь конструктор класса Controller.
Он должен принимать в качестве параметра представление и инициализировать
 соответствующее поле класса.

1.5. Добавь в Controller пустой метод main.
1.6. Добавь в класс View поле Controller controller.
1.7. Добавь в класс View сеттер и геттер для поля controller.
1.8. Добавь пустую реализацию метода, который объявлен в интерфейсе ActionListener.*/

import javax.swing.text.html.HTMLDocument;
import java.io.File;

public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {

    }
}
