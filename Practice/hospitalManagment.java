abstract class Patient{
  int patientID;
  String name;
  int age;

  public Patient( int patientID, String name, int age){
    this.patientID = patientID;
    this.name = name;
    this.age = age;
  }

  public abstract double calculateBill();

  public void displayDetails(){
    System.out.println("patientID: " + patientID + "\nName: " + name + "\nAge: " + age);
  };
}

class InPatient extends Patient{
  public float roomCharges, treatmentChargers, medicineCharges;
  public InPatient(int roomCharges, int treatmentChargers, int medicineCharges){
    super(patientID, name, age);
    this.roomCharges = roomCharges;
    this.treatmentChargers = treatmentChargers;
    this.medicineCharges = medicineCharges;
  }
  @Override
  public double calculateBill(){
    return roomCharges + treatmentChargers + medicineCharges;
  }
}

class OutPatient extends Patient{
  public float counsultaionFee, medicineCharges;
  public double calculateBill(){
    return counsultaionFee + medicineCharges;
  }
}

class EmergencyPatient extends Patient{
  public float counsultaionFee, medicineCharges;
  public double calculateBill(){
    return counsultaionFee + medicineCharges;
  }
}

public class hospitalManagment {
  public static void main(String[] args){

  }
}
