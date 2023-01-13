class Main {
  public static void main(String[] args) {
      Hotel cali = new Hotel("Hotel Cali", 3);  
      cali.requestRoom("Isaac");
      cali.requestRoom("Mya");
      cali.requestRoom("Bryan");
      cali.requestRoom("Eugene McKraglestein");
      cali.printCurrentReservations();
      cali.printCurrentWaitlist();
      cali.cancelAndReassign(cali.reservation(2));
      cali.printCurrentReservations();
      cali.printCurrentWaitlist();
      cali.cancelAndReassign(cali.reservation(2));
      cali.printCurrentReservations();
      cali.printCurrentWaitlist();
  }
}