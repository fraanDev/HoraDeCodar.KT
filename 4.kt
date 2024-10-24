fun main() {
    // Área do Retângulo
    println("Cálculo da área do Retângulo:")
    print("Informe a base: ")
    val baseRetangulo = readLine()!!.toDouble()
    print("Informe a altura: ")
    val alturaRetangulo = readLine()!!.toDouble()
    val areaRetangulo = baseRetangulo * alturaRetangulo
    println("A área do retângulo é: $areaRetangulo\n")

    // Área do Quadrado
    println("Cálculo da área do Quadrado:")
    print("Informe o lado: ")
    val ladoQuadrado = readLine()!!.toDouble()
    val areaQuadrado = ladoQuadrado * ladoQuadrado
    println("A área do quadrado é: $areaQuadrado\n")

    // Área do Losango
    println("Cálculo da área do Losango:")
    print("Informe a diagonal maior: ")
    val diagonalMaior = readLine()!!.toDouble()
    print("Informe a diagonal menor: ")
    val diagonalMenor = readLine()!!.toDouble()
    val areaLosango = (diagonalMaior * diagonalMenor) / 2
    println("A área do losango é: $areaLosango\n")

    // Área do Trapézio
    println("Cálculo da área do Trapézio:")
    print("Informe a base maior: ")
    val baseMaior = readLine()!!.toDouble()
    print("Informe a base menor: ")
    val baseMenor = readLine()!!.toDouble()
    print("Informe a altura: ")
    val alturaTrapezio = readLine()!!.toDouble()
    val areaTrapezio = ((baseMaior + baseMenor) * alturaTrapezio) / 2
    println("A área do trapézio é: $areaTrapezio\n")

    // Área do Paralelogramo
    println("Cálculo da área do Paralelogramo:")
    print("Informe a base: ")
    val baseParalelogramo = readLine()!!.toDouble()
    print("Informe a altura: ")
    val alturaParalelogramo = readLine()!!.toDouble()
    val areaParalelogramo = baseParalelogramo * alturaParalelogramo
    println("A área do paralelogramo é: $areaParalelogramo\n")

    // Área do Triângulo
    println("Cálculo da área do Triângulo:")
    print("Informe a base: ")
    val baseTriangulo = readLine()!!.toDouble()
    print("Informe a altura: ")
    val alturaTriangulo = readLine()!!.toDouble()
    val areaTriangulo = (baseTriangulo * alturaTriangulo) / 2
    println("A área do triângulo é: $areaTriangulo\n")

    // Área do Círculo
    println("Cálculo da área do Círculo:")
    print("Informe o raio: ")
    val raio = readLine()!!.toDouble()
    val areaCirculo = 3.14159 * raio * raio
    println("A área do círculo é: $areaCirculo\n")
}
