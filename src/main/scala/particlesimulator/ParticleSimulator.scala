package particlesimulator

object ParticleSimulator {
  def main(args: Array[String]): Unit = {
    initParticleSimulator()
    test()
  }

  def initParticleSimulator(): Unit = {
    var particle1: Particle = new Particle(1, 2, 3, 4, 5)
    println(particle1)
  }
}