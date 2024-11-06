package com.example.urbanaitor.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.Event
//import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.urbanaitor.ui.screen.MapScreen


@Composable
fun BottomNavigationScreen(navController: NavHostController) {
    val navController = rememberNavController()
    var selectedTab by remember { mutableStateOf("map") }

    NavHost(
        navController = navController,
        startDestination = "map",
        modifier = Modifier.fillMaxSize()
    ) {
        composable("map") { MapScreen() }
        composable("search") { SearchScreen() }
        composable("events") { EventsScreen() }
        composable("profile") { ProfileScreen() }
    }

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black
    ) {
        BottomNavigationItem(
            icon = { Icon(Icons.Default.Place, contentDescription = null) },
            label = { Text("Map") },
            selected = selectedTab == "map",
            onClick = {
                selectedTab = "map"
                navController.navigate("map")
            }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Default.Search, contentDescription = null) },
            label = { Text("Search") },
            selected = selectedTab == "search",
            onClick = {
                selectedTab = "search"
                navController.navigate("search")
            }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
            label = { Text("Events") },
            selected = selectedTab == "events",
            onClick = {
                selectedTab = "events"
                navController.navigate("events")
            }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Default.Person, contentDescription = null) },
            label = { Text("Profile") },
            selected = selectedTab == "profile",
            onClick = {
                selectedTab = "profile"
                navController.navigate("profile")
            }
        )
    }
}

@Composable
fun SearchScreen() {
    Text("Search Screen")
}

@Composable
fun EventsScreen() {
    Text("Events Screen")
}

@Composable
fun ProfileScreen() {
    Text("Profile Screen")
}


//
//class BottomNavigationActivity : ComponentActivity() {
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        Mapbox.getInstance(applicationContext, "access_token") // Replace with actual token
//
//        setContent {
//            val navController = rememberNavController()
//            var selectedTab by remember { mutableStateOf("map") }
//
//            NavHost(
//                navController = navController,
//                startDestination = "map",
//                modifier = Modifier.fillMaxSize()
//            ) {
//                composable("map") { MapScreen() }
//                composable("search") { SearchScreen() }
//                composable("events") { EventsScreen() }
//                composable("profile") { ProfileScreen() }
//            }
//
//            BottomNavigation(
//                backgroundColor = Color.White,
//                contentColor = Color.Black
//            ) {
//                BottomNavigationItem(
//                    icon = { Icon(Icons.Default.Place, contentDescription = null) },
//                    label = { Text("Map") },
//                    selected = selectedTab == "map",
//                    onClick = {
//                        selectedTab = "map"
//                        navController.navigate("map")
//                    }
//                )
//                BottomNavigationItem(
//                    icon = { Icon(Icons.Default.Search, contentDescription = null) },
//                    label = { Text("Search") },
//                    selected = selectedTab == "search",
//                    onClick = {
//                        selectedTab = "search"
//                        navController.navigate("search")
//                    }
//                )
//                BottomNavigationItem(
//                    icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
//                    label = { Text("Events") },
//                    selected = selectedTab == "events",
//                    onClick = {
//                        selectedTab = "events"
//                        navController.navigate("events")
//                    }
//                )
//                BottomNavigationItem(
//                    icon = { Icon(Icons.Default.Person, contentDescription = null) },
//                    label = { Text("Profile") },
//                    selected = selectedTab == "profile",
//                    onClick = {
//                        selectedTab = "profile"
//                        navController.navigate("profile")
//                    }
//                )
//            }
//        }
//    }
//
//    @Composable
//    fun SearchScreen() {
//        Text("Search Screen")
//    }
//
//    @Composable
//    fun EventsScreen() {
//        Text("Events Screen")
//    }
//
//    @Composable
//    fun ProfileScreen() {
//        Text("Profile Screen")
//    }
//}
