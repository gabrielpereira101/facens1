import java.util.Stack;

public class Controller {
    private Stack<CustomObject> customStack;

    public Controller() {
        // Inicializa a pilha
        customStack = new Stack<>();
    }

    public void start() {
        // Adiciona alguns objetos personalizados à pilha
        pushObject(new CustomObject("Object1"));
        pushObject(new CustomObject("Object2"));
        pushObject(new CustomObject("Object3"));

        // Remove um objeto da pilha
        popObject();

        // Visualiza o objeto no topo da pilha
        peekObject();
    }

    public void pushObject(CustomObject object) {
        // Adiciona o objeto à pilha
        customStack.push(object);
        System.out.println("Object " + object.getName() + " pushed to the stack.");
    }

    public void popObject() {
        // Remove o objeto do topo da pilha
        CustomObject poppedObject = customStack.pop();
        System.out.println("Object " + poppedObject.getName() + " popped from the stack.");
    }

    public void peekObject() {
        // Visualiza o objeto no topo da pilha sem removê-lo
        CustomObject peekedObject = customStack.peek();
        System.out.println("Object " + peekedObject.getName() + " is at the top of the stack.");
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}

class CustomObject {
    private String name;

    public CustomObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
