class constructors {
    String name;

    // Constructor
    constructors(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        constructors s1 = new constructors("Vishnu");
        s1.display();
    }
}