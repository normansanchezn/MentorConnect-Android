package dev.normansanchez.designsystem.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.normansanchez.designsystem.R


@Composable
fun IconButtonCustom(
    modifier: Modifier = Modifier,
) {
    var isToggled by rememberSaveable { mutableStateOf(false) }
    IconButton(
        onClick = { isToggled = !isToggled }
    ) {
        Icon(
            painter = if (isToggled) painterResource(R.drawable.favorite_filled) else painterResource(R.drawable.favorite_filled),
            contentDescription = if (isToggled) "Selected icon button" else "Unselected icon button."
        )
    }
}

@Preview
@Composable
fun IconButtonCustomPreview() {
    IconButtonCustom()
}


