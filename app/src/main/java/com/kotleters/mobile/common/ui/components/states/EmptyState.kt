package com.kotleters.mobile.common.ui.components.states

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EmptyState() {

   Box(
       modifier = Modifier.fillMaxWidth()
           .height(500.dp),
       contentAlignment = Alignment.Center
   ){
       Text("Здесь пока ничего нет", fontSize = 16.sp, color = Color.White.copy(0.7f))
   }

}