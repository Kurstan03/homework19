public enum Days {
    MONDAY("Дуйшонбу куну жава окуйм"),
    TUESDAY("Шейшемби куну ангилис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби куну англис тили talking club сабагын окум"),
    THURSDAY("Бейшемби куну soft skills сабагын окум"),
    FRIDAY("Жума куну event'ке катышам"),
    SATURDAY("Ишемби куну жумушка барам"),
    SUNDAY("Жекшемби куну эс алам");
    private String word;

    Days(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
