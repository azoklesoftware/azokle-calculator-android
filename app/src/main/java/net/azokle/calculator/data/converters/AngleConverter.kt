package net.azokle.calculator.data.converters

import net.azokle.calculator.R

class AngleConverter : UnitConverter {
    override val units: List<ConverterUnit> = listOf(
        FactorUnit(R.string.degree, Math.PI / 180),
        FactorUnit(R.string.radian, 1.0),
        FactorUnit(R.string.gradian, Math.PI / 200),
        FactorUnit(R.string.turn, 2 * Math.PI)
    )
}

