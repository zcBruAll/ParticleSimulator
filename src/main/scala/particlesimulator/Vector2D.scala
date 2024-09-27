package particlesimulator

final case class Vector2D(x: Double, y: Double) {
    def +(other: Vector2D) = Vector2D(x + other.x, y + other.y)
    def *(scalar: Double) = Vector2D(x * scalar, y * scalar)
}
