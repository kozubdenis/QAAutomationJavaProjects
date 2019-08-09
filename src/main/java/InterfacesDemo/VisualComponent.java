package InterfacesDemo;

public interface VisualComponent {
    void draw();

    default void draw3D() {
        System.out.println ("My 3DComponent");
    }

}
