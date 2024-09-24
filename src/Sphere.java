class SpherePractice {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double areaOfSphere() {
        return 4 * Math.PI * radius * radius;
    }

    public double volumeOfSphere() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

class Sphere {
    public static void main(String[] args) {
        SpherePractice mySphere = new SpherePractice();
        mySphere.setRadius(5);
        System.out.println("Radius of the Sphere is: " + mySphere.getRadius());
        System.out.println("Volume of the Sphere is: "+mySphere.volumeOfSphere());
        System.out.println("Area of the Sphere is: "+mySphere.areaOfSphere());
    }
}
