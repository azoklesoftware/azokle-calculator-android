package net.azokle.calculator.data.converters

interface UnitConverter {
    val units: List<ConverterUnit>

    fun convertAll(value: Double, unit: ConverterUnit): List<Pair<ConverterUnit, Double>> {
        return units.map {
            it to unit.convert(it, value)
        }
    }
}