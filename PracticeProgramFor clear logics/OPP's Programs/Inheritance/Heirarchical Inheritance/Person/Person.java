class Person{
    String name,gender;
    int age;
    Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person otherPerson = (Person) obj;
            return this.name.equals(otherPerson.name) &&
            this.age == otherPerson.age &&
            this.gender.equals(otherPerson.gender);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
        }
}