
class LambdaBuilderExample {

  static class Car {
    public final String make;
    public final String model;
    public final int year;

    private Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
  }
  interface MakeBuilder {
    ModelBuilder make(String make);
  }
  interface ModelBuilder {
      YearBuilder model(String model);
  }
  interface YearBuilder {
      Car year(int year);
  }
  public static MakeBuilder car() {
    return make -> model -> year -> new Car(make, model, year);
  }

  public static void main(String[] args) {
    Car camaro = car()
      .make("Chevrolet")
      .model("Camaro")
      .year(1968);

    System.out.println(camaro);
  }
}
