package geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
      /*  User user = new User("Воронцов Петр Алексеевич", "Директор", "Voroncov.P@mail.ru", 3832222, 60000, 35);
        user.info(); */
       User userArray[] = new User[5];
        userArray[0] = new User("Акерманис Андрис Георгиевич", "Электрик", "Andris.Akermanis@gmail.com", 3432542, 35000, 28);
        userArray[1] = new User("Салтыкова Евгения Алексеевна", "Вахтер", "Beregovaya.777@list.ru", 3435742, 27000, 28);
        userArray[2] = new User("Большаков Игорь Анатольевич", "IT-специалист", "BigBoss@bk.ru", 3430027, 45000,41);
        userArray[3] = new User("Лаптева Ксения Александровна", "Секретарь", "LaptevaKseniya@gmail.com", 38347332,1000000, 21);
        userArray[4] = new User("Иванова Анастасия Батьковна", "Web-разработчик", "NastenkaAuf@mail.ru", 3232265, 41000, 47);

        for (int i = 0; i< userArray.length; i++) {
            if(userArray[i].age>40) {
                userArray[i].info();
            }
            
        }

    }
}
