package u02
import lab_ex.Shapes
import lab_ex.Shapes.Shape.{Circle, Rectangle, Square, area, perimeter}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestShape {
  @Test def RectangleShape{
    var long_side= 6
    var short_side= 3
    val rectangle = Rectangle(long_side,short_side)
    assertEquals((long_side+short_side)*2,perimeter(rectangle))
    assertEquals(short_side*long_side,area(rectangle))
  }
  @Test def CircleShape{
    var radius=3
    val circle = Circle(3)
    assertEquals(radius * 2 * math.Pi,perimeter(circle))
    assertEquals(radius * radius * math.Pi,area(circle))
  }
  @Test def SquareShape{
    var side=4
    val square = Square(side)
    assertEquals(side * 4,perimeter(square))
    assertEquals(side * side,area(square))
  }
}
