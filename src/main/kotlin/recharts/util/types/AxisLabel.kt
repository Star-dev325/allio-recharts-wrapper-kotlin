package recharts.util.types

import recharts.kotlin.Union

sealed class AxisLabel(name: kotlin.String, ordinal: Int) : Union<AxisLabel>(name, ordinal) {
    data class Number(val value: kotlin.Number) : AxisLabel("Number", 0)
    data class Object(val value: kotlinext.js.Object) : AxisLabel("Object", 1)
    data class ReactElement(val value: react.ReactElement) : AxisLabel("ReactElement", 2)
    data class String(val value: kotlin.String) : AxisLabel("String", 3)

    companion object {
        fun valueOf(value: kotlin.String): AxisLabel {
            throw IllegalArgumentException()
        }

        fun values(): Array<AxisLabel> = arrayOf()
    }
}
