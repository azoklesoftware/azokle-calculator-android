package net.azokle.calculator.data

enum class SimpleOperator(val text: String, val value: String) {
    Plus("+", "+"),
    Minus("‒", "-"),
    Multiply("×", "*"),
    Divide("÷", "/"),
    Percent("%", "%")
}

enum class SpecialOperator(val text: String, val value: String = text) {
    LBracket("("),
    RBracket(")"),

    E("e"),
    PI("π"),
    Sin("sin", "sin("),
    Cos("cos", "cos("),
    Tan("tan", "tan("),
    Ln("ln", "ln("),
    Log("log", "log("),
    PowerE("eˣ", "e^("),
    Square("x²", "^2"),
    SquareRoot("√", "√("),
    Absolute("|x|", "|"),
    Power("xʸ", "^("),

    ASin("sin⁻¹", "asin("),
    ACos("cos⁻¹", "acos("),
    ATan("tan⁻¹", "atan("),
    SinH("sinh", "sinh("),
    CosH("cosh", "cosh("),
    TanH("tanh", "tanh("),
    ASinH("sinh⁻¹", "asinh("),
    ACosH("cosh⁻¹", "acosh("),
    ATanH("tanh⁻¹", "atanh("),
    Power2("2ˣ", "2^("),
    Cube("x³", "^3"),
    Factorial("x!", "!")

}