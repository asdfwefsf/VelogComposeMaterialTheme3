package com.company.velogmaterialtheme.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val customShapes1 = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(32.dp),
    extraLarge = RoundedCornerShape(64.dp)
)

val customShapes2 = Shapes(
    extraSmall = CutCornerShape(4.dp),
    small = CutCornerShape(8.dp),
    medium = CutCornerShape(16.dp),
    large = CutCornerShape(32.dp),
    extraLarge = CutCornerShape(64.dp)
)

