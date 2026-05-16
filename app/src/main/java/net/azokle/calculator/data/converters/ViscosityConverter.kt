package net.azokle.calculator.data.converters

import net.azokle.calculator.R

class ViscosityConverter : UnitConverter {
    override val units: List<ConverterUnit> = listOf(
        FactorUnit(R.string.pascal_second, 1.0),
        FactorUnit(R.string.centipoise, 0.01),
        FactorUnit(R.string.stoke, 1E4),
        FactorUnit(R.string.poiseuille, 1E9)
    )
}