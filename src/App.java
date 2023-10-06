public class App {
    public static void main(String[] args) throws Exception {
        String name = "Artur";
        int age = 27;
        System.out.println("Ola, meu nome é " + name + "e minha idade é " + age);
        System.out.println("Helloasd, World!");
        String message = """
                Olá, meu nome é %s, e minha idade é %d, atualmente estou aprendendo %s
                """.formatted(name, age, "java");

                System.out.println(message);
    }
}
