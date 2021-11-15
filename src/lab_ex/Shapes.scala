package lab_ex

object Shapes {
  sealed trait Shape
  object Shape{

    case class Rectangle(long_side: Int, short_side: Int) extends Shape

    case class Circle(radius: Int) extends Shape

    case class Square(side: Int) extends Shape

    def perimeter(shape: Shape):Double = shape match{
      case Rectangle(long_side, short_side) => (long_side + short_side)*2
      case Circle(radius) => radius * 2 * math.Pi
      case Square(side) => side * 4
    }

    def area(shape: Shape):Double= shape match{
      case Rectangle(long_side, short_side) => long_side * short_side
      case Circle(radius) => radius * radius * math.Pi
      case Square(side) => side * side
    }
  }
}
