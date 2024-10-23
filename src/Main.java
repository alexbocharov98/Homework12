public class Main {
        public static void main(String[] args) {
            Author aPushkin = new Author("Александр", "Пушкин");
            Author lTolstoy = new Author("Лев", "Толстой");
            Book evgeniiOnegin = new Book("Евгений Онегин", 1975, aPushkin);
            Book voinaIMir = new Book("Война и мир", 2001, lTolstoy);
            evgeniiOnegin.setYearPublication(1980);
            voinaIMir.setYearPublication(2020);
            System.out.print(evgeniiOnegin.getNameBook() + " ");
            System.out.print(evgeniiOnegin.getAuthor() + " ");
            System.out.println(evgeniiOnegin.getYearPublication());
            System.out.print(voinaIMir.getNameBook() + " ");
            System.out.print(voinaIMir.getAuthor() + " ");
            System.out.println(voinaIMir.getYearPublication());
    }
}