package library;

public interface Library {
  void borrowItem(String memberName);
  void returnItem();
  String getDetails();
}
