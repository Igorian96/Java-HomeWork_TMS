package home_work_interface_abstract.task3;
//изучить и показать пример работы интерфейса-маркера Cloneable
public class Point implements Cloneable {
    int x;
    int y;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
