public class Main {
    public static void main(String[] args) {
        // Пример сотрудников
        Employee[] employees = {
                new Employee("Василий", Gender.MALE),
                new Employee("Мария", Gender.FEMALE),
                new Employee("Алексей", Gender.MALE),
                new Employee("Ольга", Gender.FEMALE)
        };

        // Поздравляем сотрудников
        congratulateEmployees(employees);
    }

    public static void congratulateEmployees(Employee[] employees) {
        // Определяем текущую дату
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int month = calendar.get(java.util.Calendar.MONTH) + 1;
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        for (Employee employee : employees) {
            if (month == 1 && day == 1) { // Новый Год
                System.out.println("С Новым Годом, " + employee.getName() + "!");
            } else if (month == 3 && day == 8 && employee.getGender() == Gender.FEMALE) { // 8 марта
                System.out.println("С 8 марта, " + employee.getName() + "!");
            } else if (month == 2 && day == 23 && employee.getGender() == Gender.MALE) { // 23 февраля
                System.out.println("С 23 февраля, " + employee.getName() + "!");
            }
        }
    }
}