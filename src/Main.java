import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Main {
    @RunWith(Parameterized.class)
    public class CheckIsAdultTest {

        private final int age;
        private final boolean result;

        public CheckIsAdultTest(int age, boolean result) {
            this.age = age;
            this.result = result;// Инициализируй поля класса в конструкторе
        }

        @Parameterized.Parameters // Пометь метод аннотацией для параметров
        public static Object[][] getTextData() {
            return new Object[][] {
                    { 17, false},
                    { 21, true},
                    { 18, true},
                    { 19, true},
                    // Заполни массив тестовыми данными и ожидаемым результатом
            };
        }

        @Test
        public void checkIsAdultWhenAgeThenResult() {
            Program program = new Program();
            // Передай сюда возраст пользователя
            boolean isAdult = program.checkIsAdult(age);
}
