class StudentInfo {
    String name;
    int age;
    int Id;

    public StudentInfo(String name, int age, int Id) {
        this.name = name;
        this.age = age;
        this.Id = Id;
    }

    public void show() {
        System.out.println("name:" + this.name);
        System.out.println("age: " + this.age);
        System.out.println("Id: " + this.Id);
    }

    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("Anwar", 24, 1);
        student1.show();
    }
}
