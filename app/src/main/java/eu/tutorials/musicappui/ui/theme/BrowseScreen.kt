package eu.tutorials.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.Card
import eu.tutorials.musicappui.R

@Composable
fun BrowseScreen(){
    val categories = listOf<String>("New Relase", "Favorites", "Top Rated","Rap","Hip Hop","Rock")
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(categories) { cat ->
            BrowserItem(cat = cat,drawable = R.drawable.baseline_apps_24)

        }

    }

}

