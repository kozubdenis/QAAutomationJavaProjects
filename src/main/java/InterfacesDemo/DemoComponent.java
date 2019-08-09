/*
1) Добавить в иерархию классов Component новый интерфейс VisualComponent
	унаследовать класс Component от VisualComponent
	(Component implements VisualComponent)
	Интерфейс VisualComponent должен иметь один метод:
		- void draw();
		-продемонстрировать работу метода draw() у всех компонентов
2) Добавить новый метод по умолчанию в VisualComponent
		- default void draw3D(); //
	унаследовать класс Component от VisualComponent
		- перекрыть метод draw3D у Label
		- продемонстрировать работу метода draw3D() во всех компонентах
 */

package InterfacesDemo;

public class DemoComponent {
    public static void main(String[] args){
        Component1 cmp1 = new Component1();
        Component2 cmp2 = new Component2();
        Component3 cmp3 = new Component3();

        cmp1.draw();
        cmp2.draw();
        cmp3.draw();

        cmp1.draw3D();
        cmp2.draw3D();
        cmp3.draw3D();

    }
}
