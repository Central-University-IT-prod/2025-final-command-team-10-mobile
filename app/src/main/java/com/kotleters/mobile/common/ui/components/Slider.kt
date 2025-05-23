package com.kotleters.mobile.common.ui.components

import android.graphics.pdf.models.ListItem
import androidx.annotation.StyleRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kotleters.mobile.common.ui.extensions.noRippleClickable
import com.kotleters.mobile.common.ui.theme.lightGray
import com.kotleters.mobile.common.ui.theme.secondaryGray
import com.kotleters.mobile.feature.client.domain.entity.TargetInfo

@Composable
fun Slider(
    items: List<Pair<TargetInfo.Gender?, String>>,
    chosen: TargetInfo.Gender?,
    chooseItem: (TargetInfo.Gender?) -> Unit
) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(secondaryGray)
            .padding(8.dp)
    ) {
        items.forEach {
            Box(
                Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .background(if (chosen == it.first) Color(0xFF5A5A5A) else secondaryGray)
                    .noRippleClickable {
                        chooseItem(it.first)
                    }
                    .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    it.second, fontSize = 14.sp, fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            }
        }
    }
}