public class Auto {
    private String color;
    private String mark;
    private String model;
    private String number;
    private int year;
    private int id;

    public Auto(String color, String mark, String model, String number, int year) {
        this.color = color;
        this.mark = mark;
        this.model = model;
        this.number = number;
        this.year = year;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void show(){
        System.out.println("Марка: "+mark+"\n"+"Модель: "+model+"\n"+"Номер: "+number+"\n"+"Год: "+year+"\n"+"Цвет: "+color+"\n-------------\n");
    }
}
