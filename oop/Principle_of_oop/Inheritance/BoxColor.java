// Hierarchical Inheritance
public class BoxColor extends  BoxWeight{
   double color;
    public BoxColor(double l, double h, double w, double weight ,double color) {
        super(l, h, w, weight);
        this.color=color;
    }
}

/*
 Multiple Inheritance - we don't have multiple inheritance in java
 */
/*
 Hybrid inheritance - combination of both single and multiple inheritance,
and since multiple inheritance is not supported in java, so it is also not
 supported in java
 */
