public class ClassTime {
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    public ClassTime(int startHour, int startMinute, int endHour, int endMinute) {
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }

    public void getClassTime() {
        System.out.println(startHour + ":" + startMinute + " - " + endHour + ":" + endMinute);
    }

}
