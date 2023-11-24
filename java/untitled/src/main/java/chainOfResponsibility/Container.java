package chainOfResponsibility;


import java.util.ArrayList;

/**
 * Контейнеры могут включать в себя как простые компоненты,
 * так и другие контейнеры. Здесь формируются связи цепочки.
 * Класс унаследует метод showHelp от своего родителя.
 */
public abstract class Container extends Component{
    protected ArrayList<Component> children;

    public void add(Component child){
        if (children==null){
            this.children = new ArrayList<>();
        }
        children.add(child);
        child.container = this;
    }
}
