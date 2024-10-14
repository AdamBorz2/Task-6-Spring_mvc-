package web.config;

public class Car {

        private Long id;
        private String brand;
        private int year;

        // Конструктор по умолчанию (необходим для Jackson)
        public Car() {
        }

        // Конструктор с параметрами
        public Car(Long id, String brand, int year) {
            this.id = id;
            this.brand = brand;
            this.year = year;
        }

        // Геттеры и сеттеры
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        // Переопределение метода toString для удобства вывода
        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    ", brand='" + brand + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

