package com.pluralsight;

    public class Person implements Comparable<Person> {

        private String firstName;
        private String lastName;
        private int age;

        // Constructor
        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        // Getters
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        // Setters
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return this.lastName.compareToIgnoreCase(other.lastName);
        }

        @Override
        public String toString() {
            return String.format("%-12s %-12s age %d", lastName + ",", firstName, age);
        }
    }

