package vytautas.dev.todocompose.data.models

import androidx.compose.ui.graphics.Color
import vytautas.dev.todocompose.ui.theme.HighPriorityColor
import vytautas.dev.todocompose.ui.theme.LowPriorityColor
import vytautas.dev.todocompose.ui.theme.MediumPriorityColor
import vytautas.dev.todocompose.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}