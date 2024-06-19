public class Main {
    public static void main(String[] args) {

        ObjactCreater ObjectCreator = null;
        Event event = ObjectCreator.createObj(Event.class);


        System.out.println("Event start date: " + event.getStartDateString());
        System.out.println("Event end date: " + event.getExpirationDateString());


    }
}